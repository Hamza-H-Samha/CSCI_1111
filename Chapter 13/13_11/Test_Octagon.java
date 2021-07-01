public class Test_Octagon {
          public static void main(String [] args){

            Octagon octagon1 = new Octagon(10);
            Octagon octagon2 = (Octagon) (octagon1).clone();
            System.out.println("compareTo: " +octagon1+ (octagon1.compareTo(octagon2) == 0));
            System.out.println("The Area is:"+octagon1.getArea());
              System.out.println("The Area is:"+octagon2.getArea());
            System.out.println(octagon2.getPerimeter());



          //  System.out.println("Which Happens  to have  same reference as? " + (octagon1 == octagon2));






          }












}
