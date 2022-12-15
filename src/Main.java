public class Main {
    //customer name, customer account number,
    //customer email, balance, phone number
    //Deposit Money, Withdraw Money
    public static void main(String[] args) {
        Account NiveditaAccount = new Account("12345", 0.0,"Nivedita",
                "nivedita@gmail.com", "45367890");
        NiveditaAccount.DepositedMoney(100);
        NiveditaAccount.DepositedMoney(300);
        NiveditaAccount.WithDraw(200);

    }
}
