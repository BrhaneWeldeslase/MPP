package lab7_2;

public class EquililatrialTriangle implements Polygon {
   private double side;
   EquililatrialTriangle(double side)
   {
	   this.side=side;
   }
	@Override
	public double[] getLength() {
		// TODO Auto-generated method stub
		return new double[]{side,side,side};
	}

}
