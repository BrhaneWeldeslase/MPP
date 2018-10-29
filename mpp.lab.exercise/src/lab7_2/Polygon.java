package lab7_2;

public interface Polygon extends ClosedCurve {
   double[] getLength();
   default double computePerimeter()
   {
	   double perimeter=0.0;
	   for(double d: getLength())
	   {
		   perimeter+=d;
	   }
	   return perimeter;
   }
}
