import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		Cafemanager cafemanager = new Cafemanager(input);
		int num = -1;
		while(num!=5) {
			System.out.println("*** Cafe Management System Menu ***");
			System.out.println("1. Add Cafe");
			System.out.println("2. Delete Cafe");
			System.out.println("3. Edit Cafe");
			System.out.println("4. View Cafe");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5:");
			
			num = input.nextInt();
			if (num==1) {
				cafemanager.AddCafe();
			}
			else if (num==2) {
				cafemanager.DeleteCafe();
			}
			else if (num==3) {
				cafemanager.EditCafe();
			}
			else if (num==4) {
				cafemanager.ViewCafe();
			}
			else {
				continue;

			}
		}

	}

}