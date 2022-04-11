public class PersonDetails {

	private String name;
	private String accountType;
	private String city;
	private String state;
	private int pin;
	private long phoneNumber;
	private String houseNumber;
	private String street;
	private int balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int b) {
		this.balance = b;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public boolean withdraw(int w) {
		if (getBalance() < w) {
			System.out.println("InsuficentFunds");
			return false;
		} else {
			System.out.println("Amount after withdrawn :" + (getBalance() - w));
			return true;
		}
	}

}