package lab8.lab8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lab8_3c {
     static enum sortMethod {SORTBYTITLE,SORTBYPRICE};
     void sort(List<Product> pro, final sortMethod sortBY)
     {
    	class ProductComparator implements Comparator<Product>
    	{

			@Override
			public int compare(Product p1, Product p2) {
				if(sortBY==sortMethod.SORTBYPRICE)
				return Double.compare(p1.getPrice(),p2.getPrice());
				else
					return p1.getTitle().compareTo(p2.getTitle());
			}
    		
    	}
    	Collections.sort(pro, new ProductComparator());	 
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> pro = new ArrayList<>();
		pro.add(new Product("Tesla",100000.0,3));
		pro.add(new Product("Toyota",10000.0,2));
		pro.add(new Product("Ford", 60000.0,89));
		lab8_3c mysort= new lab8_3c();
		  mysort.sort(pro,sortMethod.SORTBYPRICE);
		System.out.println(pro);
		mysort.sort(pro,sortMethod.SORTBYTITLE);
		 System.out.println(pro);
	}

}
