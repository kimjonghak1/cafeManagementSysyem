package cafe;

import java.util.Scanner;

public class DessertCafe extends GyeongsangdoCafe {

	public DessertCafe(Cafekind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {

		setCafeName(input);
		setCafeMenu(input);
		setPrice(input);
		setPhone(input);
		setLocationinGyeongsangdo(input);

	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println(" kind : " + skind +" name : " + name + " menu : " + menu + " price : " + price + " phone : "+ phone + " location : " + location);

	}
}
