import java.util.ArrayList;
import java.util.Scanner;

import cafe.Cafe;
import cafe.DessertCafe;

public class Cafemanager {
	ArrayList<Cafe> Cafes = new ArrayList<Cafe>();
	Cafe cafe;
	Scanner input;
	Cafemanager(Scanner input){
		this.input = input;

	}

	public void AddCafe() {
		int kind = 0;
		Cafe cafe ;
		while(kind != 1 && kind != 2) {
			System.out.print("1. for CoffeeCafe : ");
			System.out.print("2. for DessertCafe : ");
			System.out.print("Select num for Cafe Kind between 1 and 2 : ");
			kind = input.nextInt();
			if(kind==1) {
				cafe = new Cafe();
				cafe.getUserInput(input);
				Cafes.add(cafe);
				break;
			}
			else if(kind==2) {
				cafe = new DessertCafe();
				cafe.getUserInput(input);
				Cafes.add(cafe);
				break;
			}
			else {
				System.out.print("Select num for Cafe Kind between 1 and 2 : ");
			}
		}

	}
	public void DeleteCafe() {
		System.out.print("Cafe Name : ");
		String cafeName = input.next();
		int index = -1;
		for (int i=0; i<Cafes.size(); i ++) {
			if (Cafes.get(i).getName().equals(cafeName) ) {
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
			if (cafe.getName().equals(cafeName)) {
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
						String name = input.next();
						cafe.setName(name);

					}
					else if (num==2) {
						System.out.print("Cafe Menu : ");
						String menu = input.next();
						cafe.setMenu(menu);

					}
					else if (num==3) {
						System.out.print("Menu price : ");
						int price = input.nextInt();
						cafe.setPrice(price);

					}
					else if (num==4) {
						System.out.print("Cafe Telephone : ");
						String phone = input.next();
						cafe.setPhone(phone);

					}
					else if(num==5){
						System.out.print("Cafe location : ");
						String location = input.next();
						cafe.setLocation(location);

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
		System.out.println("# of registered Cafes:" + Cafes.size());
		for (int i=0; i<Cafes.size(); i ++) {
			Cafes.get(i).printInfo();
		}
	}
}

