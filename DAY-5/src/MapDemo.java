import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<>();
		marks.put("jon", 90);// auto boxing
		marks.put("kima", 40);
		System.out.println(marks);

		int rammarks = marks.get("Jon");// auto unboxing
		marks.remove("jon");
		System.out.println(marks);

	}

}
