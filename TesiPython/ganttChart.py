import operator

import matplotlib.pyplot as plt
import matplotlib.colors as colors
import matplotlib.image as img

from activity import Activity
from matplotlib.backend_bases import MouseButton

from client import client


lista_activity = []
machines = {}
val_height = 0.5


class ganttChart:
    def __init__(self, machines_input, client_obj: client):
        self.machines_input = machines_input
        self.client_obj = client_obj

    def ganttChart(self):
        cont_machines = 0
        maximum = 0
        color_cont = 2
        fig, ax = plt.subplots(figsize=(9.2, 5))
        ax.invert_yaxis()  # Fa partire le macchina M1 da sopra
        plt.connect('button_press_event', self.on_click)
        colori = {}

        for i in dict(sorted(self.machines_input.items(), key=operator.itemgetter(0))):  # flows jobs
            cnames = list(colors.cnames)
            activities = self.machines_input.get(i)
            print(activities)
            for j in range(0, len(activities)):  # flows activities in i jobs
                activity = self.execute(activities[j])
                print(str(j) + " " + str(activity[0]))
                end_activity = int(activity[2]) + int(activity[3])
                maximum = self.maximum_def(end_activity, maximum)
                cont_machines = self.check_machine(i, cont_machines)
                lista_activity.append(Activity(i, activity[0], activity[1], float(activity[2]), end_activity, machines[i], val_height/2, self.client_obj))
                if activity[0] not in colori:
                    colori[activity[0]] = cnames[color_cont]
                    color_cont += 10
                rects = ax.barh(i, width=float(activity[3]), left=float(activity[2]), height=val_height,
                                color=colori[activity[0]])
                ax.bar_label(rects, label_type='center', fmt=activity[0])

        ax.set_xlim(0, maximum + 10)
        plt.ylabel('Machines')
        plt.xlabel('Steps')
        plt.suptitle("Click on job!")
        plt.show()

    def execute(self, str1):
        return str1.split("_")

    def check_machine(self, machine, cont):
        if machine not in machines:
            machines[machine] = cont
            cont += 1
        return cont

    def maximum_def(self, end_activity, maximum):
        if end_activity > maximum:
            return end_activity
        else:
            return maximum

    def on_click(self, event):
        if event.button is MouseButton.LEFT:
            x, y = event.x, event.y
            for i in lista_activity:
                i.inside(event.xdata, event.ydata)  # for the event

