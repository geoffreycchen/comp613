import functools as ft
def p16(lst):
    """
    uses a reduce to create the reverse list of a finite iterable
    """
    return ft.reduce(lambda x, y: y+x, map(lambda x: [x], lst))
p16([3,4,5])