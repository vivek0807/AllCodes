class Person:
    name=""
    age=0.0
    dept=""

    def __init__(self,name,age,dept):
        self.name=name
        self.age=age
        self.dept=dept

class Student:
    sid=""

    def __init__(self,sid):
        self.sid=sid

class Faculty:

    fid=""

    def __init__(self,fid):
        self.fid=fid

class StudentMember(Person,Student):

    def __init__(self,name,age,dept,sid):
        Person.__init__(self,name,age,dept)
        Student.__init__(self,sid)



    def display(self):
        print("Student Details")
        print(self.name)
        print(self.age)
        print(self.dept)
        print(self.sid)

class FacultyMember(Person,Faculty):
    def __init__(self,name,age,dept,sid):
        Person.__init__(self,name,age,dept)
        Faculty.__init__(self,sid)



    def display(self):
        print("Faculty Details")
        print(self.name)
        print(self.age)
        print(self.dept)
        print(self.fid)



choice=input("1.Student member\n2.Faculty member\nEnter the choice")
name=input("Enter the Details:\nName")
age=input("Age")
dept=input("Department")
id=input("Id")
if(choice=="1"):
    s_account_obj=StudentMember(name,age,dept,id)
    s_account_obj.display()
elif(choice=="2"):
    f_account_obj = FacultyMember(name, age, dept, id)
    f_account_obj.display()