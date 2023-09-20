public interface Withdraw {
 void withdrawMoney (double money) ;
 default void bankName (){
  System.out.println("-------- State Bank Of Pakistan --------");
 }
}
