package cafe;

import java.util.Scanner;

public abstract class Cafe implements CafeInput {
	protected Cafekind kind = Cafekind.CoffeeCafe;
	protected String name;
	protected String menu;
	protected int price;
	protected String phone;
	protected String location;
	protected String headlocation;
	protected String headphone;

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

	public void setPhone(String headphone) {
		this.phone = headphone;
	}
	
	public String getheadPhone() {
		return headphone;
	}

	public void setheadPhone(String headphone) {
		this.headphone = headphone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getheadLocation() {
		return headlocation;
	}

	public void setheadLocation(String headlocation) {
		this.headlocation = headlocation;
	}

	public abstract void printInfo();
	
	public void setCafeName(Scanner input) {
		System.out.print("Cafe Name : ");
		String name = input.next();
		this.setName(name);
	}

	public void setCafeMenu(Scanner input) {
		System.out.print("Cafe Menu : ");
		String menu = input.next();
		this.setMenu(menu);
	}

	public void setPrice(Scanner input) {
		System.out.print("Menu price : ");
		int price = input.nextInt();
		this.setPrice(price);
	}

	public void setPhone(Scanner input) {
		System.out.print("Cafe Telephone : ");
		String phone = input.next();
		this.setPhone(phone);
	}
	
	public void setheadPhone(Scanner input) {
		System.out.print("head Office Telephone : ");
		String headphone = input.next();
		this.setheadPhone(headphone);
	}

	public void setLocation(Scanner input) {
		System.out.print("Cafe location : ");
		String location = input.next();
		this.setLocation(location);
	}
	
	public void setheadLocation(Scanner input) {
		System.out.print("Head Office Location : ");
		String location = input.next();
		this.setheadLocation(location);
	}

	public String getKindString() {
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
		return skind;
	
	}


}
