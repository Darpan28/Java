
public class Customer {
	String name;
	String email;
	String phone;
	Address[] addresses;  // 1 to many
	Order[] orders;       // 1 to many
	
	void setDetailsForCustomer(String name,String email,String phone,Address[] addresses,Order[] orders) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.addresses = addresses;
		this.orders = orders;
		
	
		
	}
	
	void showCustomerDetails() {
		System.out.println("=====Customer "+name+"=====");
		System.out.println("The e-mail is:"+email);
		System.out.println("The phone is:"+phone);
		
		System.out.println("*****Address*****");
		
		for(Address aRef: addresses) {
			aRef.showAddressDetails();
		}
		
		System.out.println("*****************");
		System.out.println(">>>>>Orders<<<<<");
		for(Order odr : orders) {
			odr.showOrderDetails();
		}
		System.out.println(">>>>>>>><<<<<<<<<");
		
		
	}
	int kharcha() {
		int total = 0;
		for(Order odr : orders) {
			
			total = total + odr.price;
			
		}
		
		return total;
	}

}
