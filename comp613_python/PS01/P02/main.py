# p02([1,"abc",7.2],["abc", 19, 3.14e15]) = ["abc"]
def p02(lst1, lst2):
    
    return [i for i in lst1 if i in lst2 ]
p02([1,"abc",7.2],["abc", 19, 3.14e15])