
public class AmazonApp {

	public static void main(String[] args) {
		Address[] adr = new Address[2];
		
		for(int i=0;i<adr.length;i++) {
			adr[i] = new Address();
		}
		
		Order[] odr = new Order[4];
		
		for(int i =0;i<odr.length;i++) {
			odr[i] = new Order();
		}
		
		adr[0].setAddressDetails("Model Town","Ludhiana", 141001, "Punjab");
		adr[1].setAddressDetails("CGC","Mohali", 160055, "Punjab");
		
		odr[0].setOrderDetails("Earphones","30/01/2019",1,800,"COD");
		odr[1].setOrderDetails("Mobile","30/01/2019",1,15000,"COD");
		odr[2].setOrderDetails("Shoes","30/01/2019",1,5000,"Card Payement");
		odr[3].setOrderDetails("Jeans","30/01/2019",1,2000,"PayTm");
		
		Customer c1 = new Customer();
		
		c1.setDetailsForCustomer("Mohan", "Mohan@gmail.com", "+91 77777 88888", adr, odr);
		
		c1.showCustomerDetails();
		
		System.out.println("########################");
		System.out.println(c1.name+" spent \u20b9"+c1.kharcha());
		

	}

}
