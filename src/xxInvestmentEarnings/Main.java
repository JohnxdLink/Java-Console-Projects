package xxInvestmentEarnings;
import java.util.*;
import java.text.*; //Decimal Format

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Buying Price: ");
		double buyingprice = scn.nextDouble();
		int day = 1;
		double closingprice = 0.1;
		DecimalFormat dft = new DecimalFormat("0.00");
		
		while(true) {
			System.out.print("Day: " + day + " || Closing Price: ");
			closingprice = scn.nextDouble();
			System.out.println("");
			if(closingprice < 0.0) break;
			double earnings = closingprice - buyingprice;
			if(earnings > 0.0) {
				System.out.print("After Day: " + day + " || Earned: " + dft.format(earnings) + "\n");
			} else if(earnings < 0.0) {
				System.out.print("After Day: " + day + " || Lost: " + dft.format((-earnings))  + "\n");
			} else {
				System.out.print("After Day " + day + "  || Earned: None"  + "\n");
			}
			day++;
		}
		
	}

}
