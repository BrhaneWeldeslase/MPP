package lab3_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

		property[] objects = { new House(9000), new Condo(2), new Trailer() };
		List<property> allProperies=new ArrayList<>();		
		 objects[0].add("205E", "Fairfield", "IW", 52556);
		objects[1].add("147 Washington", "SanLeandro", "CA", 94578);
		objects[2].add("MLK", "hayward", "CA", 92356);
		allProperies=Arrays.asList(objects);
	    
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
		Admin.populateCity(allProperies,"hayward");
	}
}
