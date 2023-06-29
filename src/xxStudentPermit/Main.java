package xxStudentPermit;
import java.util.*;
import java.lang.Math;

@SuppressWarnings("unused")
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        double tuition, amnt1, amnt2, amnt3, bln1, bln2, bln3;
        String name1, name2, name3, menu;
        
        i = 0;
        
        // Amount
        amnt1 = 0;
        amnt2 = 0;
        amnt3 = 0;
        
        // Balance
        bln1 = 0;
        bln2 = 0;
        bln2 = 0;
        tuition = 36000;
        do {
            i = i + 1;
            System.out.println("Student Number: " + i);
            System.out.println("Name: ");
            name1 = input.nextLine();
            System.out.println("Amount: ");
            amnt1 = input.nextDouble();
            if (amnt1 >= tuition) {
                bln1 = amnt1 - tuition;
            } else {
                bln1 = tuition - amnt1;
            }
            System.out.println("[a]Add Student [s]Stop");
            menu = input.nextLine();
            if (menu.equals("a") || menu.equals("A")) {
                i = i + 1;
                System.out.println("Student Number: " + i);
                System.out.println("Name: ");
                name2 = input.nextLine();
                System.out.println("Amount: ");
                amnt2 = input.nextDouble();
                if (amnt2 >= tuition) {
                    bln2 = amnt2 - tuition;
                } else {
                    bln2 = tuition - amnt2;
                }
                System.out.println("[a]Add Student [s]Stop");
                menu = input.nextLine();
                if (menu.equals("a") || menu.equals("A")) {
                    i = i + 1;
                    System.out.println("Student Number: " + 3);
                    System.out.println("Name: ");
                    name3 = input.nextLine();
                    System.out.println("Amount: ");
                    amnt3 = input.nextDouble();
                    if (amnt3 >= tuition) {
                        bln3 = amnt3 - tuition;
                    } else {
                        bln3 = tuition - amnt3;
                    }
                    if (amnt1 >= tuition && amnt2 >= tuition && amnt3 >= tuition) {
                        System.out.println("Student 1: " + name1);
                        System.out.println("Status: Permit Exam");
                        System.out.println("Student 2: " + name2);
                        System.out.println("Status: Permit Exam");
                        System.out.println("Student 3: " + name3);
                        System.out.println("Status: Permit Exam");
                    } else {
                        if (amnt1 >= tuition && amnt2 >= tuition && amnt3 < tuition) {
                            System.out.println("Student 1: " + name1);
                            System.out.println("Status: Permit Exam");
                            System.out.println("Student 2: " + name2);
                            System.out.println("Status: Permit Exam");
                            System.out.println("Student 3: " + name3);
                            System.out.println("Amount: " + amnt3);
                            System.out.println("Tuition: " + tuition);
                            System.out.println("Balance: " + bln3);
                            System.out.println("Status: No Permit Exam");
                        } else {
                            if (amnt1 >= tuition && amnt2 < tuition && amnt3 >= tuition) {
                                System.out.println("Student 1: " + name1);
                                System.out.println("Status: Permit Exam");
                                System.out.println("Student 2: " + name2);
                                System.out.println("Amount: " + amnt2);
                                System.out.println("Tuition: " + tuition);
                                System.out.println("Balance: " + bln2);
                                System.out.println("Status: No Permit Exam");
                                System.out.println("Student 3: " + name3);
                                System.out.println("Status: Permit Exam");
                            } else {
                                if (amnt1 < tuition && amnt2 >= tuition && amnt3 >= tuition) {
                                    System.out.println("Student 1: " + name1);
                                    System.out.println("Amount: " + amnt1);
                                    System.out.println("Tuition: " + tuition);
                                    System.out.println("Balance: " + bln1);
                                    System.out.println("Status: No Permit Exam");
                                    System.out.println("Student 2: " + name2);
                                    System.out.println("Status: Permit Exam");
                                    System.out.println("Student 3: " + name3);
                                    System.out.println("Status: Permit Exam");
                                } else {
                                    if (amnt1 >= tuition && amnt2 < tuition && amnt3 < tuition) {
                                        System.out.println("Student 1: " + name1);
                                        System.out.println("Status: Permit Exam");
                                        System.out.println("Student 2: " + name2);
                                        System.out.println("Amount: " + amnt2);
                                        System.out.println("Tuition: " + tuition);
                                        System.out.println("Balance: " + bln2);
                                        System.out.println("Status: No Permit Exam");
                                        System.out.println("Student 3: " + name3);
                                        System.out.println("Amount: " + amnt3);
                                        System.out.println("Tuition: " + tuition);
                                        System.out.println("Balance: " + bln3);
                                        System.out.println("Status: No Permit Exam");
                                    } else {
                                        if (amnt1 < tuition && amnt2 >= tuition && amnt3 < tuition) {
                                            System.out.println("Student 1: " + name1);
                                            System.out.println("Amount: " + amnt1);
                                            System.out.println("Tuition: " + tuition);
                                            System.out.println("Balance: " + bln1);
                                            System.out.println("Status: No Permit Exam");
                                            System.out.println("Student 2: " + name2);
                                            System.out.println("Status: Permit Exam");
                                            System.out.println("Student 3: " + name3);
                                            System.out.println("Amount: " + amnt3);
                                            System.out.println("Tuition: " + tuition);
                                            System.out.println("Balance: " + bln3);
                                            System.out.println("Status: No Permit Exam");
                                        } else {
                                            if (amnt1 < tuition && amnt2 < tuition && amnt3 >= tuition) {
                                                System.out.println("Student 1: " + name1);
                                                System.out.println("Amount: " + amnt1);
                                                System.out.println("Tuition: " + tuition);
                                                System.out.println("Balance: " + bln1);
                                                System.out.println("Status: No Permit Exam");
                                                System.out.println("Student 2: " + name2);
                                                System.out.println("Amount: " + amnt2);
                                                System.out.println("Tuition: " + tuition);
                                                System.out.println("Balance: " + bln2);
                                                System.out.println("Status: No Permit Exam");
                                                System.out.println("Student 3: " + name3);
                                                System.out.println("Status: Permit Exam");
                                            } else {
                                                System.out.println("Student 1: " + name1);
                                                System.out.println("Amount: " + amnt1);
                                                System.out.println("Tuition: " + tuition);
                                                System.out.println("Balance: " + bln1);
                                                System.out.println("Status: No Permit Exam");
                                                System.out.println("Student 2: " + name2);
                                                System.out.println("Amount: " + amnt2);
                                                System.out.println("Tuition: " + tuition);
                                                System.out.println("Balance: " + bln2);
                                                System.out.println("Status: No Permit Exam");
                                                System.out.println("Student 3: " + name3);
                                                System.out.println("Amount: " + amnt3);
                                                System.out.println("Tuition: " + tuition);
                                                System.out.println("Balance: " + bln3);
                                                System.out.println("Status: No Permit Exam");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (menu.equals("s") || menu.equals("S")) {
                        i = i + 2;
                        if (amnt1 >= tuition && amnt2 >= tuition) {
                            System.out.println("Student 1: " + name1);
                            System.out.println("Status: Permit Exam");
                            System.out.println("Student 2: " + name2);
                            System.out.println("Status: Permit Exam");
                        } else {
                            if (amnt1 >= tuition && amnt2 < tuition) {
                                System.out.println("Student 1: " + name1);
                                System.out.println("Status: Permit Exam");
                                System.out.println("Student 2: " + name2);
                                System.out.println("Amount: " + amnt2);
                                System.out.println("Tuition: " + tuition);
                                System.out.println("Balance: " + bln2);
                                System.out.println("Status: No Permit Exam");
                            } else {
                                if (amnt1 < tuition && amnt2 >= tuition) {
                                    System.out.println("Student 1: " + name1);
                                    System.out.println("Amount: " + amnt1);
                                    System.out.println("Tuition: " + tuition);
                                    System.out.println("Balance: " + bln1);
                                    System.out.println("Status: No Permit Exam");
                                    System.out.println("Student 2: " + name2);
                                    System.out.println("Status: Permit Exam");
                                }
                            }
                        }
                    } else {
                        System.out.println("Invalid Input");
                        i = i + 2;
                    }
                }
            } else {
                if (menu.equals("s") || menu.equals("S")) {
                    i = i + 2;
                    if (amnt1 >= tuition) {
                        System.out.println("Student 1: " + name1);
                        System.out.println("Status: Permit Exam");
                    } else {
                        System.out.println("Student 1: " + name1);
                        System.out.println("Amount: " + amnt1);
                        System.out.println("Tuition: " + tuition);
                        System.out.println("Balance: " + bln1);
                        System.out.println("Status: No Permit Exam");
                    }
                } else {
                    System.out.println("Invalid Input");
                    i = i + 2;
                }
            }
        }
        while (i < 3);
    }
}
