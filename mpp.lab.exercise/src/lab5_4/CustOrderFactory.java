package lab5_4;

import java.time.LocalDate;
import java.util.List;

public class CustOrderFactory {
	
	public static Customer createCustomerOrder(String name,List<String> items,LocalDate lDate)
	{
		Customer cust=new Customer(name);
		Order or= Order.newOrder(cust, lDate);
		for(String i: items)
		{
			or.addItem(i);
			
		}
		return cust;
	}

}
