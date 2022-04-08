abstract class Figure {
	double dim1;
	double dim2;

	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	abstract double area(); // area is now an abstract method
}

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b);
	}

	double area() // override area for rectangle
	{
		System.out.println("Inside Area of Rectangle.");
		return dim1 * dim2;
	}
}

class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a, b);
	}

	double area() // override area for right triangle
	{
		System.out.println("Inside Area of Triangle.");
		return dim1 * dim2 / 2;
	}
}