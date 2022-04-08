import java.io.*;

class Samplethrow {
	void accept() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter ur name: ");
		String name = br.readLine();
		System.out.println("Hai " + name);
	}
}

