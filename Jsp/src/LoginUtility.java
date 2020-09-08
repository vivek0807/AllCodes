public class LoginUtility {
    public boolean logger(LoginModel loginModel){
        if(loginModel.getUsername().equals("user")&&loginModel.getPassword().equals("user"))
            return true;
        else
            return false;
    }
}
