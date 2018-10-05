package lab2_4;

import java.util.*;

public class Student {
	String name;
	String id;
	List<TranscriptEntry> grades;
		Student(String id, String name)
		{
			this.id=id;
			this.name=name;
			grades=new ArrayList<>();
		}
	public Transcript getTranscript() {
		if(name == null) 
			throw new IllegalArgumentException("Student name cannot be null");
		return new Transcript(grades, this);
		
	}
	
}
