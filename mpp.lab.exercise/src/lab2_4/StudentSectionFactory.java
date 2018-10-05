package lab2_4;

public class StudentSectionFactory {
	public Section createSection(int secNum, String courseName)
	{
		Section newSec=new Section(secNum,courseName);
		return newSec;
	}
	public Student createStudent(String id, String name)
	{
		Student newStudent=new Student(id,name);
		return newStudent;
	}
	public void newTranscriptEntry(Student s, Section sect, String grade)
	{
		TranscriptEntry newTranEnt= new TranscriptEntry (s,sect,grade);
		  s.grades.add(newTranEnt);
		  sect.gradeSheet.add(newTranEnt);
	}

}
