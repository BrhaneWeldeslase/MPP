package lab5_2;

public final class Circle implements figure {
    private final double radius;
    Circle(double radius)
    {
    	this.radius=radius;
    }
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	public double getRadius() {
		return radius;
	}

}
