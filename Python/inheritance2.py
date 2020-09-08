class Person:
    name=""
    age=""
    def __init__(self,name,age):
        self.name=name
        self.age=age
       

class Student(Person):
    regno=""
    percentage=""
    def __init__(self,regno,percentage,name,age):
        self.regno=regno
        self.percentage=percentage
        super().__init__(name,age)

    def display(self):
        print("Name:"+self.name)
        print("Age:"+self.age)
        print("Rollno:"+self.regno)
        print("Percentage:"+self.percentage)



name=input("Enter the student name:")
age=input("Enter the student age:")
regno=input("Enter the student rollno:")
percentage=input("Enter the student percentage:")

student_obj=Student(regno,percentage,name,age)
student_obj.display()
