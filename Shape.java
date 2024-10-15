// define a class shape that has data members, number of sites, and a default  and parameter constructor
// Defaul initialzes the numbofsites, and parameterized fills it up with parameter
// Write the accessor and mutator, with toString
import java.lang.*;
public class Shape {
    private int numberofsides;

    public Shape(int numberofsides){
        this.numberofsides = numberofsides;
    }
    public Shape(){
        numberofsides = 0;
    }
    // accessor
    public int getNumberofsides(){
        return numberofsides;
    }
    // mutator
    public void setNumberofsides(int n){
        numberofsides = n;
    }

    public String toString() {
        String s = "number of sides: " + numberofsides;
        return s;
    }

    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape(3);
//        System.out.println(s1);
//        System.out.println(s2);
        Triangle t1 = new Triangle(3,4,5);
        System.out.println(t1.findarea());
        System.out.println(t1.perimeter());
        System.out.println(t1);

    }
}
// define a class triangle which inherits from shape
// It has member functions, area, and perimeter
class Triangle extends Shape{
    private float side1, side2, side3;

    public Triangle(float side1, float side2, float side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setNumberofsides(3);
    }
    public String toString(){
        String s = super.toString();
        s += ("Side 1: " + side1 ) + (" Side 2: " + side2 ) + (" Side 3: " + side3 );
        return s;
    }

    public float perimeter(){
        return (side1+side2+side3);
    }
    public double findarea(){
        double s = perimeter()/2;
        double area = s*(s-side1)*(s-side2)*(s-side3);
        area = Math.sqrt(area);
        return area;
    }

}