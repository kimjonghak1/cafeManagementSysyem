package cafe;

import java.util.Scanner;

public class Cafe {
	protected Cafekind kind = Cafekind.CoffeeCafe;
	protected String name;
	protected String menu;
	protected int price;
	protected String phone;
	protected String location;


	public Cafe() {

	}
	public Cafe(Cafekind kind) {
		this.kind = kind;

	}

	public Cafe (String name, String menu, int price, String phone, String location) {
		this.name=name;
		this.menu=menu;
		this.price=price;
		this.phone=phone;
		this.location=location;

	}

	public Cafe (Cafekind kind, String name, String menu, int price, String phone, String location) {
		this.name=name;
		this.menu=menu;
		this.price=price;
		this.phone=phone;
		this.location=location;
		this.kind=kind;
	}
	public Cafekind getKind() {
		return kind;
	}

	public void setKind(Cafekind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case CoffeeCafe :
			skind ="Coffee";
			break;
		case SmoothieCafe :
			skind = "Smoothie";
			break;
		case UnusualCafe :
			skind = "Unusual";
			break;
		case DessertCafe :
			skind = "Dessert";
			break;
		default:

		}
		System.out.println("kind" + skind +"name : " + name + " menu : " + menu + " price : " + price + " phone : "+ phone + " location : " + location);

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

		input.nextLine();
		System.out.print("Cafe location : ");
		String location = input.nextLine();
		this.setLocation(location);
	}

}
