package test.lab5_4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import lab5_4.CustOrderFactory;
import lab5_4.Customer;



public class Main {
	public static void main(String[] args) {
		List<String> itemsthings=Arrays.asList("book","chair");
		Customer c=CustOrderFactory.createCustomerOrder("Bob",itemsthings, LocalDate.now());
		System.out.println(c.getOrders());
	}
}

		
