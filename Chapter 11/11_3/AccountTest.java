import java.util.Date;
public class AccountTest{
public static void main(String[] args){
Account a1= new Account();
Account a2= new Account(1122, 20000.0);
Account a3= new Account();
System.out.println("accountNumber: "+a2.getID());
System.out.println("Account balance is $"+a2.getBalance());
a1.setAnnualInterestRate(0.045);
System.out.println("Your monthly interest rate is "+a1.getMonthlyInterestRate());

a1.deposit(2000.0);
System.out.println("You have made a deposit of $"+a1.getBalance());
a2.withdraw(2500.0);
System.out.println(a1.getDate());
System.out.println("You have made a withdraw of $"+a2.getBalance());
System.out.println("Based on your Account balance of $2000 you will pay a monthly interest of $"+a1.getMonthlyInterest());
a3.deposit(3000.0);
System.out.println("Account balance is $"+a3.getBalance());
a3.setAnnualInterestRate(0.045);
System.out.println("Your monthly interest rate is "+a3.getMonthlyInterestRate());

System.out.println(a3.getDate());





}



}



 class Account {
private int id=0;
private double balance=0;
private double annualInterestRate=0;
private Date dateCreated;
public Account(){
dateCreated=new Date();

}
public Account(int accountNumber, double InitalBalance ){
id=accountNumber;
balance=InitalBalance;
}
public int getID() {
return id;

}
public double getBalance(){
  return balance;
}
public Date getDate(){
  return dateCreated ;
}


public double getMonthlyInterestRate(){
  return annualInterestRate/12;
}
public void setAnnualInterestRate(double rate){
  annualInterestRate=rate;
}
public double getMonthlyInterest( ){
  return balance*(annualInterestRate/12);
}

public void deposit(double amountIn){
balance=balance+amountIn;

}
public boolean withdraw (double amountIn){
if(amountIn>balance){
return false;


}
else {
balance=balance-amountIn;
return true;

}


}

}
