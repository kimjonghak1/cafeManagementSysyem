import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Cafemanager cafemanager = getObject("cafemanager.ser");
		if(cafemanager==null) {
			cafemanager = new Cafemanager(input);
		}
		else {
			cafemanager.setScanner(input);
		}
		selectMenu(input, cafemanager);
		putObject(cafemanager, "cafemanager.ser");
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
					logger.log("add a a Cafe");
					break;
				case 2:
					cafemanager.DeleteCafe();
					logger.log("delete a a Cafe");
					break;
				case 3:
					cafemanager.EditCafe();
					logger.log("edit a a Cafe");
					break;
				case 4:
					cafemanager.ViewCafes();
					logger.log("view a a Cafe");
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
	
	public static Cafemanager getObject(String filename) {
		Cafemanager cafemanager = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			cafemanager=(Cafemanager)in.readObject();
			
			in.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			return cafemanager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return cafemanager;	
		
	}
	
	public static void putObject(Cafemanager cafemanager,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(cafemanager);
			
			out.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}