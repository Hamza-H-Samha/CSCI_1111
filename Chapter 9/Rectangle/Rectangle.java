public class Rectangle {
public double width;
public double height;

public Rectangle (){
width=1;
height=1;

}

public Rectangle (double w, double h){
width=w;
height=h;

}
public double calculateArea() {
return width*height;


}
public double calculatePerimeter() {
return 2*(width+height);


}




}
