package lab9;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lab9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Integer  myMaxStream=Stream.of(5,7,8,4)
  //                                  .max(Comparator.comparing(Integer::valueOf)).get();
//         Integer  myMinStream=Stream.of(5,7,8,4)
//        		                    .min(Comparator.comparing(Integer::valueOf)).get();
//         System.out.println(myMaxStream+"and"+ myMinStream);
		// ANOTHER SOLUTION
//			         Optional<Integer>  myMaxStream=Stream.of(5,7,8,4)
//			                                    .reduce((x, y)->x>y?x:y);
//			         Optional<Integer>  myMinStream=Stream.of(5,7,8,4)
//                             .reduce((x, y)->x<y?x:y);
//			         System.out.println(myMaxStream+"and"+ myMinStream);
		 IntSummaryStatistics  myMaxStream=Stream.of(5,7,8,4).collect(Collectors.summarizingInt(Integer::valueOf));
		                       System.out.println(myMaxStream.getMax()+myMaxStream.getMin());
	}

}
