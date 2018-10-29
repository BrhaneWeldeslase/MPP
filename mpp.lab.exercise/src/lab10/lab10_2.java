package lab10;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lab10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(4,1,3,0,1);
		List<String> listString = Arrays.asList("dani","book","table","Dawit","tarik");
		System.out.println(secondSmallest(list));
		System.out.println(secondSmallest(listString));
		
			
		List<LocalDate> dates = Arrays.asList(LocalDate.of(1900, 1, 1), LocalDate.of(1950,2,1),
				LocalDate.of(1975, 1, 1), LocalDate.of(2013, 1, 1));
		
		System.out.println(secondSmallest(dates));
	}
  public static <T extends Comparable<? super T>>  T secondSmallest(List<T> content)
  {
	  return content.stream().sorted().collect(Collectors.toList()).get(1);
	 
  }
}
