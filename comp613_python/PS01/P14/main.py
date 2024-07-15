import functools as ft
# p14([1,2,3]) = 3
def p14(lst):
    """
    get the length of an iterable
    """
    return ft.reduce(lambda x, y: x+1, lst, 0) 
p14([1,2,3])