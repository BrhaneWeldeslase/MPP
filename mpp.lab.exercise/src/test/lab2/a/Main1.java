package test.lab2.a;

import lab2.a.Student;
import lab2.a.StudentGrade;

public class Main1 {
	public static void main(String args[])
	{
		Student a=StudentGrade.createStudent("Tarik");
		System.out.println(a.getGr().getGrade());
	}

}
