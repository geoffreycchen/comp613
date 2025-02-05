from dataclasses import dataclass
from typing import  Optional



@dataclass
class People:
    firstname: str
    lastname: str
    father: Optional['People'] = None
    mother: Optional['People'] = None

def grandparent_of(p1: People, p2: People) -> bool:
    """"
    return True if p1 is a grandparent of p2.
    """
    return any([p2.father and p2.father.father is p1,
                p2.father and p2.father.mother is p1, 
                p2.mother and p2.mother.father is p1, 
                p2.mother and p2.mother.mother is p1 ])

pr0 =People("deng","feng",None, None)
pr1 =People("liu","dong", pr0, None) # grand parent
pr2 =People("du","xin",pr1, None) #mid level 
pr3 =People("d","f",pr2, None) #grand child
pr4 =People("deng","feng",None, None)

print(grandparent_of(pr1,pr3))
print(grandparent_of(pr0,pr4))