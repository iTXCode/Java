import java.util.Date;
    class Account{
        private int         id;   //账户
        private double balance;            //余额
        private double annualInterestRate; //年利率
        private  Date dateCreated;

        Account(){
            id=0;
            balance=0;
            annualInterestRate=0;
        }

        Account(int newId,double newBalance){
            id=newId;
            balance=newBalance;
        }
        void setId(int newId){
            id=newId;}
        int getId(){
            return id;
        }
        void setBalance(double newBalance){
            balance=newBalance;
        }
        double getBalance()
        {
            return balance;
        }
        void setAnnualInterestRate(double newAnnualInterestRate)
        {
            annualInterestRate=newAnnualInterestRate;
        }
        double getAnnualInterestRate(){
            return annualInterestRate;}

        double getmonthlyIntereRate()
        {
            return annualInterestRate/12;
        }
        Date getDateCreated()
        {
            Date dateCreated =new Date();
            return dateCreated;}
        double getmonthlyIntere()
        {
            return balance*annualInterestRate/12/100;
        }
        double withDraw(double withDrawB)
        {
            return balance-=withDrawB;
        }

        double deposit(double depositB){
            return balance+=depositB;
        }
    }




public class classhome {
    public static void main(String[] args) {
        Account A = new Account(1122, 20000);
        A.setAnnualInterestRate(4.5);
        A.withDraw(2500);
        A.deposit(3000);
        System.out.println("balance is " + A.getBalance() + "   " + " monthlyinterest   is" + " " + A.getmonthlyIntere() + "     " + A.getDateCreated());
    }
}