
public class Address {
	//double latitude;
	//double longitude;
	String adresLine1;
	String city;
	int zipCode;
	String state;
	
	void setAddressDetails(String adresLine1,String city,int zipCode,String state) {
		//this.latitude = latitude;
		//this.longitude = longitude;
		this.adresLine1 = adresLine1;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		
	}
	
	void showAddressDetails() {
		System.out.println("=====Address Details=====");
		//System.out.println("Location is:"+latitude+":"+longitude);
		System.out.println("Adress is:"+adresLine1);
		System.out.println("City is:"+city);
		System.out.println("Zipcode is:"+zipCode);
		System.out.println("State is:"+state);
		System.out.println("==========================");
	}

}
