import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import cafe.Cafe;
import cafe.CafeInput;
import cafe.Cafekind;
import cafe.CoffeeCafe;
import cafe.DessertCafe;
import cafe.SmoothieCafe;
import cafe.UnusualCafe;

public class Cafemanager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1816670738165567507L;
	
	ArrayList<CafeInput> Cafes = new ArrayList<CafeInput>();
	Cafe cafe;
	transient Scanner input;
	Cafemanager(Scanner input){
		this.input = input;

	}

	public void AddCafe() {
		int kind = 0;
		CafeInput cafeInput ;
		while(kind < 1 || kind > 4) {
			try {
				System.out.println("1. for CoffeeCafe : ");
				System.out.println("2. for DessertCafe : ");
				System.out.println("3. for SmoothieCafe : ");
				System.out.println("4. for UnusualCafe : ");
				System.out.print("Select num for Cafe Kind between 1 and 4 : ");
				kind = input.nextInt();
				if(kind==1) {
					cafeInput = new CoffeeCafe(Cafekind.CoffeeCafe);
					cafeInput.getUserInput(input);
					Cafes.add(cafeInput);
					break;
				}
				else if(kind==2) {
					cafeInput = new DessertCafe(Cafekind.DessertCafe);
					cafeInput.getUserInput(input);
					Cafes.add(cafeInput);
					break;
				}
				else if(kind==3) {
					cafeInput = new SmoothieCafe(Cafekind.SmoothieCafe);
					cafeInput.getUserInput(input);
					Cafes.add(cafeInput);
					break;
				}
				else if(kind==4) {
					cafeInput = new UnusualCafe(Cafekind.UnusualCafe);
					cafeInput.getUserInput(input);
					Cafes.add(cafeInput);
					break;
				}
			}

			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 4!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}

		}

	}


	public void DeleteCafe() {
		System.out.print("Cafe Name : ");
		String cafeName = input.next();
		int index = findIndex(cafeName);	
		removefromStudents(index, cafeName);
	}

	public int findIndex(String cafeName) {
		int index = -1;
		for (int i=0; i<Cafes.size(); i ++) {
			if (Cafes.get(i).getName().equals(cafeName) ) {
				index = i;
				break;
			}
		}
		return index;

	}


	public int removefromStudents(int index, String cafeName) {
		if(index >= 0) {
			Cafes.remove(index);
			System.out.println("the cafe " + cafeName + " is deleted.");
			return 1;
		}
		else {
			System.out.println("the cafe has not been registered");
			return -1;
		}

	}


	public void EditCafe() {

		System.out.print("Cafe Name : ");
		String cafeName = input.next();
		int index=Cafes.size();
		for (int i=0; i<Cafes.size(); i ++) {
			CafeInput cafe = Cafes.get(i);
			if (cafe.getName().equals(cafeName)) {
				int num = -1;
				while(num!=6) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						cafe.setCafeName(input);
						break;
					case 2:
						cafe.setCafeMenu(input);
						break;
					case 3:
						cafe.setPrice(input);
						break;
					case 4:
						cafe.setPhone(input);
						break;
					case 5:
						cafe.setLocation(input);
						break;
					default: 
						continue;
					}

					break;
				}//if
			}
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
		System.out.println("# of registered Cafes:" + Cafes.size());
		for (int i=0; i<Cafes.size(); i ++) {
			Cafes.get(i).printInfo();
		}
	}


	public void showEditMenu() {
		System.out.println("** Cafe Info Edit Menu **");
		System.out.println("1. Edit Name");
		System.out.println("2. Edit Menu");
		System.out.println("3. Edit Price");
		System.out.println("4. Edit Telephone");
		System.out.println("5. Edit Cafe Location");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1 - 6:");
	}
	
	public void setScanner(Scanner input) {
		this.input=input;
	}
}

