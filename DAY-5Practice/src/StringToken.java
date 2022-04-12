import java.util.StringTokenizer;

public class StringToken {
	public static void main(String args[]) { // take a String
		String str = "Java is an OOP Language";
		// brake wherever a space is found
		StringTokenizer st = new StringTokenizer(str, "a\t");
		// retrieve tokens and display
		System.out.println("The tokens are: ");
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s);
		}
	}
}
