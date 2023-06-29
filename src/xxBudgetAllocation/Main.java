package xxBudgetAllocation;
import java.util.*;
import java.util.ArrayList; //In order to function the Array List

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("How musch can you spend? ");
		double total = scn.nextDouble();
		double sum = 0;
		int i = 0; //Index
		
		ArrayList<Double> proportion = new ArrayList<Double>(); //Storing Double Variables
		System.out.println("Proportions Various Expenses: ");
		System.out.println("The Systems Stops If Cumulative proportion exceeds 100%");
		
		do {
			System.out.print("Proportions: " + (i+1) + "\nEnter Value: ");
			double value = scn.nextDouble();
			proportion.add(value); //adding the proportion to ArrayList to Store
			sum += proportion.get(i);
			i++;
		} while(sum <= 100);
		
		scn.close();
		
		if(sum > 100) {
			double cumulativeSum = 0.0;
			for(int j = 0; j < proportion.size() - i; j++) {
				cumulativeSum += proportion.get(j);
			}
			proportion.set(proportion.size() - 1, 100.0 - cumulativeSum);
		}
		
		for(double value : proportion) {
			double expense = value * total / 100.0;
			System.out.println("Value: " + value + " Expense: " + expense);
		}
	}

}
