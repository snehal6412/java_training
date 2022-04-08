import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousinnerClass {
	public static void main(String args[]) {
		List l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(-3);
		l.add(-8);
		System.out.println(l);
		l.sort(new Comparator() {

			@Override
			public int compare(Object n1, Object n2) {

				return ((Integer) n1 - (Integer) n2);
			}
		});

		System.out.println(l);

	}
}
