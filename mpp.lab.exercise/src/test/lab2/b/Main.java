package test.lab2.b;

import lab2.b.Order;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Order a=new Order(1001,"coffee",4.5);
      a.addOrder("water", 2.5);
      a.addOrder("chair", 451);    
      System.out.println(a.getOrderLines().toString());
	}

}
