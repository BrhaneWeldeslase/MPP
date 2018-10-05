package lab4_3;

public class Salaried extends Employee {
   private double salary;

public Salaried(String empid, double salary) {
	super(empid);
	this.salary = salary;
}

@Override
double calcGrossPay(int month,int year) {
	// TODO Auto-generated method stub
	return salary;
}
}
