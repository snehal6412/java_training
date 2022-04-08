public class OverRide {
	public static void main(String args[]) {
		Animal a = new Animal(); // Animal reference and object
		Animal b = new Dog(); // Animal reference but Dog object
		a.move(); // runs the method in Animal class
		b.move(); // Runs the method in Dog class
	}
}