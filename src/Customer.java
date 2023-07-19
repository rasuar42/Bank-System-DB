public class Customer implements Account{

    private int AccountID;

    private String FirstName;
    private String LastName;

    private String username;
    private String password;

    private int balance = 0;


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

    private void deposit(int balance)
    {
        this.balance = this.balance + balance;
    }

    private void withdraw(int ammount){
        if(ammount > this.balance){
            this.balance = this.balance - ammount;
            System.out.println("Withdrawing: $" + ammount);
        }else {
            System.out.println("Insufficient Funds");
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
