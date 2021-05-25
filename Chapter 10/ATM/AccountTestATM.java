import java.util.Date;
import java.util.Scanner;
public class AccountTestATM{
public static void main(String[] args){
      Scanner k = new Scanner(System.in);
      System.out.println("Hello Welcome to my ATM Machine"+"\n"+"Please Type your Idenification number between 0 to 9");
      int id= k.nextInt();
      char options =' ';
      AccountATM [] accounts = new AccountATM[10];
      for (int i  = 0;  i < accounts.length; i++) {
        accounts[i] = new AccountATM();
        accounts[i].setID(i);
        accounts[i].setBalance(100);
      }
      while(options != 'Q' && options !='q'){
        if( (id<=9 && id >=0) && (options != 'Q'|| options != 'q')){
          System.out.println("Please Pick a valid option"+"\n"+"D to Deposit"+"\n"+"W To Withdraw"+"\n"+"B to BalanceCheck"+"\n"+"Q to Quit");
          options= k.next().charAt(0);
          if((options == 'D'|| options == 'd')){
                        System.out.println("How Much Do you want to Deposit");
                            double amountIn= k.nextDouble();
                        accounts[id].deposit(amountIn);

            }
            else if((options == 'W'|| options == 'w')){
              System.out.println("How Much Do you want to Withdraw");
                  double amountIn= k.nextDouble();
              accounts[id].withdraw(amountIn);

            }
            else if((options == 'B'|| options == 'b')){
                      System.out.println("You have an availble Balance of $" + accounts[id].getBalance());

            }
            else if(options == 'Q'|| options == 'q'){
            System.out.println("Quiting from your account");

            }
            else{
              System.out.println("Invalid Letter Please Try Again");
              options= k.next().charAt(0);
            }




        }
        else {
          System.out.println("Invalid Idenification Number Please Try Again");
          id= k.nextInt();

        }





      }






}



}
