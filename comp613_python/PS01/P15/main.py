
import functools as ft
# p15(3) = 6
def p15(num):
    
    """
    computes factorial of a nonnegative integer
    """
    if num ==0:
        return 1
    return ft.reduce(lambda x, y:    x*y,    range(1,num+1)) 
