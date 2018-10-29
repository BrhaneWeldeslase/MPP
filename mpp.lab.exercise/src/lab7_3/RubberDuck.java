package lab7_3;

public class RubberDuck extends Duck {
	
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
		Squeak();
	}
}
