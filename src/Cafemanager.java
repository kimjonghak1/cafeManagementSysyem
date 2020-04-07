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
			System.out.println("the cafe to be edited is " + cafeName+"\n");
			cafe.nameChange();

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
