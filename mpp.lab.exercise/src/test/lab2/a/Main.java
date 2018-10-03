package test.lab2.a;

import lab2.a.Student;


public class Main {
	public static void main(String args[])
	{
		//this is one to one relationship with out creating new in GradeReport
		Student a=new Student("Daniel");
		System.out.println(a.getGr().getGrade());
	}
	
}
