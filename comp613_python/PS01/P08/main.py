# p08(["foo",9],[7,"BOOM!"]) = {"foo" : 7, 9 : "BOOM!"}
def p08(lst1, lst2):
    return { k: v for k,v in list(zip(lst1,lst2))}
p08(["foo",9],[7,"BOOM!"])