import itertools as it
import math as ma

def is_prime(n):
    if n < 2:
        return False
    if n == 2: # by def, 2 is also a prime number
        return True
    return not any(n%i == 0 for i in it.islice(it.count(2),  ma.floor(ma.sqrt(n))))


def the_primes(n): 
    # define a generator function that will take a positive integer n ≥ 2 as input, and will generate all primes less than n.
    return (i for i in range(2,n) if is_prime(i))


print(list(the_primes(1000)))