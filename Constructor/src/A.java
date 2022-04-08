class A {
	int x;

	A(int x) {
		this.x = x;
	}

	void show() {
		System.out.println("super class method: x = " + x);
	}
}

class B extends A {
	int y;

	B(int a, int b) {
		super(a); // (or) x=a;
		y = b;
	}

	void show() {
		super.show();
		System.out.println("y = " + y);
		System.out.println("super x = " + super.x);
	}
}
