import player


def get_player_details():
    # Fill the code for getting user inputs and creating the card object
    name=input("Enter the Player Name :")
    matches=int(input("Enter the No of Matches Played:"))
    player_obj=player.Player(name,matches)
    return player_obj


player_obj = get_player_details()
no_of_matches_won = int(input("Enter the No of Matches Won:"))

# Fill the code here for invoking the calculate_points() and find_status_category()
player_obj.calculate_points(no_of_matches_won)
player_obj.find_status_category()


print("Status Category:", player_obj.get_status_category())
