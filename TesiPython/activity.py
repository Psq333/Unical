from explainer import explainer
from client import client


class Activity:
    def __init__(self, machine, job, step, x_min, x_max, y, freq, client_obj):
        self.job = job
        self.machine = machine
        self.step = step
        self.x_min = x_min
        self.x_max = x_max
        self.y = y
        self.freq = freq
        self.client_obj = client_obj

    def activity_dict(self):
        dictio = {"job": self.job, "machine": self.machine, "step": self.step}
        return dictio

    def inside(self, x, y):
        if x is None or y is None:
            return False
        if self.x_min <= x <= self.x_max and self.y - self.freq <= y <= self.y + self.freq:
            print("machine: ", self.machine, " job: ", self.job, " step: ", self.step, " x_min: ", self.x_min,
                  " x_max: ", self.x_max, " y: ",
                  self.y)
            print(self.activity_dict())
            e = explainer(self.activity_dict(), self.client_obj)
            e.openInterface()
            return True
        else:
            return False
