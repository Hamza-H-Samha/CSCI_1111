public class SavingsAccount extends Account{
     double OverDraftLimit =0;
     public SavingsAccount(int id, double balance) {
        super(id, balance);

}
public void withdraw( double amountln){
  if (balance- amountIn >= OverDraftLimit) {
         super.withdraw(amountIn);



}
}
public String toString() {
        return "SavingsAccount{" +
                "Balance=" + balance +
                '}';
    }

















}
