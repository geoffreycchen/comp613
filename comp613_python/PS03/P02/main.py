from dataclasses import dataclass
from typing import  Optional



@dataclass
class People:
    firstname: str
    lastname: str
    father: Optional['People'] = None
    mother: Optional['People'] = None

def siblings(person1: People, person2 : People) -> bool:
    """
    returns True if both people have the same parents
    need to make sure that person1's father and mother are given
    """
    return any([person1.father and person1.father == person2.father,
               person1.mother and person1.mother == person2.mother])
pr0 =People("deng","feng",None, None)
pr1 =People("liu","dong", pr0, None) # grand parent
pr2 =People("du","xin",pr1, None) #mid level 
pr3 =People("d","f",pr2, None) #grand child
pr4 =People("deng","feng",pr1, None)


print(siblings(pr2, pr4))
print(siblings(pr0, pr3))
print(any([None and True]))