package cafe;

import java.util.Scanner;

public class UnusualCafe extends Cafe {
	protected String HeadOfficephone;
	protected String HeadOfficelocation;

	public UnusualCafe(Cafekind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {

		System.out.print("Cafe Name : ");
		String name = input.next();
		this.setName(name);

		System.out.print("Cafe Menu : ");
		String menu = input.next();
		this.setMenu(menu);

		System.out.print("Menu price : ");
		int price = input.nextInt();
		this.setPrice(price);

		input.nextLine();
		System.out.print("Cafe Telephone : ");
		String phone = input.next();
		this.setPhone(phone);

		char answer = 'x';
		while(answer !='y' &&answer !='Y' && answer !='n' &&answer !='N') {
			input.nextLine();
			System.out.print("Is a Cafe in Gyeongsangdo? (Y/N) ");
			answer = input.next().charAt(0);
			if(answer == 'Y' || answer =='y') {
				System.out.print("Cafe Location : ");
				String location = input.next();
				this.setLocation(location);
				break;
			}
			else if (answer == 'n' || answer =='N') {
				this.setLocation("");
				break;
			}
			else {
			}
		}

		answer = 'x';
		while(answer !='y' &&answer !='Y' && answer !='n' &&answer !='N') {
			input.nextLine();
			System.out.print("Is a Cafe's Head Office in Gyeongsangdo? (Y/N) ");
			answer = input.next().charAt(0);
			if(answer == 'Y' || answer =='y') {
				System.out.print("Head Office Location : ");
				String location = input.next();
				this.setLocation(location);
				break;
			}
			else if (answer == 'n' || answer =='N') {
				this.setLocation("");
				break;
			}
			else {
			}
		}

	}

	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case CoffeeCafe :
			skind ="Coffee";
			break;
		case SmoothieCafe :
			skind = "Smoothie";
			break;
		case UnusualCafe :
			skind = "Unusual";
			break;
		case DessertCafe :
			skind = "Dessert";
			break;
		default:

		}
		System.out.println(" kind" + skind +"name : " + name + " menu : " + menu + " price : " + price + " phone : "+ phone + " location : " + location + " HeadOffice's phone : "+ phone + " HeadOffice's location : " + location);

	}

}
