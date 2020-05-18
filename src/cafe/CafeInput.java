package cafe;

import java.util.Scanner;

import exceptions.LocationFormatException;
import exceptions.PriceFormatException;

public interface CafeInput {

	public String getName();

	public void setName(String name);

	public void setMenu(String menu);

	public void setPrice(String price) throws PriceFormatException;

	public void setPhone(String phone);

	public void setLocation(String location) throws LocationFormatException;

	public void setCafeName(Scanner input);

	public void setCafeMenu(Scanner input);

	public void setPrice(Scanner input);

	public void setPhone(Scanner input);

	public void setLocation(Scanner input);

	public void printInfo();

	public void getUserInput(Scanner input);

}
