
import itertools as it
import math as ma

def is_prime(n):
    if n < 2:
        return False
    if n == 2:
        return True
    return not any(n % i == 0 for i in it.islice(it.count(2), ma.floor(ma.sqrt(n))))

def small_div(n):
    """Find the smallest factor that divides n or return "is prime"."""
    if is_prime(n):
        return "is prime"
    
    smallest_factor = next((i for i in it.islice(it.count(2), ma.floor(ma.sqrt(n))) if n % i == 0), None)
    
    return smallest_factor if smallest_factor is not None else "is prime"

