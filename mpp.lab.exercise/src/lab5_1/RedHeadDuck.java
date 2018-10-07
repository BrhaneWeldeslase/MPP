package lab5_1;

public class RedHeadDuck extends Duck {
	RedHeadDuck()
	{
		 setFlyBehaviour(new FlyWithWings());
		 setQuacKBehavior(new Quack());
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display RedHeadDuck");
	}

}
