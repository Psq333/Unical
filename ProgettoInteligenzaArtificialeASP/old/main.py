from platforms.desktop.desktop_handler import DesktopHandler
from specializations.dlv2.desktop.dlv2_desktop_service import DLV2DesktopService
from languages.asp.asp_input_program import ASPInputProgram

handler = DesktopHandler(DLV2DesktopService("C:/Users/Micha/Desktop/IA/Progetto/lib/dlv2.exe"))

program = ASPInputProgram()
program.add_program("a:-b. b. c.")
program.add_program("d:-not e. e.")

handler.add_program(program)

answersets = handler.start_sync()

for a in answersets.get_answer_sets():
    print(a)



