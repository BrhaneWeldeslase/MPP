package lab7_3;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = 
			{new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
		for(Duck d: ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			d.fly();
			d.quack();
			d.display();
		}

	}

}
