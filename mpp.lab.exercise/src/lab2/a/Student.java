package lab2.a;

public class Student {
	private String name;
	private GradeReport gr;
	public Student(String name)
	{
		this.name=name;
		gr=new GradeReport(this);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GradeReport getGr() {
		return gr;
	}
	public void setGr(GradeReport gr) {
		this.gr = gr;
	}

}
