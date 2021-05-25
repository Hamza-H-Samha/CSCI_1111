 class MyInteger{
     int value;
     public MyInteger(int v){
          value=v;

     }
     public int getValue(){
          return value;


     }
     public static boolean isEven(int checkValue){
         if ((checkValue%2)==0){
               return true;

         }
         else {
              return false;
         }

     }
     public static boolean isOdd(int checkValue){
            if ((checkValue%2)!=0){
                  return true;

            }
           else {
                  return false;
           }


    }
public static boolean isPrime(int num){
      for(int i =2;i<num; i++){
          if(num%i==0){
                  return false;
          }




      }
      return true;
}
public boolean isEven(){
  if (value%2==0){
    return true;

  } else {
    return false;
  }


}
public boolean isOdd(){
  if (value%2!=0){
    return true;

  } else {
    return false;
  }


}
public boolean isPrime(){
  for(int i =2;i<value; i++){
      if(value%i==0){
              return false;
      }




  }
  return true;


}
public static boolean isEven(MyInteger num){
  if (num.getValue()%2==0){
    return true;

  } else {
    return false;
  }
}
public static boolean isOdd(MyInteger num){
  if (num.getValue()%2!=0){
    return true;

  } else {
    return false;
  }
}
public static boolean isPrime(MyInteger num){
  for(int i =2;i<num.getValue(); i++){
      if(num.getValue()%i==0){
              return false;
      }




  }
  return true;
}
public static int parseInt(char[] n){
    int num=0;
    for(int i=0;i<n.length;i++){
        num=num*10;
        num = num+(n[i]-'0');
    }
    return num;
}
public static int  parseInt(String s){
  int num=0;
  for(int i=0;i<s.length();i++){
      num=num*10;
      num = num+(s.charAt(i)-'0');
  }
  return num;
}


}
