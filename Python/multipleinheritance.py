class Account:
    accountNumber = ""
    holderName = ""
    balance = 0.0

    def __init__(self, accountNumber, holderName, balance):
        self.accountNumber = accountNumber
        self.holderName = holderName
        self.balance=balance




class SavingAccount(Account):
    availableBalance = 0.0
    def __init__(self, accountNumber, holderName, balance):
        self.accountNumber = accountNumber
        self.holderName = holderName
        self.balance=balance
        self.availableBalance=0.0



    def calculateBalance(self, withdrawalAmount):
        if self.balance- withdrawalAmount <500 :
            self.availableBalance = self.balance
        else:
            self.availableBalance=self.balance-withdrawalAmount

        return self.availableBalance

class CurrentAccount(Account):
    availableBalance = 0.0

    def __init__(self, accountNumber, holderName, balance):
        self.accountNumber=accountNumber
        self.holderName=holderName
        self.balance=balance
        self.availableBalance = 0.0

    def calculateBalance(self, withdrawalAmount):
            if self.balance-withdrawalAmount<30000:
                self.availableBalance=30000
            else:
                self.availableBalance=self.balance=withdrawalAmount
            return self.availableBalance

choice=input("1.Savings Account\n2.Current Account\nEnter the choice")
print("Enter the Details")
accno=input("Account Number")
name=input("Holder Name")
bal=float(input("Balance"))
withdraw=float(input("Withdrawal amount"))

if(choice=="1"):
    s_account_obj=SavingAccount(accno,name,bal)
    print("Account Details")
    print(accno)
    print(name)
    print(s_account_obj.calculateBalance(withdraw))
elif choice=="2":
    c_account_obj=CurrentAccount(accno,name,bal)
    print("Account Details")
    print(accno)
    print(name)
    print(c_account_obj.calculateBalance(withdraw))
