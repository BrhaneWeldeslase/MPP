package lab4_3;

import java.time.LocalDate;

public abstract class Employee {
    private String empid;
     public void print()
    {
    	LocalDate a=LocalDate.now();
    	double grossPay= calcCompensation(a.getMonthValue(),a.getYear());
    	Paycheck pay=new Paycheck(grossPay, grossPay*0.23, grossPay*0.05, grossPay*0.01, grossPay*0.03, grossPay*0.075);
    	pay.print();
    }
    abstract double calcGrossPay(int month,int year);
    public double  calcCompensation(int month, int year)
    {
    	   return calcGrossPay(month,year);	
    }
	public Employee(String empid) {
		super();
		this.empid = empid;
	}
    
}
