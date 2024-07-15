from dataclasses import dataclass

"""
    Using a context manager and other functional constructs, design a solution that forms a generator of Emp objects from the Emp.db.txt file
"""

@dataclass
class Emp:
    name: str
    id: int
    salary: float



def parse_line(line):
    # Function to parse a line from the file and create an Emp object
    parts = line.split()
    name = parts[0]
    emp_id = int(parts[1])
    salary = float(parts[2])
    return Emp(name, emp_id, salary)




def getEmp(predicate):

    filename = "Emp.db.txt"
    with open(filename, 'r') as file:
        for line in file:
            emp = parse_line(line)

            if predicate(emp):
                yield emp
"""

for i in getEmp(lambda x: x.salary>80000):
    print(i)
"""