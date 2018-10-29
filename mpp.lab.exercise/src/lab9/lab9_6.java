package lab9;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lab9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] a={{"A", "B"}, {"D"}, {"1", "3", "5"}};
		    Set<String[]> as= Set.of(a);
		   String[] a1= {"A","B"};
		   String[] a2={"D"};
		   String[] a3= {"1", "3", "5"};
		    var a1S= Set.of(a1);
		    var a2S=Set.of(a2);
		    var a3S=Set.of(a3);
		    
	      List<Set<String>>  ans= List.of(a1S,a2S,a3S);
	    	      union(ans);
	    System.out.println(union(ans));
	    		 
	
	}
	public static Set<String> union(List<Set<String>> sets)
	{ 
		Set<String> setholder=new HashSet();
		setholder= sets.stream().reduce(setholder,(a,b)->(flatSetMethod(a,b)));
		   return setholder;
	//     return sets.stream().flatMap(p->p.stream()).collect(Collectors.toSet());
	}
	private static Set<String> flatSetMethod(Set<String> a,Set<String> b) {
		      Set<String> ans=new HashSet();
		          a.forEach(ans::add);
		          b.forEach(ans::add);
		    return ans;
	}
}
