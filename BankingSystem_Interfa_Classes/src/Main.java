public class Main {
    public static void main(String[] args) {

        String username = "Huzaifa Shahab";
        String password = "*********" ;

        Account account = new Account(username , password) ;

        System.out.println("Give An Amount To Deposit In Account");
            double amount = 1000000.00 ;
            account.depositMoney(amount);
        System.out.println("Give An Amount To Withdraw From Account");
            double amountWithdraw = 5000000 ;
            account.withdrawMoney(amount);

    }
}