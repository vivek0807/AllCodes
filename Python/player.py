class Player:
    def __init__(self, player_name, no_of_matches):
        self.__points = 0.0
        self.__status_category = ""
        # Fill the code here for initializing the instance variables
        self.__player_name=player_name
        self.__no_of_matches=no_of_matches

    def get_palyer_name(self):
        return self.__player_name

    def set_player_name(self, player_name):
        self.__player_name = player_name

    def get_no_of_matches(self):
        return self.__no_of_matches

    def set_no_of_matches(self, no_of_matches):
        self.__no_of_matches = no_of_matches

    def get_points(self):
        return self.__points

    def set_points(self, points):
        self.__points = points

    def get_status_category(self):
        return self.__status_category

    def set_status_category(self, status_category):
        self.__status_category = status_category

    def calculate_points(self, no_of_matches_won):
        self.__points=(no_of_matches_won/self.__no_of_matches)*100

    def find_status_category(self):
        if(self.__points<=0):
            self.__status_category="Miserable"
        elif self.__points>0 and self.__points<=50:
            self.__status_category="Tolerable"
        elif self.__points>50 and self.__points<=75:
            self.__status_category="Satisfactory"
        elif self.__points>75 :
            self.__status_category="Excellent"
# Fill the code here





