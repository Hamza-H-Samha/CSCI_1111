import java.util.Scanner;
public class TestTriangle_Object {
          private double side1 = 1.0;
          private double side2 = 1.0;
          private double side3 = 1.0;
          public static void main(String[] args) {
            Scanner k = new Scanner(System.in);
            System.out.println("Define 3 sides of a Triangle");
            double side1 = k.nextDouble();
            double side2 = k.nextDouble();
            double side3 = k.nextDouble();
            System.out.println("Define a color of the Triangle");
            String color = k.next();
             boolean isFilled = true;
             Triangle_Object  t1 = new Triangle_Object(side1,side2,side3, color, isFilled);
             Triangle_Object  t2 = new Triangle_Object();
            //System.out.println("'True' or 'False' Is the defined Triangle filled or not ");

            //String filled = k.next();

              //new Triangle_Object(side1, side2, side3);


              System.out.println("The Triangle Sides are \n side 1: " + side1 + "\n Side 2: " + side2 + "\n Side 3: " + side3);
              System.out.println("The Triangle's Area is " + t1.getArea());
              System.out.println("The Triangle's Perimeter is "+ t1.getPerimeter());
              System.out.println("The discription is described via the toString method "+ t1.toString());
              System.out.println("The Triangle's Color is " + t1.getColor());
              System.out.println("Is the Triangle filled? " + t1.isFilled());

              System.out.println("The Triangle's Area is " + t2.getArea());
              System.out.println("The Triangle's Perimeter is "+ t2.getPerimeter());



          }










}
