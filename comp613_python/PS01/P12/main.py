# p12({"Al":95, "Bob":82, "Charlie":77, "Diana":58}) = {"Al":A, "Bob":B, "Charlie":C, "Diana": F}

def p12(dic):
    return { k: "A" if v>=90  
            else "B" if  v>=80 
            else "C" if  v>=70
            else "D" if  v>=60
            else "F" 
            for k,v in dic.items()}
p12({"Al":95, "Bob":82, "Charlie":77, "Diana":58})