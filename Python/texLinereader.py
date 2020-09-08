def divide_group(my_data):
    odd_group=[]
    even_group=[]
    i=0
    for lines in my_data:
        if i%2==0:
            odd_group.append(lines)
        else:
            even_group.append(lines)
        i+=1
    return odd_group,even_group

with open("data.txt","r") as f:
    my_data=f.readlines()
    odd_group,even_group=divide_group(my_data)
    print("Odd Group statements:")
    for line in odd_group:
        print(line)
    print("Even Group statements:")
    for line in even_group:
        print(line)
