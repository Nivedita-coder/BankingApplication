import javax.swing.*;

public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;

    public Account(String Number, double Balance, String Name, String Email, String PhoneNumber){
        this.Number = Number;
        this.Balance = Balance;
        this.Number = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    public void DepositedMoney(double DepositedMoney){
        this.Balance += DepositedMoney;
        System.out.println("Deposit is successful, and the balance is: " + this.Balance);
    }

    public void WithDraw(double WithDraw){
        if (this.Balance - WithDraw <0){
            System.out.println("Withdraw unsuccessful only "+ this.Balance+ " left");
        } else {
            this.Balance -= WithDraw;
            System.out.println("Withdraw is successful, Current balance is: " + this.Balance);
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
