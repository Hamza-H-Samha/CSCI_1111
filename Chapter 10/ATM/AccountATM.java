import java.util.Date;
public class AccountATM {
private int id=0;
private double balance=0;
private double annualInterestRate=0;
private Date dateCreated;
public AccountATM(){
dateCreated=new Date();

}
public AccountATM(int accountNumber, double InitalBalance ){
id=accountNumber;
balance=InitalBalance;
balance=0;
}
public int getID() {
return id;

}
public void setID(int iD){
id = iD;
}
public double getBalance(){
  return balance;
}
public void setBalance(double b) {
  balance =b;
}

public double getMonthlyInterestRate(){
  return annualInterestRate/12;
}
public void setAnnualInterestRate(double rate){
  annualInterestRate=rate;
}
public double getMonthlyInterest( ){
  return (balance*annualInterestRate)/12;
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
