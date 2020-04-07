import java.util.Scanner;

public class Cafemanager {
	Cafe cafe;
	Scanner input;
	Cafemanager(Scanner input){
		this.input = input;


	}

	public void AddCafe() {
		cafe = new Cafe();
		System.out.print("Cafe Name : ");
		cafe.name = input.next();
		System.out.print("Cafe Menu : ");
		cafe.menu = input.next();
		System.out.print("Menu price : ");
		cafe.price = input.nextInt();
		System.out.print("Cafe Telephone : ");
		cafe.phone = input.next();
		System.out.print("Cafe location : ");
		cafe.location = input.next();



	}
	public void DeleteCafe() {
		System.out.print("Cafe Name : ");
		String cafeName = input.next();
		if (cafe ==null) {
			System.out.println("the cafe has not been registerd \n" );
			return;
		}
		if (cafe.name.equals(cafeName) ) {
			cafe = null;
			System.out.println("the cafe is deleted");
		}
		else {
			System.out.println("there is no cafe that you typed \n");
		}

	}

	public void EditCafe() {

		System.out.print("Cafe Name : ");
		String cafeName = input.next();
		if (cafe.name.equals(cafeName)) {
			int num = -1;
			while(num!=6) {
				System.out.println("** Cafe Info Edit Menu **");
				System.out.println("1. Edit Name");
				System.out.println("2. Edit Menu");
				System.out.println("3. Edit Price");
				System.out.println("4. Edit Telephone");
				System.out.println("5. Edit Cafe Location");
				System.out.println("6. Exit");
				System.out.println("Select one number between 1 - 6:");

				num = input.nextInt();
				if (num==1) {
					System.out.print("Cafe Name : ");
					cafe.name = input.next();

				}
				else if (num==2) {
					System.out.print("Cafe Menu : ");
					cafe.menu = input.next();

				}
				else if (num==3) {
					System.out.print("Menu price : ");
					cafe.price = input.nextInt();

				}
				else if (num==4) {
					System.out.print("Cafe Telephone : ");
					cafe.phone = input.next();

				}
				else if(num==5){
					System.out.print("Cafe location : ");
					cafe.location = input.next();

				}
				else {
					continue;

				}
			}


		}

	}


	public void ViewCafe() {

		System.out.print("Cafe Name : ");
		String cafeName = input.next();
		if (cafe.name.equals (cafeName)) {
			cafe.printInfo();
		}
		else if (cafe ==null) {
			System.out.println("the cafe has not been registerd \n" );
			return;
		}
		else {
			System.out.println("there is no cafe that you typed \n");
		}


	}
}
