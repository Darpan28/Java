
public class Cab {
	String regNum;
	String color;
	String name;
	String type;
	
	void setDataForCab(String rn, String clr, String nm, String tp) {
		regNum = rn;
		color = clr;
		name = nm;
		type = tp;
	}
	
	void showDataForCAb() {
		System.out.println("****Cab Data*****");
		System.out.println("RegNum of cab is:"+regNum);
		System.out.println("Color of cab is:"+color);
		System.out.println("Name of cab is:"+name);
		System.out.println("Type of cab is:"+type);
	}

}
