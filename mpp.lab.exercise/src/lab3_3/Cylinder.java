package lab3_3;

public class Cylinder extends Circle {
     private double height;
	public Cylinder(double radius, double height) {
		super(radius);
		this.height=height;
	}
   public double ComputeVolume() {
	   return this.computeArea()*height;
   }
public double getHeight() {
	return height;
}

   
}
