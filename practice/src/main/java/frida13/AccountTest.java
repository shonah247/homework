package frida13;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("shonah", 8000);
        account1.withdrawPay (8001);

        Account account2 = new Account("shonah", 8000);
        account2.depositPay(-50);


        System.out.println(account1);
        System.out.println(account2);
    }
}
