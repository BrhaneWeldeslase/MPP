package lab3_4;

public class House implements property {
  private int lotsize;
  private Address address;
  public Address getAddress() {
	return address;
}
	public House(int lotsize) {
	super();
	this.lotsize = lotsize;
}

	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return 0.1*lotsize;
	}
	public Address add(String street,String city,String state,int zip)
	   {
		    address=new Address(street,city,state,zip);
		   return address;
	   }
}
