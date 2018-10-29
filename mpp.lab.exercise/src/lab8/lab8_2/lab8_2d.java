package lab8.lab8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lab8.lab8_2.lab8_3c.sortMethod;

public class lab8_2d {
	static enum SortMethod {
		BYTITLE, BYPRICE
	};

	public void sort(List<Product> product, SortMethod sortBY) {
		if (sortBY == SortMethod.BYTITLE) {
			Collections.sort(product, (p1, p2) -> {
				if (p1.getTitle().equals(p2.getTitle()))
					return Integer.compare(p1.getModel(), p2.getModel());
				else
					return p1.getTitle().compareTo(p2.getTitle());

			});

		} else {
			Collections.sort(product, (p1, p2) -> {
				return Double.compare(p1.getPrice(), p2.getPrice());
			});
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> pro = new ArrayList<>();
		pro.add(new Product("Tesla",100000.0,3));
		pro.add(new Product("Toyota",10000.0,2));
		pro.add(new Product("Ford", 60000.0,89));
		lab8_2d mysort= new lab8_2d();
		  mysort.sort(pro,SortMethod.BYPRICE);
		System.out.println(pro);
		mysort.sort(pro,SortMethod.BYTITLE);
		 System.out.println(pro);
	}

}
