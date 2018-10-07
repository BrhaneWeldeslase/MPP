package lab5_1;

public class MullDuck extends Duck {
	MullDuck()
	{
		setFlyBehaviour(new FlyWithWings());
		setQuacKBehavior(new Quack());
	}
	
	  public void display()
	 {
		 System.out.println("mullDuck display");
	 }
}
