import java.util.*;
class Shape {    
       public double getArea() {
	 return 0.0;
	}
       public double getPerimeter() {
	 return 0.0;
	}
  }
class Circle extends Shape {
    private double r;
    private final double PI=3.14;
    public Circle(double r)  {
        this.r=r;
      }   

    public double getArea()  {
	return (2*PI*(r*r));
     }
     public double getPerimeter() {
	return (2*PI*r);
     }
  }
public class Circle_2 {
   public static void main(String args[])  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Radius : ");
     double radius=sc.nextDouble();
     Circle crl=new Circle(radius);
     System.out.println("Area : "+crl.getArea());
     System.out.println("Perimeter : "+crl.getPerimeter());
    }
  }