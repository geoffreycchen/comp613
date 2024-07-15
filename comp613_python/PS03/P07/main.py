from dataclasses import dataclass

@dataclass
class BankAcc:
    balance: float


class InsufficientBalanceError(Exception):
    "Raised when ther is insufficient blance"
    pass

class NegativeAmountError(Exception):
    "Raised when user tries to withdraw a negative amount "
    pass


def ba_withdraw(ba: BankAcc, amt:float) -> BankAcc:
    try:
        if amt > ba.balance:
            raise InsufficientBalanceError
        if amt < 0:
            raise NegativeAmountError

        ba.balance - amt

            
    except InsufficientBalanceError:
        print("not enought money for the current transaction")
    except NegativeAmountError:
        print("you enter a negative amount")
    except Exception as e:
        print(e)
    else:
        ba.balance = ba.balance - amt
        print(ba.balance)
        return ba
    finally:
        print("done with current transaction")


account = BankAcc(balance=160.0)
new_account = ba_withdraw(account, 56)


