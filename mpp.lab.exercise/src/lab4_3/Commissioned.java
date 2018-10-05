package lab4_3;

import java.time.LocalDate;
import java.util.List;

public class Commissioned extends Employee {
   private double commission;
   private double baseSalary;
   private double perecent;
   private List<Order> order;
   
public Commissioned(String empid, double perecent, double baseSalary, List<Order> order) {
	super(empid);
	this.perecent = perecent;
	this.baseSalary = baseSalary;
	this.order = order;
}
 public void addOrder(int orderNo, LocalDate orderDate, int orderAmount)
 {
	 Order a= new Order(orderNo,orderDate,orderAmount);
	 order.add(a);
 }
@Override
double calcGrossPay(int month,int year) {
	// TODO Auto-generated method stub
	  for(Order o: order)
	  {
		  if(o.getOrderDate().getMonthValue()==month && o.getOrderDate().getYear()==year)
		  {
			  commission+=o.getOrderAmount()*(perecent/100);
		  }
	  }
	return baseSalary+commission;
}
}
