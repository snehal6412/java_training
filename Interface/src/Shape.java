interface Shape {
	void area();

	void volume();

	double pi = 3.14;
}

class Circle implements Shape {
	double r;

	Circle(double radius) {
		r = radius;
	}

	public void area() {
		System.out.println("Area of a circle is : " + pi * r * r);
	}

	public void volume() {
		System.out.println("Volume of a circle is : " + 2 * pi * r);
	}
}

class Rectangle implements Shape {
	double l, b;

	Rectangle(double length, double breadth) {
		l = length;
		b = breadth;
	}

	public void area() {
		System.out.println("Area of a Rectangle is : " + l * b);
	}

	public void volume() {
		System.out.println("Volume of a Rectangle is : " + 2 * (l + b));
	}
}