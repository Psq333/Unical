from platforms.desktop.desktop_handler import DesktopHandler
from specializations.dlv2.desktop.dlv2_desktop_service import DLV2DesktopService
from languages.asp.asp_input_program import ASPInputProgram
from base.option_descriptor import OptionDescriptor

class UtilityDLV:

    def __init__(self):
        self.fatti = ""
        self.regole = ""
        
        self.handler = DesktopHandler(DLV2DesktopService("../Progetto/lib/dlv2.exe"))

        self.programVariable = ASPInputProgram()
        self.programFixed = ASPInputProgram()
        self.programFixed.add_files_path("regole.txt")
        self.handler.add_program(self.programFixed)
        self.handler.add_program(self.programVariable)

    def getSoluzione(self):
        answersets = self.handler.start_sync()

        for a in answersets.get_optimal_answer_sets():
            #print(str(a))
            return int(self.getColonna(str(a)))

    def getColonna(self, scelta):
        return scelta[11]

    def trasferisciInDLV(self):
        self.programVariable.clear_all()
        self.programVariable.add_program(self.fatti)
        
    def setFatti(self, matrice, blocco):
        self.fatti = matrice
        self.fatti +=  "b(" + str(blocco) + ")."
        #print("Fatti: " + self.fatti)
   




