package cafe;

import java.util.Scanner;

import exceptions.LocationFormatException;
import exceptions.PriceFormatException;

public abstract class Cafe implements CafeInput {
	protected Cafekind kind = Cafekind.CoffeeCafe;
	protected String name;
	protected String menu;
	protected String price;
	protected String phone;
	protected String location;
	protected String headlocation;
	protected String headphone;

	public Cafe() {

	}
	public Cafe(Cafekind kind) {
		this.kind = kind;

	}

	public Cafe (String name, String menu, String price, String phone, String location) {
		this.name=name;
		this.menu=menu;
		this.price=price;
		this.phone=phone;
		this.location=location;

	}

	public Cafe (Cafekind kind, String name, String menu, String price, String phone, String location) {
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) throws PriceFormatException {
		if(!price.contains("$") && !price.contentEquals("")) {
			throw new PriceFormatException();
		}
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

	public void setLocation(String location) throws LocationFormatException {
		if(!location.contains("시") && !location.equals("")) {
			throw new LocationFormatException();
		}
		this.location = location;
	}

	public String getheadLocation() {
		return headlocation;
	}

	public void setheadLocation(String headlocation) throws LocationFormatException {
		if(!headlocation.contains("시") && !location.equals("")) {
			throw new LocationFormatException();
		}
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
		String price ="";
		while(!price.contains("$") || price.equals("")) {
			System.out.print("Menu price : ");
			price = input.next();
			try {
				this.setPrice(price);
			} catch (PriceFormatException e) {
				System.out.println("Incorrect Price Foramt. put the price that contains $");
			}
		}
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
		String Location ="";
		while(!Location.contains("시") || Location.equals("")) {
			System.out.print("Cafe Location : ");
			Location = input.next();
			try {
				this.setLocation(Location);
			} catch (LocationFormatException e) {
				System.out.println("Incorrect Location Foramt. put the location that contains 시");
			}
		}
	}

	public void setheadLocation(Scanner input) {
		String headlocation = "";
		while(!headlocation.contains("시") || headlocation.contentEquals("")) {
			System.out.print("Head Office Location : ");
			headlocation = input.next();
			try {
				this.setheadLocation(headlocation);
			} catch (LocationFormatException e) {
				System.out.println("Incorrect Location Foramt. put the price that contains 시");
			}
		}
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
