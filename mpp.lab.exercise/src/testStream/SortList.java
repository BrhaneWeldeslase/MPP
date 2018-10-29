package testStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Mahesh", 12));
		list.add(new Student(2, "Suresh", 15));
		list.add(new Student(3, "Nilesh", 10));
		
		System.out.println("---Natural Sorting by Name---");
		list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
	}
}
