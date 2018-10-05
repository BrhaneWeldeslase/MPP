package lab4_3;

public final class Paycheck {
  private double grossPay;
  private double fica;
  private double state;
  private double local;
  private double medicare;
  private double socialSecurity;
public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
	super();
	this.grossPay = grossPay;
	this.fica = fica;
	this.state = state;
	this.local = local;
	this.medicare = medicare;
	this.socialSecurity = socialSecurity;
}
    public void print()
    {
    	StringBuilder sb= new StringBuilder();
    	sb.append("the total payroll with "+ grossPay+"by substraction"+ "\n");
    	sb.append("fica "+fica+"\n");
    	sb.append("state Tax "+state+"\n");
    	sb.append("local tax "+local+"\n");
    	sb.append("medicare "+medicare+"\n");
    	sb.append("socialSecurity "+socialSecurity+"\n");
    	sb.append("_____________________________________"+"\n");
    	sb.append("Monthly pay will be " + (grossPay-(fica+state+local+medicare+socialSecurity)));
    	System.out.println(sb.toString());
    }
    public double getNetPay()
    {
    	return (grossPay-(fica+state+local+medicare+socialSecurity));
    }
}
