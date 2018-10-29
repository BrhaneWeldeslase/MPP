package lab7_3;

import lab5_1.MuteQuack;

public class DecoyDuck extends Duck {
	
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		Cannotfly();
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		MuteQuack();
	}
}
