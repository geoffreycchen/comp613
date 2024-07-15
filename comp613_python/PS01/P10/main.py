#p10(["foo","bar","I","k"]) = {'foo':2, 'bar':1, 'I':1, 'k':0}
def p10(lst):
    
    temp =  { word : {letter: word.count(letter) for letter in word if letter in "aeoiuAEOIU"} for word in lst }
    return { k:sum(v.values()) for k,v in temp.items() }

p10(["foo","bar","I","k"]) 