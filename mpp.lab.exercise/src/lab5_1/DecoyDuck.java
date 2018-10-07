package lab5_1;

public class DecoyDuck extends Duck {

	DecoyDuck()
	{
		setFlyBehaviour(new CanNotFly());
		setQuacKBehavior(new MuteQuack());
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("DecoyDuck display");
	}

}
