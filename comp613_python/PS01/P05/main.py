# p05([-1,2,-3,4,-5] = [1,3,5]
def p05(lst):
    return [abs(i)for i in lst if i < 0]
p05([-1,2,-3,4,-5])