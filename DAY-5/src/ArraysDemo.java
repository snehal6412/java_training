import java.util.Arrays;

public class ArraysDemo {
//	public static void main(String[] args) {
//		arrayOfNumbers();
//	}
//
//	private static void arrayOfNumbers() {
//		int[] n = new int[10];
//		n[0] = 1;
//		n[9] = 9;
//		System.out.println(Arrays.toString(n));
//
//	}
//}

	public static void main(String[] args) {
		arrayOfObject();
	}

	private static void arrayOfObject() {
//		String[] n= new String[10];
		String[] n = new String[] { "Ram", "john" };
		System.out.println(n.length);
		System.out.println(n[1]);
		n[1] = "tom";
		System.out.println(n[1]);

	}
}
