import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Cafemanager cafemanager = new Cafemanager(input);

		selectMenu(input, cafemanager);
	}
	public static void selectMenu(Scanner input,Cafemanager cafemanager) {
		int num = -1;
		while(num!=5) {

			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					cafemanager.AddCafe();
					break;
				case 2:
					cafemanager.DeleteCafe();
					break;
				case 3:
					cafemanager.EditCafe();
					break;
				case 4:
					cafemanager.ViewCafes();
					break;
				default: continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}

	}


	public static void showMenu() {
		System.out.println("*** Cafe Management System Menu ***");
		System.out.println("1. Add Cafe");
		System.out.println("2. Delete Cafe");
		System.out.println("3. Edit Cafe");
		System.out.println("4. View Cafes");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}
}