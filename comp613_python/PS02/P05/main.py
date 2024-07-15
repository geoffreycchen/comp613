import itertools as it 
def comb_len(lst, lngth):
    """
    returns a list of all combinations of elements from a given set lst that have a fixed length lngth.
    returns a list of sets. Each set is a combination drawn from lst


    return [set(comb) for comb in it.combinations(lst, lngth)]
    """
    if lngth ==0:  # Base case
        return [set()]
    elif lngth ==1:   # Base case: each element in lst is a combination of length 1
        return [{i} for i in lst ]
    else:
        return [set([lst[i]]) | comb for i in range(len(lst)) for comb in comb_len(lst[i+1:], lngth -1)   ]


# print(comb_len(["apple", "banana", "peach", "kiwi", "apricot"],2))