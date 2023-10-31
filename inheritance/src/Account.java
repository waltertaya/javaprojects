class BankAccount{
    int acNo;
    String acName, acPhone, acEmail;
    double acBal;
    public BankAccount(int acNo, String acName, String acPhone, String acEmail, double acBal){
        this.acNo = acNo;
        this.acBal = acBal;
        this.acEmail = acEmail;
        this.acName = acName;
        this.acPhone = acPhone;
    }
    public void accountholder(){
        System.out.println("Account Number :" + acNo);
        System.out.println("Account Holder Name :" + acName);
        System.out.println("Account Holder Phone :" + acPhone);
        System.out.println("Account Holder Address :" + acEmail);
        System.out.println("Account Holder Balance :" + acBal);
    }
}
class SavingsAccount extends BankAccount {
    public void saving() {
        System.out.println("SAVINGS ACCOUNT DETAILS");
    }
    public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double acBal) {
        super(acNo, acName, acPhone, acEmail, acBal);
    }
    public void deposit(double amount){
        acBal += amount;
        System.out.println("Deposited: $" + amount);
    }
    public void displayBalance(){
        System.out.println("Account Number: " + acNo + "Balance: $" + acBal);
    }
}
class CurrentAccount extends BankAccount {
    public void current() {
        System.out.println("CURRENT ACCOUNT DETAILS");
    }
    public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double acBal) {
        super(acNo, acName, acPhone, acEmail, acBal);
    }
    public void deposit(double amount){
        acBal += amount;
        System.out.println("Deposited: $" + amount);
    }
    public void displayBalance(){
        System.out.println("Account Number: " + acNo + "Balance: $" + acBal);
    }
}

public class Account {
    public static void main(String[] args) {
        SavingsAccount save = new SavingsAccount(1001, "Ann Kamau","07200000","test@gmail.com",1000);
        CurrentAccount current = new CurrentAccount(1001, "Peter Smith","08100000","admin@gmail.com",0.0);
        save.saving();
        save.accountholder();
        save.deposit(500);
        save.displayBalance();
        System.out.println("");
        current.current();
        current.accountholder();
        current.deposit(300);
        current.displayBalance();
    }
}