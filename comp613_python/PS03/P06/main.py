import numbers


def divide_numbers(num: float, denom: float)-> float: 

    try:

        if not isinstance(num, numbers.Number) and not isinstance(denom, numbers.Number):
            raise ValueError
        else:
            return num/denom      
    
    except ZeroDivisionError:
        print("My 0-Div Exception")
    except ValueError as e:
        print(e)
    except Exception as e:
        print(e)
    else:
        return num/denom    
    finally:
        print("done")

divide_numbers(7,"we")

