public class Employee implements Account{

    private String FirstName;
    private String LastName;

    private String username;
    private String password;


    public void register(String username, String password)
    {
        setUsername(username);
        setPassword(password);
    }
    public boolean login(String username, String password)
    {
        //verifies credentials
        if(this.username.equals(username) && this.password.equals(password))
        {
            System.out.println("Access Allowed");
            return true;
        }else{
            System.out.println("Incorrect Credentials");
            return false;
        }
    }

    //setters
    private void setPassword(String password)
    {
        this. password = password;
    }

    private void setUsername(String username){
        this.username = username;
    }

}
