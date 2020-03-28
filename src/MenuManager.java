import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 5;
		while(num!=6) {
			System.out.println("*** Cafe Management System Menu ***");
			System.out.println("1. Add Cafe");
			System.out.println("2. Delete Cafe");
			System.out.println("3. Edit Cafe");
			System.out.println("4. View Cafe");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 6:");
			Scanner sc = new Scanner (System.in);
			num = sc.nextInt();
			if (num==1) {
				AddCafe();
			}
			else if (num==2) {
				DeleteCafe();
			}
			else if (num==3) {
				EditCafe();
			}
			else if (num==4) {
				ViewCafe();
			}
			else {
				continue;

			}
		}

	}
	public static void AddCafe() {
		Scanner input = new Scanner(System.in);
		System.out.print("Cafe ID : ");
		String cafeId = input.nextLine();
		System.out.print("Cafe Name : ");
		String cafeName = input.nextLine();
		System.out.print("Cafe Email address : ");
		String cafeEaddress = input.nextLine();
		System.out.print("Cafe Telephone : ");
		String cafePhone = input.nextLine();



	}
	public static void DeleteCafe() {
		Scanner input = new Scanner(System.in);
		System.out.print("Cafe ID : ");
		String cafeId = input.nextLine();


	}

	public static void EditCafe() {
		Scanner input = new Scanner(System.in);
		System.out.print("Cafe ID : ");
		String cafeId = input.nextLine();



	}


	public static void ViewCafe() {
		Scanner input = new Scanner(System.in);
		System.out.print("Cafe ID : ");
		String cafeId = input.nextLine();



	}
}