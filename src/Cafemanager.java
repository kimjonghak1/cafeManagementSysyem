import java.util.ArrayList;
import java.util.Scanner;

public class Cafemanager {
	ArrayList<Cafe> Cafes = new ArrayList<Cafe>();
	Cafe cafe;
	Scanner input;
	Cafemanager(Scanner input){
		this.input = input;


	}

	public void AddCafe() {
		Cafe cafe = new Cafe();
		System.out.print("Cafe Name : ");
		cafe.name = input.next();
		System.out.print("Cafe Menu : ");
		cafe.menu = input.next();
		System.out.print("Menu price : ");
		cafe.price = input.nextInt();
		input.nextLine();
		System.out.print("Cafe Telephone : ");
		cafe.phone = input.next();
		input.nextLine();
		System.out.print("Cafe location : ");
		cafe.location = input.nextLine();
		Cafes.add(cafe);


	}
	public void DeleteCafe() {
		System.out.print("Cafe Name : ");
		String cafeName = input.next();
		int index = -1;
		for (int i=0; i<Cafes.size(); i ++) {
			if (Cafes.get(i).name.equals(cafeName) ) {
				index = i;
				break;
			}

		}
		if(index >= 0) {
			Cafes.remove(index);
			System.out.println("the cafe " + cafeName + " is deleted.");

		}
		else {
			System.out.println("the cafe has not been registered");
			return;
		}

	}

	public void EditCafe() {

		System.out.print("Cafe Name : ");
		String cafeName = input.next();
		int index=Cafes.size();
		for (int i=0; i<Cafes.size(); i ++) {
			Cafe cafe = Cafes.get(i);
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

					}//if
				}//while
				break;
			}//if
			else if(index==0) {
				System.out.println("the cafe has not been registered.");
			}
			else {
				System.out.println("the cafe you typed do not match ");
				break;
			}

		}//for

	}


	public void ViewCafes() {

		//	System.out.print("Cafe Name : ");
		//	String cafeName = input.next();
		for (int i=0; i<Cafes.size(); i ++) {
			Cafes.get(i).printInfo();
		}
	}
}

