public class Octagon extends GeometricObject implements Cloneable, Comparable <Octagon> {
          double side;

          public Octagon() {
            this(5);

          }
          public Octagon(double side){
            this.side = side;




          }
          //@Override
          public double getArea(){
            double sqrt = Math.sqrt(2);
            double sides = side*side;
            final int FOUR = 4;
            final int TWO = 2;

            return (sides)*((TWO)+(FOUR/sqrt));





          }
        //@Override
          public double getPerimeter(){
            return side*8;




          }
          public Object clone (){
            Object Octagon1 = null;
            try{
                        Octagon1 = super.clone();


            } catch (CloneNotSupportedException ex) {
              ex.printStackTrace();



            }
            return Octagon1;



          }
          @Override
      public int compareTo(Octagon obj){
        if (this.side > obj.side){
          return 1;
        }
        else if (this.side == obj.side){
          return 0;

        }
        else {
          return -1;

        }


      }
}
