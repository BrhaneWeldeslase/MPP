package lab3_3;

public class Main {
	public static void main(String args[])
	{
		Circle a= new Circle(5);
		System.out.println("Area of this circle is " + a.computeArea());
        Cylinder b= new Cylinder(a.getRadius(),9);
        System.out.println("volume of this Cylinder is " + b.ComputeVolume());
	}

}
