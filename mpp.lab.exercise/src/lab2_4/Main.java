package lab2_4;
import java.util.*;

/** Shows how the design in this package of classes
 *  allows you to navigate in the way that the class
 *  diagram suggests
 */
public class Main {	
	Student bob;
	Student tim;
	Student allen ;
	 Student[] students = {bob, tim, allen};
	Section bio1;
	Section bio2;
	Section math;
	public static void main(String[] args) { 
		Main m = new Main();
		m.readDataFromDb();
		System.out.println(m.getTranscript(m.bob));
		System.out.println("Grades for math section:\n " + m.getGrades(m.math));
		System.out.println("Courses that Tim took: " + m.getCourseNames(m.tim));
		System.out.println("Students who got A's: " + m.getStudentsWith("A"));
	}
	
	private Transcript getTranscript(Student s) {
		return s.getTranscript();
	}
	private List<String> getCourseNames(Student s) {
		List<TranscriptEntry> all = s.grades;
		List<String> courseNames = new ArrayList<>();
		for(TranscriptEntry te : all) {
			courseNames.add(te.section.courseName);
		}
		return courseNames;
	}
	private List<String> getGrades(Section s) {
		List<String> grades  = new ArrayList<>();
		for(TranscriptEntry t : s.gradeSheet) {
			grades.add(t.grade);
		}
		return grades;
	}
	private List<String> getStudentsWith(String grade) {
		List<String> studentNames = new ArrayList<>();
		for(Student s : students) {
			boolean found = false;
			for(TranscriptEntry te : s.grades) {
				if(!found) {
					if(te.grade.equals(grade)) {
						found = true;
						studentNames.add(s.name);
					}
				}
			}
		}
		return studentNames;
	}
	private void readDataFromDb() {
		StudentSectionFactory newStudentSecFact=new StudentSectionFactory();
		 bob= newStudentSecFact.createStudent("04/3415", "bob");
		 allen= newStudentSecFact.createStudent("04/3412", "tim");
		 tim= newStudentSecFact.createStudent("04/3475", "allen");
		
		 students = new Student[]{bob, tim, allen};
	
	    bio1=newStudentSecFact.createSection(1, "Biology");
	    bio2=newStudentSecFact.createSection(2, "Biology");
		math=newStudentSecFact.createSection(3, "Mathematics");
	
	



		newStudentSecFact.newTranscriptEntry(bob, bio1, "A");
		newStudentSecFact.newTranscriptEntry(bob, math, "B");

		newStudentSecFact.newTranscriptEntry(tim, bio1, "B+");
		newStudentSecFact.newTranscriptEntry(tim, math, "A-");

		newStudentSecFact.newTranscriptEntry(allen, math, "B");
		newStudentSecFact.newTranscriptEntry(allen, bio2, "B+");

		
	}

}
