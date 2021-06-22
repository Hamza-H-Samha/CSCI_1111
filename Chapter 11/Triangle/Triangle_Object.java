import java.lang.Math;
public class Triangle_Object extends GeometricObject{
          final double halve=0.5;
          private double side1;
          private double side2;
          private double side3;




          public Triangle_Object(){
            this.side1 =1;
            this.side2 =1;
            this.side3 =1;





          }
          public Triangle_Object (double s1,double s2,double s3, String color, boolean filled)  {
            this.side1= s1;
            this.side2= s2;
            this.side3= s3;
            setColor(color);
            setFilled(filled);


          //  isValid();



          }

          public double getArea(){
          	double s=(side1+side2+side3)*halve;
            double Side1 = (s-side1);
            double Side2 = (s-side2);
            double Side3 = (s-side3);
            double area = s*Side1*Side2*Side3;
            double sArea = Math.sqrt(area);

            return sArea;




          }
          public double getPerimeter(){
            return side1 + side2 + side3;




          }
          public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
          /*public static boolean isValid(double side1, double side2, double side3){
          	double s=(side1+side2+side3)*halve;
          	double Side1=side1+side2;
          	double Side2=side1+side3;
          	double Side3=side3+side2;


          		if(Side1>s){
          			if(Side2>s){
          				if(Side3>s){
          					System.out.println("This is a valid Triangle");
          					return true;

          				}


          			}




          		}else {
          		System.out.println("This is Not a Valid Triangle");
          		return false;
          	}






          	return false;

          }
          */
          public double getSide1(){
            return side1;



          }
          public double getSide2(){
            return side2;



          }
          public double getSide3(){
            return side3;



          }
          public void  getSide1(double side1){
            this.side1 = side1;



          }
          public void  setSide2(double side2){
            this.side2 = side2;



          }

          public void  setSide1(double side3){
            this.side3 = side3;



          }










}
