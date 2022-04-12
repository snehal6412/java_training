import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class HashMapDemo {
	@SuppressWarnings("removal")
	public static void main(String args[]) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(new Integer(101), "Naresh");
		hm.put(new Integer(102), "Rajesh");
		hm.put(new Integer(103), "Suresh");
		hm.put(new Integer(104), "Mahesh");
		hm.put(new Integer(105), "Ramesh");
		Set<Integer> set = new HashSet<Integer>();
		set = hm.keySet();
		System.out.println(set);
	}
}