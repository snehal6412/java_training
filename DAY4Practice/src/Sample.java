import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample {
	void accept() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter ur name: ");
		String name = br.readLine();
		System.out.println("Hai " + name);
	}
}