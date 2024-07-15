
import math as ma
from typing import * 
def distance(point1:tuple[float|int] ,point2: tuple[float|int] )-> float:
    return ma.sqrt((point2[0]-point1[0])**2 + (point2[1]-point1[1])**2)


res=distance((5,6.5),(8.6,7))
print(res)