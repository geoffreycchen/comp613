# p07([[1,2],[3,4]]) = [[1,3],[2,4]]
    
def p07(m):

    return [
            [row[i] for row in m] 
                for i in range(len(m[0]))]
p07([[1,2],[3,4]])