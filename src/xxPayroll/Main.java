package xxPayroll;
import java.util.*;
import java.lang.Math;

@SuppressWarnings("unused")
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String name, address, job;
        double age, salary, days;
        double tax, convert, allowance, grosspay, taxdeduc, netpay;
        
        allowance = 50;
        tax = 0.03;
        convert = tax * 100;
        System.out.println("**************************************************");
        System.out.println("*                                                *");
        System.out.println("*                PAYROLL SYSTEM                  *");
        System.out.println("*                                                *");
        System.out.println("**************************************************");
        System.out.println("Enter Your Name: ");
        name = input.nextLine();
        System.out.println("Enter Your Address: ");
        address = input.nextLine();
        System.out.println("Enter Your Age: ");
        age = input.nextDouble();
        System.out.println("Enter Your Job: ");
        job = input.nextLine();
        System.out.println("Enter Your Salary: ");
        salary = input.nextDouble();
        System.out.println("Enter Number Of Days: ");
        days = input.nextDouble();
        System.out.println("***************PERSONAL INFORMATION***************");
        System.out.println("Name           :          " + name);
        System.out.println("Address        :          " + address);
        System.out.println("Age            :          " + age);
        System.out.println("Job            :          " + job);
        System.out.println("Salary         :          " + salary);
        System.out.println("No. of Days    :          " + days);
        System.out.println("W/Tax          :          " + convert + ".00%");
        System.out.println("*********************INCOME***********************");
        System.out.println("Daily Rate     :          " + salary);
        System.out.println("Allowance      :          " + allowance);
        System.out.println("******************DEDUCTIONS(S)*******************");
        grosspay = salary * days;
        taxdeduc = grosspay * tax;
        netpay = grosspay - taxdeduc + allowance * days;
        System.out.println("W/Tax          :          " + taxdeduc);
        System.out.println("**************************************************");
        System.out.println("Gross Pay      :          " + grosspay);
        System.out.println("Net Pay        :          " + netpay);
    }
}
