package lab5_1;

public class RubberDuck extends Duck {

	RubberDuck()
	{
		 setQuacKBehavior(new Squeak());
		setFlyBehaviour(new CanNotFly());
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("RubberDuck dispaly");
	}

}
