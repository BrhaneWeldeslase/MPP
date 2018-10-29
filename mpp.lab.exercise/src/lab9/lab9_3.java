package lab9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lab9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String> names=Arrays.asList("daniel","tarik","Radea");
         System.out.println(new lab9_3().countWords(names,'d','t',6));
        
	}
	public int countWords(List<String> words, char c, char d, int len)
	{
		return (int)words.stream()
				          .filter((x)->x.contains(Character.toString(c)))
		                  .filter((x)->!x.contains(Character.toString(d)))
		                  .count();
		
	}
}
