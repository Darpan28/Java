
public class UberApp {

	public static void main(String[] args) {
		Cab c1 = new Cab();
		Driver d1 = new Driver();
		
		c1.setDataForCab("PB10CD1229","White","Swift","Sedan");
		d1.setDataForDriver("Jack","+91 99999 88888","Jack@example.com", 'M');
		d1.cRef = c1;
		d1.showDataForDriver();


	}

}
