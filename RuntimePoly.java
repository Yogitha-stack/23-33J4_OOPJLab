class Bank{
   double getInterestRate(){
         return 0;
   }
}
class SavingsAccount extends Bank{
         double getInterestRate(){
              return 3.0;
         }
}
class CurrentAccount extends Bank{
        double getInterestRate(){
                return 4.5;
        }
}
class FixedDepositAcc extends Bank{
        double getInterestRate(){
              return 6.5;
        }
}
public class RuntimePoly{
     public static void main(String[] args){
          Bank myBank;
         myBank=new SavingsAccount();
         System.out.println("Savings Account Interest rate:"+myBank.getInterestRate()+"%");
         myBank=new CurrentAccount();
          System.out.println("Current Account Interest rate:"+myBank.getInterestRate()+"%");
         myBank=new FixedDepositAcc();
         System.out.println("Fixed Account Interest rate:"+myBank.getInterestRate()+"%");
}
}
         