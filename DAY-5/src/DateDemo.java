import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Calendar c = new Calendar.Builder().build();
		System.out.println(c.getCalendarType());

		Date dob = new Date();

		System.out.println(dob.getDate());
	}

}
