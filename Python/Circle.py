class Circle:
    __radius=0.0
    __color=""

    def __init__(self,radius,color):
        self.__radius=radius
        self.__color=color

    def get_radius(self):
        return self.__radius
    def get_color(self):
        return self.__color
    def set_radius(self,radius):
        self.__radius=radius
    def set_color(self,color):
        self.__color=color
    def calculate_area(self):
        return self.__radius**2*3.14
    def calculate_perimeter(self):
        return 3.14*self.__radius*2

def check_validity(my_radius,my_color):
    if(my_radius<=0):
        print("Invalid Radius")
        return False
    else:
        return Circle(my_radius,my_color)


my_radius=float(input("Enter the radius of the circle:"))
my_color=input("Enter the color of the circle:")

circle_obj=check_validity(my_radius,my_color)
if(type(circle_obj)==Circle):
    print("Area is:",circle_obj.calculate_area())
    print("Perimeter is:",circle_obj.calculate_perimeter())
