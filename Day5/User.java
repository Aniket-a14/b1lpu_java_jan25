package Day5;

public class User {
    private String name;
    private String phnNo;
    private String acctNo;
    private double balance;
    public User(){
        System.out.println("default");
    }
    public User(String  name, String acctNo){
        this.acctNo = acctNo;
        this.name = name;
    }
    // getters
    public String getName(){
        return name;
    }
    public String getPhnNo(){
        return phnNo;
    }
    public String getAccNo(){
        return acctNo;
    }
    public double getBalance(){
        return balance;
    }

    // Setter
    public void setPhnNo(String phnNo){
        this.phnNo = phnNo;
    }
    public  void setBalance(double balance){
        this.balance = balance;
    }

    public static void main(String[] args) {
        // Default constructor
        User user1 = new User();
        user1.setBalance(0.0);
        
        
        User user2 = new User("John Doe", "123456789");

        // Set details
        user2.setPhnNo("9876543210");
        user2.setBalance(1000.50);

        // Print details
        System.out.println("Name: " + user2.getName());
        System.out.println("Phone Number: " + user2.getPhnNo());
        System.out.println("Account Number: " + user2.getAccNo());
        System.out.println("Balance: " + user2.getBalance());
    }
}
