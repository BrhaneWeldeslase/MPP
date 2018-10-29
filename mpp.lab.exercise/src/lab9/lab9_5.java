package lab9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class lab9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(streamSection(nextStream(), 1, 3).collect(Collectors.joining(", ")));
		
	}
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		// Implement the code
		          
		 
//		     String[] names= stream.toArray(String[]::new);
//		     List<String> a= IntStream.range(0,names.length)
//		    		                  .filter(i->(i>=m && i<=n))
//                                      .mapToObj(i->names[i])
//                                      .collect(Collectors.toList());
//		      return a.stream();        
		     return stream.skip(m).limit(m);   
		}
	 private static Stream<String> nextStream() {
		 
	   return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
	      "iii").stream();
		
		}
}
