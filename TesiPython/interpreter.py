
class interpreter:
    def __init__(self, stringa):
        self.stringa = stringa

    def convertitore(self):
        self.stringa = ''.join(self.stringa.split())
        split = self.stringa.split(".")
        dict = {}
        for i in split:
            if "assignment" in i:
                key, value = self.spacchetta_assignment(i)
                if key not in dict.keys():
                    dict[key] = {"job": "", "step": "", "machine": "", "start": "", "pro": ""}
                dict[key]["job"] = value[0]
                dict[key]["step"] = value[1]
                dict[key]["machine"] = value[2]
                dict[key]["pro"] = value[3]

            elif "start_time" in i:
                key, value = self.spacchetta_starttime(i)
                if key not in dict.keys():
                    dict[key] = {"job": "", "step": "", "machine": "", "start": "", "pro": ""}
                dict[key]["job"] = value[0]
                dict[key]["step"] = value[1]
                dict[key]["start"] = value[2]
        return dict

    def spacchetta_assignment(self, stringa):
        parentesi1 = stringa.find("(")
        parentesi2 = stringa.find(")")
        valori = stringa[parentesi1+1:parentesi2].split(",")
        key = valori[0]+","+valori[1]
        return key, valori

    def spacchetta_starttime(self, stringa):
        stringa = stringa.replace("(", "")
        stringa = stringa.replace(")", "")
        stringa= stringa.replace("start_time", "")
        valori = stringa.split(",")
        key = valori[0] + "," + valori[1]
        return key, valori

    def conversion_string_dict(self):
        dict = self.convertitore()
        dict_gantt = {}
        cont = 0
        print(dict)
        for i in dict.values():
            if i["machine"] not in dict_gantt.keys():
                dict_gantt[i["machine"]] = []
            if i["start"] == "":
                i["start"] = "20"
            dict_gantt[i["machine"]].append(i["job"] + "_" + i["step"] + "_" + i["start"] + "_" + i["pro"] + "_")
            print("-"+str(i)+"-")
        print(dict_gantt)
        return dict_gantt


