from ganttChart import ganttChart
from interpreter import interpreter
from client import client

stringa = "start_time((J1,1),10).assignment(J1,1,M1,20)." \
          "start_time((J1,2),35). assignment(J1,2,M1,20)."\
          "start_time((J2,2),10). assignment(J2,2,M3,5)." \
          "start_time((J2,3),20). assignment(J2,3,M2,20)." \
          "start_time((J3,1),50). assignment(J3,1,M3,15)." \
          "start_time((J3,2),30). assignment(J3,2,M4,38). job"

c = client()
#stringa = c.comunication("0\n")
print(stringa)

i = interpreter(stringa)
dict = i.conversion_string_dict()
#print(dict)

ganttChart(dict, c).ganttChart()

#0
#1_assign(1,1,1)_ask_y
#2_assign(1,1,1)_showCore_g
#3