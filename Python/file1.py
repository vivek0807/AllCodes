n=int(input("Enter number of students:"))
with open('output_data.txt','w')as file:
    for i in range(0,n):
        print("For student"+str(i+1))
        name=input("Enter name:")
        score=input("Enter the score")
        data="Name:"+name+ " Score: "+score+"\n"
        file.write(data)
