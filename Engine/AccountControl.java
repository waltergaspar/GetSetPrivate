package Engine;

public class AccountControl {
    private int accountNumber;
    private String holderName;
    private double balance;

    public AccountControl(){
    }
    public AccountControl(int accountNumber, String holderName){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public AccountControl(int accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
    }

    public double deposit(double deposit){
        return this.balance += deposit;
    }

    public double draw(double draw){
        double tax = 5.00;
        return this.balance -= draw + tax;

    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public String toString() {
        return "Update data: \n" +
                "Account: "
                + accountNumber
                + ", Holder: "
                + holderName
                + ", Balance: "
                + String.format("%.2f", balance);
    }
}
