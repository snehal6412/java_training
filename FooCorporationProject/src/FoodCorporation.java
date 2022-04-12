import java.util.Scanner;

public class FoodCorporation {

	void salary(float hours, float basePay) {
		try {

			if (basePay < 8) {
				throw new LessBasePay("Base pay is less than 8");
			} else if (hours > 60) {
				throw new AboveSixtyHours("The hours should be less than 60");
			} else if (hours > 40) {
				float overtime = basePay * 1.5f * (hours - 40);
				float salary = overtime + 40 * basePay;
				System.out.println("The salary along with overtime" + " \t" + salary);
			}

			else {
				float salary = 0.0f;
				salary = hours * basePay;
				System.out.println("The salary is " + salary);
			}

		} catch (LessBasePay e) {
			System.out.println("The base pay should be atleast $8");
		}

		catch (AboveSixtyHours e) {
			System.out.println("The number of hours should be less than or equal to 60");
		}

	}

	public static void main(String[] args) {
		FoodCorporation fc = new FoodCorporation();
		System.out.println("*********");
		boolean details = true;
		while (details) {

			System.out.println("Enter the name of the Employee");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			System.out.println("Enter the number of hours for the employee");

			float hours = sc.nextFloat();

			System.out.println("Enter the basePay ");
			float basePay = sc.nextFloat();
			fc.salary(hours, basePay);
			System.out.println("Do you want to continue, enter true otherwise false");
			details = sc.nextBoolean();
		}
	}
}