# p13({'a': {'b': 1, 'c': 2}, 'd': 3}) =  {'a_b': 1, 'a_c': 2, 'd': 3}

def p13(dic):
    nested = { k1+"_"+k2: v2  for k1, v1 in dic.items()  if isinstance(v1, dict)  for k2, v2 in v1.items()  } 
    not_nested = {k1: v1 for k1, v1 in dic.items() if not isinstance(v1, dict)  }
    nested.update(not_nested)
    return nested
p13({'a': {'b': 1, 'c': 2}, 'd': 3})