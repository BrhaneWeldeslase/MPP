package lab7_3;

public interface QuackBehavior {
	public void quack();
	public default void Squeak() {
		System.out.println("  squeaking");
	}
	public default void MuteQuack() {
		System.out.println("  cannot quack");
	}
	public default void Quack() {
		System.out.println("  quacking");
	}
}
