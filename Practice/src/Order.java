
public class Order {
	String oName;
	String date;
	int quantity;
	int price;
	String payMeth;
	
	void setOrderDetails(String oName,String date,int quantity,int price,String payMeth) {
		this.oName = oName;
		this.date = date;
		this.quantity = quantity;
		this.price = price;
		this.payMeth = payMeth;
	}
		
		
	void showOrderDetails() {
		System.out.println("=====Order Details=====");
		System.out.println("Order is:"+oName);
		System.out.println("Date is:"+date);
		System.out.println("Quantity is:"+quantity);
		System.out.println("Price is:\u20b9"+price);
		System.out.println("payMeth is:"+payMeth);
		System.out.println("==========================");
		
	}
		


}
