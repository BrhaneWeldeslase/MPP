package lab2_4;

class TranscriptEntry {
	Student student;
	Section section;
	String grade;
	 
	TranscriptEntry(Student s, Section sect, String grade)
	{
	    this.student=s;
	    this.section=sect;
	    this.grade=grade;
	}
	public String toString() {
		return "Student: " + student.name + "\n"
				+ "Course name: " + section.courseName + "\n"
				+ "Section number: " + section.sectionNumber + "\n"
				+ "Grade: " + grade + "\n";
	}
}
