class UserMyException extends Exception {
	int accno[] = { 1001, 1002, 1003, 1004, 1005 };
	String name[] = { "Hari", "Siva", "Bhanu", "Rama", "Chandu" };
	double bal[] = { 2500, 3500, 1500, 1000, 6000 };

	UserMyException() {
	}

	UserMyException(String str) {
		super(str);
	}

	public static void main(String args[]) {
		try {
			UserMyException me = new UserMyException("");
			System.out.println("AccNo \t Name \t Balance ");
			for (int i = 0; i < 5; i++) {
				System.out.println(me.accno[i] + "\t" + me.name[i] + "\t" + me.bal[i]);
				if (me.bal[i] < 2000) {
					UserMyException me1 = new UserMyException("Insufficient Balance");
					throw me1;
				}
			}
		} catch (UserMyException e) {
			e.printStackTrace();
		}
	}
}