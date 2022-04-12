import java.util.ListIterator;
import java.util.Vector;

class VectorDemo {
	public static void main(String args[]) {
		Vector<Integer> v = new Vector<Integer>();
		int x[] = { 10, 20, 30, 40, 50 };
//When x[i] is stored into v below, x[i] values are converted into Integer Objects 
		// and stored into v. This is auto boxing.
		for (int i = 0; i < x.length; i++)
			v.add(x[i]);
		System.out.println("Getting Vector elements using get () method: ");
		for (int i = 0; i < v.size(); i++)
			System.out.print(v.get(i) + "\t");
		System.out.println("\nRetrieving elements in Vector using ListIterator :");
		ListIterator lit = v.listIterator();
		while (lit.hasNext())
			System.out.print(lit.next() + "\t");
		System.out.println("\nRetrieving elements in reverse order using ListIterator :");
		while (lit.hasPrevious())
			System.out.print(lit.previous() + "\t");
	}
}