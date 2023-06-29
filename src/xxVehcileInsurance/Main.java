package xxVehcileInsurance;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Vehicle Type: [c]Car || [t]Truck || [b]bus || [m]Motorcycle\nVehicle: ");
		String type = scn.nextLine();
		System.out.println("");
		
		String vehicle = "\0";
		int premium = 0;
		
		switch(type) {
		case "c":
			vehicle = "Car";
			premium = 200;
			break;
		case "t":
			vehicle = "Truck";
			premium = 300;
			break;
		case "b":
			vehicle = "Bus";
			premium = 400;
			break;
		case "m":
			System.out.print("Motorcycle Type: [1]lower || [2]Medium || [3]High\nMotorcylce: ");
			String motor = scn.nextLine();
			System.out.println("");
			
			int motortype = Integer.parseInt(motor); //Interpreting String Values To Integers
			
			switch(motortype) {
			case 1:
				vehicle = "Lower Motorcycle";
				premium = 300;
				break;
			case 2:
				vehicle = "Medium Motorcycle";
				premium = 400;
				break;
			case 3:
				vehicle = "High Motorcycle";
				premium = 500;
				break;
			default:
				System.out.print("Motorcylce Not Found\n");
				break;
			}
		}
		System.out.print("Vehicle: " + vehicle + " " + "Premium: " + premium);
		scn.close();
		
	}

}
