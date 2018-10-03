package lab2.a;

public class GradeReport {
	private Student owner;
	private double grade=4.7;
	GradeReport(Student name)
	{
	  owner=name;
	  
	}
	public double getGrade()
	{
		return grade;
	}

}
