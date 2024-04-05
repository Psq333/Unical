from tkinter import *
from tkinter.ttk import *
import tkinter as tk
from client import client
from showAnswer import showAnswer


class ask_showCore_interface(Toplevel):
    def __init__(self, dictio, informazioni, client_obj: client):
        self.atomo = None
        self.d = dictio
        self.informazioni = informazioni
        self.client_obj = client_obj
        self.root = tk.Toplevel()
        self.root.grab_set()
        self.root.geometry("650x150")
        self.root.title(self.informazioni["titolo"])
        self.root.resizable(0, 0)
        self.root.protocol("WM_DELETE_WINDOW", self.on_closing)
        self.frame = Frame(self.root)

    def on_closing(self):
        #self.client_obj.comunication("3\n")
        self.root.destroy()

    def interface(self):
        stringa = self.informazioni["contenuto_messaggio"]
        Label(self.frame, text=stringa).grid(row=0, columnspan=3, padx=10, pady=20)
        Button(self.frame, text=self.informazioni["uno"]["button"], command=lambda: self.function_1()).grid(row=1, column=0, padx=5)
        Button(self.frame, text=self.informazioni["due"]["button"], command=lambda: self.function_2()).grid(row=1, column=1, padx=5)
        Button(self.frame, text=self.informazioni["tre"]["button"],  command=lambda: self.function_2()).grid(row=1, column=2, padx=5)
        self.frame.pack(expand=True)
        self.root.mainloop()

    def function_1(self):
        #showAnswer(self.client_obj.comunication(self.informazioni["uno"]["command"]), self.root).show()
        showAnswer("Atoms is in the solution",self.root).show()

    def function_2(self):
        #showAnswer(self.client_obj.comunication(self.informazioni["due"]["command"]), self.root).show()
        showAnswer("Atoms is in the solution", self.root).show()

    def function_3(self):
        #showAnswer(self.client_obj.comunication(self.informazioni["tre"]["command"]), self.root).show()
        showAnswer("Atoms is in the solution", self.root).show()


