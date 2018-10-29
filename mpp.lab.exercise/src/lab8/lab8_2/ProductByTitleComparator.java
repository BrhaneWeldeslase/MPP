package lab8.lab8_2;

import java.util.Comparator;

public class ProductByTitleComparator implements Comparator<Product> {

	@Override
	public int compare(Product T1, Product T2) {
		// TODO Auto-generated method stub
		return T1.getTitle().compareTo(T2.getTitle());
	}
	

}
