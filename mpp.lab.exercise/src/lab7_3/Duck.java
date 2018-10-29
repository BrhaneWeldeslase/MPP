package lab7_3;

abstract public class Duck implements FlyBehavior,QuackBehavior  {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	abstract public void display();
	abstract public void fly();
	abstract public void quack();
//	public void fly() {
//		flyBehavior.fly();
//	
//	}
//	public void quack() {
//		quackBehavior.quack();
//	}
//	protected void setFlyBehavior(FlyBehavior b) {
//		flyBehavior = b;
//	}
//	protected void setQuackBehavior(QuackBehavior b) {
//		quackBehavior = b;
//	}
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void swim() {
		System.out.println("  swimming");
	}
	
}
