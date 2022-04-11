
import java.util.*;

public class AccountDetails {

	public static PersonDetails getAccount() {
		PersonDetails p = new PersonDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter OwnerName");
		p.setName(sc.nextLine());
		System.out.println("Enter your city");
		p.setCity(sc.nextLine());
		System.out.println("Enter your state");
		p.setState(sc.nextLine());
		System.out.println("Enter pin");
		p.setPin(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter your phoneNumber");
		p.setPhoneNumber(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter your houseNumber");
		p.setHouseNumber(sc.nextLine());
		System.out.println("Enter your street");
		p.setStreet(sc.nextLine());
		System.out.println("Enter your AccountType");
		p.setAccountType(sc.nextLine());
		int b;
		do {
			System.out.println("Enter Balance");
			p.setBalance(sc.nextInt());
			b = p.getBalance();
			if (b <= 0)
				System.out.println("Balance should be positive");
		} while (b <= 0);
		return p;
	}

	public static int getWithdrawAmount() {
		Scanner sc = new Scanner(System.in);
		int w;
		do {
			System.out.println("Enter amount to be withdrawn:");
			w = sc.nextInt();
			if (w <= 0)
				System.out.println("Amount should be positive");
		} while (w <= 0);
		return w;
	}

}