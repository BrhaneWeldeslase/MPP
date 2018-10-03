package lab2.b;

public class OrderLine {
	private String Type;
	private double price;
    private Order num;
	OrderLine(Order num,String Type,double price)
	{
		this.Type=Type;
		this.price=price;
		this.num=num;
	}

	@Override
	public String toString() {
		return "OrderNum"+num.getOrderNum()+"Type=" + Type + ", price=" + price ;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}


}
