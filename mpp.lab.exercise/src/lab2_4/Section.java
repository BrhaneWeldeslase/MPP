package lab2_4;

import java.util.*;

public class Section {
	String courseName;
	int sectionNumber;
	List<TranscriptEntry> gradeSheet;
	Section(int secNum, String courseName){
		this.courseName=courseName;
		this.sectionNumber=secNum;
		gradeSheet=new ArrayList<>();
	}
	
}
