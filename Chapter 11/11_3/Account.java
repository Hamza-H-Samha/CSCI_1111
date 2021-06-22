import java.util.Date;
public class Account {
private int id=0;
private double balance=0;
private double annualInterestRate=0;
private Date dateCreated;
private Account(){
dateCreated=new Date();

}
private Account(int accountNumber, double InitalBalance ){
id=accountNumber;
balance=InitalBalance;
balance=0;
}
private int getID() {
return id;

}
private double getBalance(){
  return balance;
}

private double getMonthlyInterestRate(){
  return annualInterestRate/12;
}
private void setAnnualInterestRate(double rate){
  annualInterestRate=rate;
}
private double getMonthlyInterest( ){
  return (balance*annualInterestRate)/12;
}

private void deposit(double amountIn){
balance=balance+amountIn;

}
private boolean withdraw (double amountIn){
if(amountIn>balance){
return false;


}
else {
balance=balance-amountIn;
return true;

}


}

}
