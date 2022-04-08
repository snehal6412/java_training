public class CheckBankAccount {
	public static void main(String[] args) {
		LoanAcc l = new LoanAcc();
		l.deposit();
		l.withdraw();
		System.out.println("************");
		SavingAcc l1 = new SavingAcc();
		l1.deposit();
		l1.withdraw();
	}
}