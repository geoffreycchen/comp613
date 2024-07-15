from collections import namedtuple

Trinket = namedtuple("Trinket", "Name Color Price")

Trinket_data = [
    Trinket('name1', 'red', 25),
    Trinket('name2', 'yellow', 10),
    Trinket('name1', 'blue', 17)]

def p18(trinkets):
    return sorted(trinkets, key=lambda trinket: trinket.Price)

