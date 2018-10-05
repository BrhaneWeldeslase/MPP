package test.lab3_2;

import java.util.Arrays;
import java.util.List;

import lab3_2.Building;

public class Main {
	public static void main(String args[])
	{
		Building A=new Building("Block1");
		A.addApartment("101A", "SingleBed");
		A.addApartment("101B", "SingleBed");
		A.addApartment("101C", "luxurury");
		A.addApartment("101D", "Studio");
		A.addApartment("101E", "SingleBed");
		A.addApartment("101F", "DoubleBed");
		A.setMaintenaceCostMonthly(1200);
		System.out.println("Maintenance for the building is" + A.getMaintenaceCostMonthly());
		Building B=new Building("Block2");
		B.addApartment("101A", "SingleBed");
		B.addApartment("101B", "SingleBed");
		B.addApartment("101C", "luxurury");
		B.addApartment("101D", "Studio");
		B.addApartment("101E", "SingleBed");
		B.addApartment("101F", "DoubleBed");
		B.setMaintenaceCostMonthly(1000);
		   List<Building> all=Arrays.asList(A,B);
		   double sum=0.0;
		   for(Building a: all)
		   {
		       sum=a.rent();
		   }
		  System.out.println("Profit of the Building"+ sum);
		
		
	}

}
