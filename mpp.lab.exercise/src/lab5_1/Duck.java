package lab5_1;

public abstract class Duck {
	public FlyBehaviour f;
	public QuacKBehavior Q;
	public void swim()
	{
		System.out.println("Duck swim");
	}
   public abstract void display();
   public void fly() {
	   f.fly();
   }
   public void quack()
   {
	   Q.quack();
   }
   public void setFlyBehaviour(FlyBehaviour fly)
   {
	   f=fly;
   }
   public void setQuacKBehavior(QuacKBehavior quack)
   {
	   Q=quack;
   }
}
