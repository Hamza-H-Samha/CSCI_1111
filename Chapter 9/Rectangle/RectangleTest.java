public class RectangleTest{
public static void main(String[] args) {
Rectangle r1= new Rectangle();
Rectangle r2= new Rectangle(4,40);
Rectangle r3= new Rectangle(3.5,35.9);
System.out.println("For Rectangle 1 With the Width being 1 and Height being 1 the Area is "+r1.calculateArea());
System.out.println("For Rectangle 1 Width being 1 and Height being 1 the Perimeter is "+r1.calculatePerimeter());
System.out.println("For Rectangle 2 Width being 4 and Height being 40 the Area is "+r2.calculateArea());
System.out.println("For Rectangle 2 Width being 4 and Height being 40 The Perimeter is "+r2.calculatePerimeter());
System.out.println("For Rectangle 3 Width being 3.5 and Height being 35.9 The Area is "+r3.calculateArea());
System.out.println("For Rectangle 3 Width being 3.5 and Height being 39.5 The Perimeter is "+r3.calculatePerimeter());


}




}
