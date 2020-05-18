package cafe;

import java.util.Scanner;

import exceptions.LocationFormatException;

public abstract class GyeongsangdoCafe extends Cafe {

	public GyeongsangdoCafe(Cafekind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println(" kind" + skind +"name : " + name + " menu : " + menu + " price : " + price + " phone : "+ phone + " location : " + location + " HeadOffice's phone : "+ phone + " HeadOffice's location : " + location);

	}

	public void setLocationinGyeongsangdo(Scanner input) {
		char answer = 'x';
		while(answer !='y' &&answer !='Y' && answer !='n' &&answer !='N') {
			input.nextLine();
			System.out.print("Is a Cafe in Gyeongsangdo? (Y/N) ");
			answer = input.next().charAt(0);
			try {
				if(answer == 'Y' || answer =='y') {
					setLocation(input);
					break;
				}
				else if (answer == 'n' || answer =='N') {
					this.setLocation("");
					break;
				}
				else {
				}
			}
			catch(LocationFormatException e) {
				System.out.println("Incorrect Location Foramt. put the price that contains ½Ã");
			}
		}


	}

	public void setHeadOfficeLocation(Scanner input) {
		char answer = 'x';
		while(answer !='y' &&answer !='Y' && answer !='n' &&answer !='N') {
			input.nextLine();
			System.out.print("Is a Cafe's Head Office in Gyeongsangdo? (Y/N) ");
			answer = input.next().charAt(0);
			try {
				if(answer == 'Y' || answer =='y') {
					setheadLocation(input);
					setheadPhone(input);
				}
				else if (answer == 'n' || answer =='N') {
					this.setheadLocation("");
					this.setheadPhone("");
					break;
				}
				else {
				}
			}
			catch(LocationFormatException e) {
				System.out.println("Incorrect Location Foramt. put the price that contains ½Ã");
			}

		}


	}
}
