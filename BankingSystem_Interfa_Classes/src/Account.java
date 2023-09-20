public class Account extends SavingAccount implements Withdraw , Deposit {
    String username ;
    String password ;

    Account (String username , String password){
        this.username = username ;
        this.password = password ;
        bankName();
        SavingAccount(username);
    }

    @Override
    public void depositMoney(double money) {
        System.out.println("--------------------------------");
        System.out.println(money+" : Amount Deposit only/-");
        System.out.println("--------------------------------");


    }

    @Override
    public void withdrawMoney(double money) {
        System.out.println("--------------------------------");
        System.out.println(money+" : Amount Withdraw only/-");
        System.out.println("--------------------------------");


    }
}
