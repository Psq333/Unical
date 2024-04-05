from tkinter import *
import tkinter as tk


class showAnswer(Toplevel):
    def __init__(self, answer, ask_show):
        self.ask_show = ask_show
        self.root = tk.Toplevel()
        self.root.grab_set()
        self.root.resizable(0, 0)
        self.root.minsize(400,150)
        self.root.title("Show Answer")
        self.frame = Frame(self.root)
        self.root.protocol("WM_DELETE_WINDOW", self.on_closing)
        self.answer = answer

    def show(self):
        Label(self.frame, text=self.answer).pack()
        self.frame.pack(expand=True)
        self.root.mainloop()

    def on_closing(self):
        self.ask_show.grab_set()
        self.root.destroy()