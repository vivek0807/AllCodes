Age=int(input("Enter the age:"))
if(Age<18 or Age>100):
    print("Invalid Age")
    exit()
income=int(input("Enter the income:"))
if(income<0):
    print("Invalid Income")
    exit()
tax=0

if Age <=60 and income<= 250000:
    tax=0
elif Age <=60  and income>250000  and income<=  500000:
    tax=10
elif Age <=60  and income>500000  and income<=  1000000 :
    tax=20
elif Age <=60  and income > 1000000:
    tax=30
elif Age >60 and Age<=80  and income<= 300000:
    tax=0
elif Age >60 and Age<=80 and income > 300000 and income <=500000 :
    tax=10
elif Age >60 and Age<=80 and  income > 500000 and income <=1000000 :
    tax=20

elif Age >60 and Age<=80 and income>1000000 :
    tax=30

elif Age >80 and income<= 500000:
    tax=0
elif Age >80 and income > 500000 and income <=1000000:
    tax=20
elif Age >80  and Age<=100 and income >1000000 :
    tax=30


print("The Tax amount is: {:.2f}".format(income*tax*0.01))



