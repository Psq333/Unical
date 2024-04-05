import time
from socket import *
serverName = '0.tcp.eu.ngrok.io'
serverPort = 10136


class client:
    def __init__(self):
        pass
        #self.clientSocket = socket(AF_INET, SOCK_STREAM)
        #self.clientSocket.connect((serverName, serverPort))

    def comunication(self, stringa):
        print("---------"+stringa)
        x = self.clientSocket.send(stringa.encode())
        time.sleep(1)
        message = self.clientSocket.recv(4096)
        print(message.decode())
        return message.decode()

    def chiudi_connessione(self):
        self.clientSocket.close()

    #def isConnect(self):
      #  self.clientSocket.


