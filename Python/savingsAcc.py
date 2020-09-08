class SavingsAccount:
    username = ""
    password = ""
    balance = 20000.0

    def __init__(self, username, password):
        self.username = username
        self.password = password

    def login(self, username, password):
        if username == self.username and password == self.password:
            self.withdraw(float(input("Enter amount to withdraw")))
            return True
        else:
            print("Invalid Username or password")
            return False

    def withdraw(self, amount):
        if self.balance >= amount:
            print(str(int(amount)) + " is withdrew")
            print(str(int(self.balance - amount)) + " balance amount")
            self.balance = self.balance - amount
        else:
            print("Insufficient funds to withdraw")


sobj = SavingsAccount("vk", "vk")
username = input("Enter your name to Login")
password = input("Enter your name to password")
sobj.login(username, password)
