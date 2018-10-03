package lab2.a;

public class StudentGrade {
	
	public static Student createStudent(String name) {
	Student a=new Student(name);
	GradeReport g=new GradeReport(a);
    a.setGr(g);
    return a;
	}
}
