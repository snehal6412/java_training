class Employ extends Person {
	int id;
	String companyName;
	String companyAddress;

	Employ(int id, String name, String permanentAddress, int age, String companyName, String companyAddress) {
		this.id = id;
		set_PermanentDetails(name, permanentAddress, age);
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}

	void get_EmployDetails() {
		System.out.println("Employ Id : " + id);
		get_PermanentDetails();
		System.out.println("Company Name : " + companyName);
		System.out.println("Company Address : " + companyAddress);
	}

	
}