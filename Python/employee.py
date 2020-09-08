class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def get_name(self):
        return self.name

    def get_age(self):
        return self.age


class Student(Person):
    def __init__(self, name, age, regno, percentage):
        self.regno = regno
        self.percentage = percentage
        Person.__init__(self, name, age)

    def get_regno(self):
        return self.regno

    def get_percentage(self):
        return self.percentage

    def display(self):
        print("Name:" + self.get_name() + "\nAge:" + str(self.get_age()) + "\nRollno:" + str(
            self.get_regno()) + "\nPercentage:" + str(self.get_percentage()))


name = input("Enter the student name:\n")
age = int(input("Enter the student age:\n"))
regno = int(input("Enter the student rollno:\n"))
percentage = float(input("Enter the student percentage:\n"))

student_obj = Student(name, age, regno, percentage)

student_obj.display()