package frida13;

public class Account {
    public String customerName;
    public int accountBalance;


    public Account(String customerName, int accountBalance) {
        ;
        this.customerName = customerName;
        this.accountBalance = accountBalance;

    }

    public void withdrawPay(int withdrawAmount ) {
        if(withdrawAmount > accountBalance) {
            System.out.println("Insufficient Funds");
        }else {
        System.out.println( accountBalance - withdrawAmount);}

    }
    public void depositPay( int depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("nope");
        }else {
        System.out.println(accountBalance + depositAmount);}


    }

    @Override
    public String toString() {
        return "Account{" +
                "customerName='" + customerName + '\'' +
                ", accountBalance=" + accountBalance;
    }
}