from dataclasses import dataclass
from typing import Optional, List
import itertools as it

@dataclass
class Persoanl:
    name: str
    age: int
    city: str
    parent: Optional['Persoanl'] = None

def all_age(input: List[Persoanl]) -> int:
    """
     returns the sum of all of the ages
    """
    return ( sum(x.age for x in input))

"""

p1=Persoanl('d',12,'n',None)
p2=Persoanl('c',14,'y',None)

p3=Persoanl('g',2,'ne', p1)
p4=Persoanl('h',1,'ye', p2)

print(all_age([p1,p2]))
"""