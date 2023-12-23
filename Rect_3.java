import java.util.*;
class Shape {    
       public double getArea()	{
	 return 0.0;
	}
       public double getPerimeter()	{
	 return 0.0;
	}
  }
class Rect extends Shape {
    private double l,b;
    public Rect(double l, double b) {
        this.l=l;
	this.b=b;
      }   

    public double getArea() {
	return (l*b);
     }
     public double getPerimeter()  {
	return (2*(l+b));
     }
  }
public class Rect_3 {
   public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Length : ");
     double Length=sc.nextDouble();
     System.out.println("Enter Bredgth : ");
     double Bredgth=sc.nextDouble();

     Rect rct=new Rect(Length,Bredgth);
     System.out.println("Area : "+rct.getArea());
     System.out.println("Perimeter : "+rct.getPerimeter());
    }
  }