class ThrowDemo {
	static void Demo() {
		try {
			System.out.println("inside method");
			throw new NullPointerException("my data");
		} catch (NullPointerException ne) {
			System.out.println("ne");
		}
	}

	public static void main(String args[]) {
		ThrowDemo.Demo();
	}
}