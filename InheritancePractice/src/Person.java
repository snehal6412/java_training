class Person {
	String name;
	String permanentAddress;
	int age;

	void set_PermanentDetails(String name, String permanentAddress, int age) {
		this.name = name;
		this.permanentAddress = permanentAddress;
		this.age = age;
	}

void get_PermanentDetails ()
{ System.out.println ("Name : " + name);
System.out.println ("Permanent Address : " + permanentAddress);
System.out.println ("Age :" + age);
}
}