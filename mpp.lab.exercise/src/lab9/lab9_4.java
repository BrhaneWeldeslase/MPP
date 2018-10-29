package lab9;

import java.util.stream.IntStream;

public class lab9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               printSquares(4);
	}
	public static void printSquares(int num)
	{
	   IntStream.iterate(1, n->n+1)
		         .map(n->n*n)
		         .limit(num)
		         .forEach(System.out::println);
	}                             
}
