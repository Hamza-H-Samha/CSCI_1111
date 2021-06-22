public class CheckingAccount extends Account{
double OverDraftLimit = -100;
public CheckingAccount(int id, double balance){
super(id,balance);

}
public void withdraw(double amountln) {
if (balance - amountln >= OverDraftLimit) {
super.withdraw(amountln);


}
public String toString() {
return "CheckingAccount{"+"balance= " +balance+'}';



}


}











}
