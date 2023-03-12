
package shape;

import java.util.ArrayList;

interface Shape {
    
    double area();
    double perimeter();
    
    public static void main(String[] args) {
        // Rectangle area and parameter
        double length = 2.0;
        double breadth = 3.0;
        Rectangle r = new Rectangle(length, breadth);

        System.out.println("Rectangle - Area: " + r.area());
        System.out.println("Rectangle - perimeter: " + r.perimeter());

        // Circle area and parameter
        double radius = 2.0;
        Circle c = new Circle(radius);
        System.out.println("Circle - Area: " + c.area());
        System.out.println("Circle - perimeter: " + c.perimeter());
        
        // Traingle area and parameter
        double base  = 2.0, height = 12.2;
        double  A = 12.0 , B = 10.0, C = 8;
        Traingle t = new Traingle(base,height,A,B,C);
        System.out.println("Traingle - Area: " + t.area());
        System.out.println("Traingle - perimeter: " + t.perimeter());

        
        // Get Sum areas
       //  And using forEach draw element in arrayList
       ArrayList<Double> list = new ArrayList<Double>(); 
       list.add(r.area());
        list.add(t.area());
       list.add(c.area());

       double sum = 0;
       for(double d : list)
            sum += d;
       
        System.out.println("Sum Areas Of List == " +sum);
        
    }
    
}