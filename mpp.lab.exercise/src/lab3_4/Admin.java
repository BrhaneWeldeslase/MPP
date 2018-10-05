package lab3_4;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static double computeTotalRent(property[] properties) {
		double totalRent = 0;
		
		for (property o : properties) {
		    totalRent+=o.computeRent();
		}
		return totalRent;
	}
	public static void populateCity(List<property> all, String city)
	{
		List<property> onlyProperty= new ArrayList<>();
		boolean found=false;
		  for(property a: all)
		  {
			  if(a.getAddress().getCity().equals(city))
			  {
				  onlyProperty.add(a);
				   found=true;
			  }
			 
		  }
		  if(found) {
		for(property p: onlyProperty)
		{
			System.out.println(p.getAddress().getStreet()+","+p.getAddress().getCity()+","+p.getAddress().getState()+p.getAddress().getZip());
		}
		  }
		  else
		  {
			  System.out.println("Property not found");
		  }
	}
	
}
