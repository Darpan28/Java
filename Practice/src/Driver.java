
public class Driver {
	String name;
	String phone;
	String email;
	char gender;
	
	Cab cRef;
	
	void setDataForDriver(String nm, String ph, String em, char gen) {
		name = nm;
		phone = ph;
		email = em;
		gender = gen;
		
	}
	
	void showDataForDriver() {
		System.out.println("*****Driver Data*****");
		System.out.println("Name of driver is:"+name);
		System.out.println("Phone of driver is:"+phone);
		System.out.println("Email of driver is:"+email);
		System.out.println("Gender of driver is:"+gender);
		System.out.println("*****Driver Cab Details*****");
		cRef.showDataForCAb();
	}

}
