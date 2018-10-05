package lab4_3;

import java.time.LocalDate;

public class Order {
  private int OrderNo;
  private LocalDate orderDate;
  private int orderAmount;
  private Commissioned commissioned;

  Order(int orderNo, LocalDate orderDate, int orderAmount) {
	super();
	OrderNo = orderNo;
	this.orderDate = orderDate;
	this.orderAmount = orderAmount;
}


  public void addCommission(Commissioned commissioned) {
      this.commissioned = commissioned;
  }

public int getOrderNo() {
	return OrderNo;
}
public void setOrderNo(int orderNo) {
	OrderNo = orderNo;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}
public int getOrderAmount() {
	return orderAmount;
}
public void setOrderAmount(int orderAmount) {
	this.orderAmount = orderAmount;
}

}
