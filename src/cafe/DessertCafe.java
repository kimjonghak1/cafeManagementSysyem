package cafe;

import java.util.Scanner;

public class DessertCafe extends Cafe {

	public DessertCafe(Cafekind kind) {
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
	}


}
