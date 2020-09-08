def is_leap(year):
    if (year % 4) == 0:
        if (year % 100) == 0:
            if (year % 400) == 0:
                return  True
            else:
                return False
        else:
            return True
    else:
        return False


def month_name(no):
    months={1: "January",
        2: "February",
        3: "March",
        4: "April",
        5: "May",
        6: "June",
        7: "July",
        8: "August",
        9: "September",
        10: "October",
        11: "November",
        12: "December"}
    return months.get(no)

def  days_in_month(month,year):
    months = {1: "31",
              2: "28",
              3: "31",
              4: "30",
              5: "31",
              6: "30",
              7: "31",
              8: "31",
              9: "30",
              10: "31",
              11: "30",
              12: "31"}
    if(is_leap(year)==True and month==2):
            return 29
    else:
            return months.get(month)


year=int(input("Enter year as 4 digits (e.g: 2002):"))
month=int(input("Enter month number:"))
print("Year:",end=" ")
if(is_leap(year)):
    print("Leap Year")
else:
    print("Not Leap Year")
print("Month Name: "+str(month_name(month)))
print("Days in month: "+str(days_in_month(month,year)))