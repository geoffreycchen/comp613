# p11(["foo",1,2,True,"foo",2,3,True]) = {"foo" : 2, 1 : 1, 2 : 2, True : 2, 3 : 1}
def p11(lst):

    '''
    The function creates a dictionary that has
    the elements that appear in the list as keys and 
    the number of times the element appears as the value.
    '''
    return {i : lst.count(i) for i in lst }
