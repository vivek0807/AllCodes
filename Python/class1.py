class Book:
    __book_name=""
    __book_price=0.0
    __author_name=""
    def __init__(self,book_name,book_price,author_name):
        self.__book_name=book_name
        self.__author_name=author_name
        self.__book_price=book_price
    def get_book_name(self):
        return self.__book_name

    def get_book_price(self):
        return self.__book_price

    def get_author_name(self):
        return self.__author_name
    def set_book_price(self,new_price):
        self.__book_price=new_price

book_name=input("Enter the book name:")
book_price=float(input("Enter the book price:"))
author_name=input("Enter the author name:")
book_obj=Book(book_name,book_price,author_name)
print("Book details before price renewal:")
print("Book Name: "+book_obj.get_book_name())
print("Book Price:",book_obj.get_book_price())
print("Author Name: ",book_obj.get_author_name())

new_price=float(input("Enter the new price:"))
book_obj.set_book_price(new_price)
print("Book details after price renewal:")
print("Book Name: "+book_obj.get_book_name())
print("Book Price:",book_obj.get_book_price())
print("Author Name: "+book_obj.get_author_name())