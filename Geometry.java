import java.util.*;
class polygon{
    protected int noofsides;
    protected double area, perimeter;
    public polygon(){
        noofsides = 0;
        area = 0;
        perimeter =0;
    }
    public polygon(int noofsides){
        this.noofsides = noofsides;
        area = 0;
        perimeter =0;
    }

    public String toString(){
        return ("number of sides = " + noofsides + " area: " + area + "perimeter: " + perimeter );
    }
}
class rectangle extends polygon{
    private double length, width;

    public rectangle(){
        length = 0;
        width=0;
    }
    public rectangle(double length, double width){
        super(4);
        this.length = length;
        this.width = width;
        calcarea();
        calcperm();
    }
    public void calcperm(){
        perimeter = 2*(length+width);
    }
    public void calcarea(){
        area = length*width;
    }

    public String toString() {
        String s = super.toString();
        s += ("length= " + length + " width: " + width );
        return s;
    }
}
public class Geometry {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(3.6,5.4);
        System.out.print(r1);
    }
}
