import copy
n=int(input("No of Residents :"))
if(n<=0):
    print("Invalid")
    exit()
db=[]
sets={}
for i in range(0,n):
    print("Resident",i+1)
    sets['Name']=input("Name :")
    age=int(input("Age :"))
    if(age<21 or age >58):
        print("Invalid")
        exit()
    sets['Age']=age
    sets['Designation']=input("Designation :")
    band=input("Band :")
    if(band<'A' or band>'D'):
        print("Invalid")
        exit()
    sets['band']=band
    db.append(copy.deepcopy(sets))



print("('NAME','AGE','DESIGNATION','BAND')")

for d in db:
    s=tuple(d.values())
    print(s)
band=input("Enter your band of interest :")
new=[]
for d in db:
    if (d['band']==band):
        new.append(d.values())

print("('NAME', 'AGE', 'DESIGNATION', 'BAND')")
if(len(new)==0):
    print("No resident under this band")
else:
    for d in new:
        d=tuple(d)
        print(d)