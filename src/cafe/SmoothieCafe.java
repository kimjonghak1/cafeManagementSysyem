package cafe;

import java.util.Scanner;

public class SmoothieCafe extends Cafe {
	public SmoothieCafe(Cafekind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setCafeName(input);
		setCafeMenu(input);
		setPrice(input);
		setPhone(input);
		setLocation(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println(" kind : " + skind +" name : " + name + " menu : " + menu + " price : " + price + " phone : "+ phone + " location : " + location + " HeadOffice's phone : "+ phone + " HeadOffice's location : " + location);

	}


}
