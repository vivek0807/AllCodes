import copy
db=[]
n=int(input("Enter the no of student details to be created :\n"))
temp={}
for i in range(0,n):
    temp["Name"]=input("Name: ")
    age=int(input("Age: "))
    if(age>20 or age<=10):
        print("Invalid Input")
        exit()
    temp["Age"]=age

    temp["Location"]=input("Location: ")
    db.append(copy.deepcopy(temp))
print("Here's the list of student details :")
for d in db:
    print(d)

loc=input("Enter the training location:")
locs=[]
for a in db:
    if a.get("Location")==loc:
        locs.append(a.get("Name"))

if (len(locs)==0):
    print("Invalid location")
else:
    for n in locs:
        print(n)