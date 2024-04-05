from languages.predicate import Predicate

class Matrice:

    def __init__(self, field, n, m):
        self.field = field
        self.n = n
        self.m = m

    def toString(self):

        string = ""

        for i in range(0, self.n):
            for j in range(0, self.m):
                valore = self.field[i][j]
                string += "c(" + str(i) + "," + str(j) + "," + str(valore) + "). "
        
        string += "n(" + str(self.n) + "). m(" + str(self.m) + ")."
        
        return string


    


