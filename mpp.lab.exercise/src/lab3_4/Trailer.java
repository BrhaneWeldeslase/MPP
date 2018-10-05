package lab3_4;

public class Trailer implements property {
	  private Address address;
	  public Address getAddress() {
	  	return address;
	  }
	
	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return 500;
	}
	public Address add(String street,String city,String state,int zip)
	   {
		   address=new Address(street,city,state,zip);
		   return address;
	   }
}
