# p06(["foo", "bar", "is", "four"]) = ["is", "four"]

def p06(lst):
    return [i for i in lst if len(i) %2 ==0]
p06(["foo", "bar", "is", "four"])


print("test")
