import itertools as it 
def takeuntil(predicate, iterable):
    """
    takeuntil(predicate, iterable), returns a generator
    takeuntil itertool will create a generator that takes elements from the iterable until the predicate is true. 
    When the predicate is true, the iteration is halted.
     
    for i in  iterable:
        if not predicate(i):
            yield i
        else:
            break
    """
    return it.takewhile(lambda x: not predicate(x), iterable)



"""
l1 = [1,2,4,6,4,2,1]
p = list(takeuntil(lambda x: x>5, l1))
print(p)

s1 = "Python is dynamically typed"
p = takeuntil(lambda x: x==" ", s1)
print("".join(p))

p = takeuntil(lambda x: len(x)==5, s1.split())
print(" ".join(p))

"""