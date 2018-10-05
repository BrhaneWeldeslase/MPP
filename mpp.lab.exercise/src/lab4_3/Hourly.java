package lab4_3;

import java.time.LocalDate;

public class Hourly extends Employee {
     private double HourlyWage;
     private double hoursPerWeek;
   //  private LocalDate startDate;
     @Override
	double calcGrossPay(int month,int year) {
		// TODO Auto-generated method stub
		
		return 4*hoursPerWeek*HourlyWage;
	}
	public Hourly(String empid, double hourlyWage, double hoursPerWeek) {
		super(empid);
		HourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	//	this.startDate=startDate;
	}


}
