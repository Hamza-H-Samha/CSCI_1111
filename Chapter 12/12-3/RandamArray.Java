import java.util.Scanner;
public class RandamArray{
          public static void main(String[] args){
            int [] randamArraay = new int [100];
            for (int i = 0; i <randamArraay.length; i++){ // for loop for all elements in the array

                  randamArraay[i] = (int) (Math.random()*100);






            }
                  Scanner k = new Scanner(System.in); // initilze scanner
                  System.out.print("enter an index number between 0 and 99:"); //print index number 0 too 99
                    try {
                                int chosenNumber = k.nextInt(); // user input
                                System.out.println("randamArraay[" + chosenNumber + "] = " + randamArraay[chosenNumber]); // print index of the array




                    }
                    catch(IndexOutOfBoundsException ex){ // out of bounds catch
                    System.out.println("RandamArray" + ex.getLocalizedMessage() + "  Unfortunately this is out of bounds ");

                  } catch(Exception ex){ // general Exception
                    System.out.println(" Invalid Input please try again ");


                  }




          }












}
