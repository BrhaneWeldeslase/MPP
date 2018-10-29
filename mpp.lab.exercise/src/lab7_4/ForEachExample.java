package lab7_4;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		Consumer<String> consumer=new Consumer<String>()
				{

					@Override
					public void accept(String t) {
						// TODO Auto-generated method stub
						System.out.println(t.toUpperCase());
		               
					}
			
				};
	
	   list.forEach(consumer);
	  //    another way of doing
//	list.stream()
//	    .map(String::toUpperCase)
//	    .forEach(System.out::println);
	        
	}  
	
	//implement a Consumer
	
	
}