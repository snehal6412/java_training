public class Main {

	public static void main(String[] args) {
		
		PersonDetails p=new PersonDetails();
		p=AccountDetails.getAccount();
		int c=AccountDetails.getWithdrawAmount();
		p.withdraw(c);
	}
}