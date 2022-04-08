class AbstractAreas {
	public static void main(String args[]) { // Figure f = new Figure(10, 10); // illegal now
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		System.out.println("Area is " + r.area());
		System.out.println("Area is " + t.area());
	}
}