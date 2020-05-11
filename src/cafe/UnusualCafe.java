package cafe;

import java.util.Scanner;

public class UnusualCafe extends GyeongsangdoCafe  {
	public UnusualCafe(Cafekind kind) {
		super(kind);
		// TODO Auto-generated constructor stub
	}



	protected String HeadOfficephone;
	protected String HeadOfficelocation;

	

	public void getUserInput(Scanner input) {

		setCafeName(input);
		setCafeMenu(input);
		setPrice(input);
		setPhone(input);
		setLocationinGyeongsangdo(input);
		setHeadOfficeLocation(input);
		
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println(" kind" + skind +"name : " + name + " menu : " + menu + " price : " + price + " phone : "+ phone + " location : " + location + " HeadOffice's phone : "+ headphone + " HeadOffice's location : " + headlocation);

	}
	

}
