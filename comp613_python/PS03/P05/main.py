from dataclasses import dataclass

@dataclass
class Emp:
    name: str
    id: int
    salary: float

def parse_line(line):
    parts = line.split()
    name = parts[0]
    emp_id = int(parts[1])
    salary = float(parts[2])
    return Emp(name, emp_id, salary)

def getEmp(predicate):
    filename = 'Emp.db.txt'
    with open(filename, 'r') as file:
        for line in file:
            emp = parse_line(line)
            if predicate(emp):
                yield emp

def sum_sal(predicate):
    total_salary = 0.0
    for emp in getEmp(predicate):
        total_salary += emp.salary
    return total_salary