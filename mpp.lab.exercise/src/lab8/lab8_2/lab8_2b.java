package lab8.lab8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lab8_2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> pro = new ArrayList<>();
		pro.add(new Product("Tesla",100000.0,3));
		pro.add(new Product("Toyota",10000.0,2));
		pro.add(new Product("Ford", 60000.0,89));
		  sortList(pro);
		System.out.println(pro);
	
	}
	 public static void sortList(List<Product> pro)
	   {
		   Collections.sort(pro,new ProductByTitleComparator());
	   }
}
