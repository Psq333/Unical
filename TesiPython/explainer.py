from tkinter import *

from ask_showCore_interface import ask_showCore_interface
from client import client
import tkinter as tk

from tkinter.ttk import *


class explainer(Toplevel):
    def __init__(self, dictio,  client_obj: client):
        self.d = dictio
        self.client_obj = client_obj
        self.root = tk.Toplevel()
        self.root.grab_set()
        self.root.geometry("450x350")
        self.root.resizable(0, 0)
        self.root.title("Explainer")
        self.frame = Frame(self.root)
        self.root.after(1, lambda: self.root.focus_force())
        self.atomo = "assign(" + self.d["job"] + "," + self.d["step"] + "," + self.d["machine"] + ")"



    def openInterface(self):
        stringa = "You select activity: \n" \
                    "- job: " + self.d["job"] + "\n " \
                    "- step" + self.d["step"] + "\n " \
                    "- machine: " + self.d["machine"]

        Label(self.frame, text=stringa).grid(row=0, columnspan=3, padx=10, pady=20)
        Button(self.frame, text="Ask",  command=lambda:self.ask_interpreter()).grid(row=1, column=0, padx=10)
        Button(self.frame, text="Show Core", command=lambda: self.showCore_interpreter()).grid(row=1, column=1, padx=10)

        self.frame.pack(expand=True)
        self.root.grab_set()
        self.root.mainloop()

    def ask_interpreter(self):
        dict_ask = {
            "titolo": "Ask",
            "contenuto_messaggio": "Should '" + self.atomo + "' be in the solution?",
            "uno": {
                "button": "Yes",
                "command": "1_" + self.atomo + "_ask_y\n"
            },
            "due": {
                "button": "No",
                "command": "1_" + self.atomo + "_ask_n\n"
            },
            "tre": {
                "button": "I don't know",
                "command": "1_" + self.atomo + "_ask_u\n"
            },
        }
        ask_showCore_interface(self.d, dict_ask, self.client_obj).interface()

    def showCore_interpreter(self):
        dict_showCore= {
            "titolo": "Show Core",
            "contenuto_messaggio": "Show Core",
            "uno": {
                "button": "Display Literals",
                "command": "1_" + self.atomo + "_show core_l\n"
            },
            "due": {
                "button": "Ground rules",
                "command": "1_" + self.atomo + "_show core_g\n"
            },
            "tre": {
                "button": "Non-ground rules",
                "command": "1_" + self.atomo + "_show core_n\n"
            },
        }
        ask_showCore_interface(self.d, dict_showCore, self.client_obj).interface()
