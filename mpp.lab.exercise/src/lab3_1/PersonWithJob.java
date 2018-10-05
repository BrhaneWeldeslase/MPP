package lab3_1;

public class PersonWithJob {
	
	private double salary;
	private Person p;

	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		p=new Person(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob per = (PersonWithJob)aPerson;
		boolean isEqual = this.p.equals(per) &&
				this.getSalary()==per.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		//this is false because person is not instance of personwithjob.
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
