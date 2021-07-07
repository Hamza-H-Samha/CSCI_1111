import java.util.Scanner; 
public class TestCurrencyConverterATM{
	static double money; 
	static char convertTo;
	public static void main(String[] args){
		currencyConverterATM conversion = new currencyConverterATM(money,convertTo);   
	 Scanner k = new Scanner(System.in);
      String pound = "\u00a3";
		  
			
     
      char options =' ';
	  while(options != 'Q'|| options!= 'q'){
		   System.out.println("Hello Welcome to my Currency Converter ATM Machine"+"\n"+"Please choose a Starting Currency from the list below"+"\n"+"U for United States Dollar $"+"\n"+"K for United Kindom Pound Sterling "+pound+"\n"+"Y for Japanese Yen ¥"+"\n"+"Q to quit out if the System");
		    options= k.next().charAt(0);
		   
		   if(options == 'U'|| options == 'u'){
		   System.out.println("Hello Welcome to my Currency Converter ATM Machine"+"\n"+"Please choose a Currency in which you want to convert to from the list below"+"\n"+"\n"+"K for United Kindom Pound Sterling "+pound+"\n"+"Y for Japanese Yen ¥"+"\n"+"Q to quit out if the System");
		   char convertTo = k.next().charAt(0);
		   System.out.println("Enter the amount of Money you have to convert.");
		   double money = k.nextDouble();
		   if(convertTo == 'K'||convertTo == 'k'){
			System.out.println("You will receive"+conversion.getSterlingPooundFromUSD(money)+pound+" in British Pound sterling ");    
		   }
			
		   else if(convertTo == 'Y'||convertTo == 'y'){
			System.out.println("You will receive"+conversion.getJapaneseYenFromUSD(money)+"¥"+" in Japanese Yen"); 	
			   
		   }
			   
		   }
		   else if (options == 'K' || options == 'k'){
				  System.out.println("Hello Welcome to my Currency Converter ATM Machine"+"\n"+"Please choose a Currency in which you want to convert to from the list below"+"\n"+"\n"+"U for United States Dollar $"+"\n"+"Y for Japanese Yen ¥"+"\n"+"Q to quit out if the System");
				   convertTo = k.next().charAt(0);
				   System.out.println("Enter the amount of Money you have to convert.");
					money = k.nextDouble(); 
			   if(convertTo == 'U'||convertTo == 'u'){
				  System.out.println("You will receive $"+conversion.getUSDFromSterlingPoound(money)+" in United States Dollar"); 
				   
				   
			   }
			   else if(convertTo == 'Y'||convertTo == 'y'){
				  System.out.println("You will receive $"+conversion.getJapaneseYenFromBritishPound(money)+" in Japanese Yen"); 
				   
				   
			   }
			  
		   } 
		   else if (options == 'Y' || options == 'y'){
				  System.out.println("Hello Welcome to my Currency Converter ATM Machine"+"\n"+"Please choose a Currency in which you want to convert to from the list below"+"\n"+"\n"+"U for United States Dollar $"+"\n"+"K for United Kindom Pound Sterling "+pound+"\n"+"Q to quit out if the System");
				   convertTo = k.next().charAt(0);
				   System.out.println("Enter the amount of Money you have to convert.");
					money = k.nextDouble(); 
					if(convertTo == 'U'||convertTo == 'u'){
						System.out.println("You will receive $"+conversion.getUSDFromJapaneseYen(money)+" in United States Dollar"); 
						
						
					}
					else if(convertTo == 'K'||convertTo == 'k') {
						System.out.println("You will receive"+conversion.getBritishPoundFromJapaneseYen(money)+pound+" in British Pound sterling "); 
						
					}
			   
			 
		   }
		   
		   else if (options == 'Q' || options == 'q'){
			 System.out.println("You have existed out of My Currency Converter ATM Machine hope to see you again in the future.");	   
			  break;  
			   
		   } 
		   
		   
		   else{
              System.out.println("Invalid Letter Please Try Again");
               convertTo = k.next().charAt(0);
            }
		  
		  
		  
		  
		  
		  
		  
	  }
	 // System.out.println("You have existed out of My Currency Converter ATM Machine hope to see you again in the future.");
	
	
}
	
	
	
	
}