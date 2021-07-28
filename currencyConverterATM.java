public class currencyConverterATM{
		static double balance; 
		static char currency = ' ';
		static final double britishPoundToUSDRate = 1.38;
		static final double uSDToBritishpoundrate = 0.73;
		static final double uSDToJapaneseYenrate = 110.67;
		static final double japaneseYenToUSDrate = 0.0090; 
		static final double japaneseYenToBritishPoundrate = 0.0065; 
		static final double britishPoundToYenRate = 152.70; 
		
		
		static double uSDToBritishpound; 
		static double britishPoundToUSD; 
		 static double startingAmount;
		 static double japaneseYenToUSD; 
		 static double uSDToJapaneseYen; 
		 static double japaneseYenToBritishPound; 
		 static double britishPoundToJapaneseYen; 
		public currencyConverterATM(double startingAmount, char currency ){
			  startingAmount = balance; 
			 char country = currency; 
			 
			
		}
		public double getMoney(){
			return startingAmount; 
			
		}
	public void setMoney(double money){
		money = startingAmount;  
		
		
	}
	public char getCountry(){
		return currency;
	}
	public void setCountry(char billType) {
		billType = currency;   
		
		
	}
	public double getSterlingPooundFromUSD(double sterling){
		return sterling*uSDToBritishpoundrate; 
	}
	public void setSterlingPooundFromUSD() {
		double sterling = uSDToBritishpound; 
	}
	public double getUSDFromSterlingPoound(double dollar){
		return dollar*britishPoundToUSDRate; 
	}
	public void setUSDFromSterlingPoound() {
		double dollar = britishPoundToUSD; 
	}
	public double getUSDFromJapaneseYen(double yen){
		return yen*japaneseYenToUSDrate;
	}
	public void setUSDFromJapaneseYen() {
		double yen = japaneseYenToUSD; 
	}
	public double getJapaneseYenFromUSD(double dollar){
		return dollar*uSDToJapaneseYenrate; 
	}
	public void setJapaneseYenFromUSD() {
		double dollar = uSDToJapaneseYen; 
	}
	
	public double getJapaneseYenFromBritishPound(double sterling){
		return sterling*britishPoundToYenRate; 
	}
	public void setJapaneseYenFromBritishPound() {
		double sterling = britishPoundToJapaneseYen; 
	}
	public double getBritishPoundFromJapaneseYen(double yen){
		return japaneseYenToBritishPoundrate*yen;
	}
	public void setBritishPoundFromJapaneseYen(){
		double sterling = japaneseYenToBritishPound; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}