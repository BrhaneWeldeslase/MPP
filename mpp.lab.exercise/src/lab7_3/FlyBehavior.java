package lab7_3;

public interface FlyBehavior {
	public void fly();
	public default void Cannotfly() {
		System.out.println("  cannot fly");
	}
	public default void FlyWithWings() {
		System.out.println("  fly with wings");
	}
}
