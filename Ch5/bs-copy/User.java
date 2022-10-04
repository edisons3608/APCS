
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User
{
    // instance variables - replace the example below with your own
    private int passwordChange;
    private String username;
    private String password;
    public User(){
        username = "edison";
        password = "A2345678";
        passwordChange = 0;
    }
    public User(String username, String password){
        this.username = username;
        this.password = password;
        passwordChange = 0;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public int getPasswordChange(){
        return passwordChange;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
        passwordChange = 0;
    }
    public void setPasswordChange(int passwordChange){
        this.passwordChange = passwordChange;
    }
    public void advanceDay(){
        passwordChange += 1;
    }
    public boolean isValidUsername(){
        //System.out.println(username.substring(username.length()-4));
        return username.indexOf("@") > 0 && username.substring(username.length()-4).equals(".com");
    }
    public boolean isValidPassword(){
        return (password.charAt(password.length()-1) >= 48 && password.charAt(password.length()-1) <= 57) && password.length() == 8 && (password.charAt(0) >= 65 && password.charAt(0) <= 90);
    }
    public boolean checkPassword(){
        return !(passwordChange > 180) == true;
    } 
    

}
