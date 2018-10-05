package lab3_3b;

public class Cylinder {
     private double height;
     private Circle c;
	public Cylinder(double radius,double height) {
		this.height=height;
		c=new Circle(radius);
	}
   public double ComputeVolume() {
	   return c.computeArea()*height;
   }
public double getHeight() {
	return height;
}

   
}
