public class TestMyInteger{
          public static void main(String[] args){

                MyInteger n1= new MyInteger(51);
                MyInteger n2= new MyInteger(7);
                String s="357";
                char[] n={'3','5','7'};

                System.out.println("Is the number 51 even? "+ "\n"+n1.isEven());
                System.out.println("Is the number 51 odd? "+ "\n"+n1.isOdd());
                System.out.println("Is the number 51 prime? "+ "\n"+n1.isPrime());
                System.out.println("Is the number 7 even? "+ "\n"+n2.isEven());
                System.out.println("Is the number 7 odd? "+ "\n"+n2.isOdd());
                System.out.println("Is the number 7 prime? "+ "\n"+n2.isPrime());
                System.out.println(n1.parseInt(n));
                  System.out.println(n1.parseInt(s));

          }



}
