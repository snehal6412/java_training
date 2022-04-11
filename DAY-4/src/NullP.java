
public class NullP {
	static String name;

	public static void main(String[] args) {
		try {
			name.chars();
			System.out.println("1");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("NPE");
		} catch (Exception e1) {
			System.out.println("Exception");
		} finally {

		}
		System.out.println("always called");
	}

}
