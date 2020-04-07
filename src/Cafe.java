import java.util.Scanner;

public class Cafe {

	String name;
	String menu;
	int price;
	String phone;
	String location;
	Scanner input = new Scanner(System.in);
	public Cafe() {
		
	}
	
	public Cafe (String name, String menu, int price, String phone, String location) {
		this.name=name;
		this.menu=menu;
		this.price=price;
		this.phone=phone;
		this.location=location;
		
	}
	public void printInfo() {
		System.out.println("name : " + name + " menu : " + menu + " price : " + price + " phone : "+ phone + " location : " + location);
		
	}
	public void nameChange() {
		System.out.println("Change the Name : ");
		String changeName = input.next();
		this.name=changeName;
		return;
	}
	
}
