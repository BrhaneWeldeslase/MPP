package lab3_4;

public class Condo implements property {
  private int numfloors;
  private Address address;
public Address getAddress() {
	return address;
}

@Override
public double computeRent() {
	// TODO Auto-generated method stub
	return 400*numfloors;
}
   public Address add(String street,String city,String state,int zip)
   {
	   address=new Address(street,city,state,zip);
	   return address;
   }
   
public Condo(int floor) {
	super();
	this.numfloors = floor;
}
  
}
