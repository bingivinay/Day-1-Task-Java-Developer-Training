package Task;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("ACC101", "Rahul Sharma", 50000);
        account1.displayAccountInfo();
        account1.setBalance(-1000);
        account1.displayAccountInfo();
    }
}
