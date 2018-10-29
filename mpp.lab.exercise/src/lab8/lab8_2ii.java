package lab8;

import java.util.function.Supplier;

public class lab8_2ii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Supplier<Double> randomNum=()->Math.random();
         System.out.println(randomNum.get());
	}

}
