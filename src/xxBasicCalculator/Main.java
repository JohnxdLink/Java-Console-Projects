package xxBasicCalculator;
import java.util.*;
import java.lang.Math;

@SuppressWarnings("unused")
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, result;
        String type;
        
        type = "";
        System.out.println("Welcome To Calculator!");
        System.out.println("Type S to Start");
        System.out.println("Type Q to Quit");
        System.out.print("Type: ");
        while (true) {
            type = input.nextLine();
            if (type.equals("S") || type.equals("s")) {
                while (true) {
                    System.out.println("Choose an Operator: 1: (+) 2: (-) 3: (*) 4. (/) 5. C");
                    type = input.nextLine();
                    if (type.equals("1")) {
                        System.out.println("Addition:");
                        System.out.println("Enter 1st Number:");
                        x = input.nextInt();
                        System.out.println("Enter 2nd Number:");
                        y = input.nextInt();
                        result = x + y;
                        System.out.println("Sum: " + result);
                    }
                    if (type.equals("2")) {
                        System.out.println("Subtraction:");
                        System.out.println("Enter 1st Number:");
                        x = input.nextInt();
                        System.out.println("Enter 2nd Number:");
                        y = input.nextInt();
                        result = x - y;
                        System.out.println("Difference: " + result);
                    }
                    if (type.equals("3")) {
                        System.out.println("Multiplication:");
                        System.out.println("Enter 1st Number:");
                        x = input.nextInt();
                        System.out.println("Enter 2nd Number:");
                        y = input.nextInt();
                        result = x * y;
                        System.out.println("Product: " + result);
                    }
                    if (type.equals("4")) {
                        System.out.println("Division:");
                        System.out.println("Enter 1st Number:");
                        x = input.nextInt();
                        System.out.println("Enter 2nd Number:");
                        y = input.nextInt();
                        result = (int) ((double) x / y);
                        System.out.println("Quotient: " + result);
                    }
                    if (type.equals("5")) {
                        System.out.println("Close Operation");
                    } else {
                        System.out.println("Invalid Input");
                    }
                }
            } else {
                if (type.equals("Q") || type.equals("q")) {
                    System.out.println("Quit Calculator");
                } else {
                    System.out.println("Invalid Input");
                }
            }
        }
    }
}
