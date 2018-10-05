package lab3_3b;

public class Main {
	public static void main(String args[])
	{
		Circle a= new Circle(5);
		System.out.println("Area of this circle is " + a.computeArea());
        Cylinder b= new Cylinder(5,9);
        System.out.println("volume of this Cylinder is " + b.ComputeVolume());
	}

}
