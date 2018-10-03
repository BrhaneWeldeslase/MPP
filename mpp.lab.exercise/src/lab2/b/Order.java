package lab2.b;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int OrderNum;
	private List<OrderLine> OrderLines;
	public Order(int OrderNum,String Type,double price)
	{
		OrderLines=new ArrayList<>();
		this.OrderNum=OrderNum;
		addOrder(Type,price);
	}
	public void addOrder(String Type,double price)
	{
		OrderLine a= new OrderLine(this,Type,price);
	     OrderLines.add(a);	
	}
	
	public List<OrderLine> getOrderLines() {
		return OrderLines;
	}
	public int getOrderNum() {
		return OrderNum;
	}
	public void setOrderNum(int orderNum) {
		OrderNum = orderNum;
	}
  
}
