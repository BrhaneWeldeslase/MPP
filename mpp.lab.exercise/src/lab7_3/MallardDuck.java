package lab7_3;

import lab5_1.FlyWithWings;
import lab5_1.Quack;

public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.println("  display");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		FlyWithWings();
		
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Quack();
	}

}
