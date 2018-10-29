package lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lab10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(4,1,3,0,1);
		List<Double> listString = Arrays.asList(2.9,5.4,3.1);
		System.out.println(sum(list));
		System.out.println(sum(listString));
	}
   public static <T extends Number> double sum(List<T> list)
   {
	     double sum=0.0;
	  for(T a: list)
	   {
		   sum+=a.doubleValue();
	   }
	   return sum;
   }
	 
}