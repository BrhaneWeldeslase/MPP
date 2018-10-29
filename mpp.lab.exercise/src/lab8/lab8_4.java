package lab8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.*;
public class lab8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		//Arrays.sort(names, String::compareToIgnoreCase);
		Arrays.sort(names, (x,y)->x.compareToIgnoreCase(y));
		//Arrays.stream(names).forEach(System.out::println);
	     List<String> a=Arrays.asList(names);
	      a.forEach(out::println);
	      List<Integer> num=Arrays.asList(new Integer[]{1,2,3});
	      //int y= num.stream().reduce(0,(k,b)->k+b);
	      //int y=num.stream().mapToInt(i->i).reduce(0,(c,b)->c+b);
	      //int z=num.stream().mapToInt(Integer::intValue).sum();
	   //   System.out.println(y);
	    IntStream ints= IntStream.of(1,2,3,4);
	    IntStream dy=IntStream.generate(()->1) 
	                          .limit(5);
	       dy.forEach(System.out::println);
	    
	}

}
