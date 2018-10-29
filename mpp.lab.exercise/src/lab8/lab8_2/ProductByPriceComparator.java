package lab8.lab8_2;

import java.util.Comparator;

public class ProductByPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPrice(),p2.getPrice());
	}

}
