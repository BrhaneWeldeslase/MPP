package lab9;

import java.util.stream.Stream;

public class lab9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stream.of("Bill", "Thomas", "Mary")
             .forEach((x)->System.out.print(x+","));
       
	}

}
