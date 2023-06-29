package xxShopMenu;
import java.util.*;
import java.lang.Math;

@SuppressWarnings("unused")
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String start, menu, choice, yn;
        double q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15;
        double p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15;
        int subtotal1, subtotal2, subtotal3, subtotal4, subtotal5, total;
        
        // Quantities
        q1 = 0;
        q2 = 0;
        q3 = 0;
        q4 = 0;
        q5 = 0;
        q6 = 0;
        q7 = 0;
        q8 = 0;
        q9 = 0;
        q10 = 0;
        q11 = 0;
        q12 = 0;
        q13 = 0;
        q14 = 0;
        q15 = 0;
        
        // Prices
        p1 = 0;
        p2 = 0;
        p3 = 0;
        p4 = 0;
        p5 = 0;
        p6 = 0;
        p7 = 0;
        p8 = 0;
        p9 = 0;
        p10 = 0;
        p11 = 0;
        p12 = 0;
        p13 = 0;
        p14 = 0;
        p15 = 0;
        
        // Tally
        subtotal1 = 0;
        subtotal2 = 0;
        subtotal3 = 0;
        subtotal4 = 0;
        subtotal5 = 0;
        total = 0;
        do {
            bvonstart();
            start = input.nextLine();
            System.out.println("");
            if (start.equals("e")) {
                System.out.println("-------------------------------------------------| Proceed |");
                System.out.println("");
                do {
                    bvonmenu();
                    menu = input.nextLine();
                    System.out.println("");
                    if (menu.equals("1")) {
                        do {
                            selection1();
                            choice = input.nextLine();
                            System.out.println("");
                            if (choice.equals("1")) {
                                q1 = q1 + 1;
                                p1 = 199.00 * q1;
                                System.out.println("Item: Body Lotion x" + q1);
                            } else {
                                if (choice.equals("2")) {
                                    q2 = q2 + 1;
                                    p2 = 179.00 * q2;
                                    System.out.println("Item: Deodorant x" + q2);
                                } else {
                                    if (choice.equals("3")) {
                                        q3 = q3 + 1;
                                        p3 = 219.00 * q3;
                                        System.out.println("Item: Moutwash x" + q3);
                                    } else {
                                        if (choice.equals("x")) {
                                            System.out.println("----------------------------------------------------| Exit |");
                                        } else {
                                            if (choice.equals("r")) {
                                                choice = "x";
                                                menu = "x";
                                                System.out.println("----------------------------------------| Return Main Menu |");
                                            } else {
                                                System.out.println("-------------------------------------------| INVALID INPUT |");
                                            }
                                        }
                                    }
                                }
                            }
                            subtotal1 = (int) (p1 + p2 + p3);
                            System.out.println("------------------------------| Body Care Sub Total: " + subtotal1);
                            System.out.println("");
                        }
                        while (!choice.equals("x"));
                    } else {
                        if (menu.equals("2")) {
                            do {
                                selection2();
                                choice = input.nextLine();
                                System.out.println("");
                                if (choice.equals("1")) {
                                    q4 = q4 + 1;
                                    p4 = 349.00 * q4;
                                    System.out.println("Item: Mascara x" + q4);
                                } else {
                                    if (choice.equals("2")) {
                                        q5 = q5 + 1;
                                        p5 = 149.00 * q5;
                                        System.out.println("Item: Eye Shadow x" + q5);
                                    } else {
                                        if (choice.equals("3")) {
                                            q6 = q6 + 1;
                                            p6 = 299.00 * q6;
                                            System.out.println("Item: Lipstick x" + q6);
                                        } else {
                                            if (choice.equals("x")) {
                                                System.out.println("----------------------------------------------------| Exit |");
                                            } else {
                                                if (choice.equals("r")) {
                                                    choice = "x";
                                                    menu = "x";
                                                    System.out.println("----------------------------------------| Return Main Menu |");
                                                } else {
                                                    System.out.println("-------------------------------------------| INVALID INPUT |");
                                                }
                                            }
                                        }
                                    }
                                }
                                subtotal2 = (int) (p4 + p5 + p6);
                                System.out.println("------------------------------| Make-UP Sub Total: " + subtotal2);
                                System.out.println("");
                            }
                            while (!choice.equals("x"));
                        } else {
                            if (menu.equals("3")) {
                                do {
                                    selection3();
                                    choice = input.nextLine();
                                    System.out.println("");
                                    if (choice.equals("1")) {
                                        q7 = q7 + 1;
                                        p7 = 299.00 * q7;
                                        System.out.println("Item: Bench x" + q7);
                                    } else {
                                        if (choice.equals("2")) {
                                            q8 = q8 + 1;
                                            p8 = 159.00 * q8;
                                            System.out.println("Item: Dickies x" + q8);
                                        } else {
                                            if (choice.equals("3")) {
                                                q9 = q9 + 1;
                                                p9 = 169.00 * q9;
                                                System.out.println("Item: Nike x" + q9);
                                            } else {
                                                if (choice.equals("x")) {
                                                    System.out.println("----------------------------------------------------| Exit |");
                                                } else {
                                                    if (choice.equals("r")) {
                                                        choice = "x";
                                                        menu = "x";
                                                        System.out.println("----------------------------------------| Return Main Menu |");
                                                    } else {
                                                        System.out.println("-------------------------------------------| INVALID INPUT |");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    subtotal3 = (int) (p7 + p8 + p9);
                                    System.out.println("------------------------------| Underwear: " + subtotal3);
                                    System.out.println("");
                                }
                                while (!choice.equals("x"));
                            } else {
                                if (menu.equals("4")) {
                                    do {
                                        selection4();
                                        choice = input.nextLine();
                                        System.out.println("");
                                        if (choice.equals("1")) {
                                            q10 = q10 + 1;
                                            p10 = 179.00 * q10;
                                            System.out.println("Item: Bench O2 x" + q10);
                                        } else {
                                            if (choice.equals("2")) {
                                                q11 = q11 + 1;
                                                p11 = 999.00 * q11;
                                                System.out.println("Item: Victoria x" + q11);
                                            } else {
                                                if (choice.equals("3")) {
                                                    q12 = q12 + 1;
                                                    p12 = 789.00 * q12;
                                                    System.out.println("Item: Avon Spary x" + q12);
                                                } else {
                                                    if (choice.equals("x")) {
                                                        System.out.println("----------------------------------------------------| Exit |");
                                                    } else {
                                                        if (choice.equals("r")) {
                                                            choice = "x";
                                                            menu = "x";
                                                            System.out.println("----------------------------------------| Return Main Menu |");
                                                        } else {
                                                            System.out.println("-------------------------------------------| INVALID INPUT |");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        subtotal4 = (int) (p10 + p11 + p12);
                                        System.out.println("------------------------------| Perfume: " + subtotal4);
                                        System.out.println("");
                                    }
                                    while (!choice.equals("x"));
                                } else {
                                    if (menu.equals("5")) {
                                        do {
                                            selection5();
                                            choice = input.nextLine();
                                            System.out.println("");
                                            if (choice.equals("1")) {
                                                q13 = q13 + 1;
                                                p13 = 799.00 * q13;
                                                System.out.println("Item: Knife Set x" + q13);
                                            } else {
                                                if (choice.equals("2")) {
                                                    q14 = q14 + 1;
                                                    p14 = 599.00 * q14;
                                                    System.out.println("Item: Spoon Set x" + q14);
                                                } else {
                                                    if (choice.equals("3")) {
                                                        q15 = q15 + 1;
                                                        p15 = 899.00 * q15;
                                                        System.out.println("Item: Microwave x" + q15);
                                                    } else {
                                                        if (choice.equals("x")) {
                                                            System.out.println("----------------------------------------------------| Exit |");
                                                        } else {
                                                            if (choice.equals("r")) {
                                                                choice = "x";
                                                                menu = "x";
                                                                System.out.println("----------------------------------------| Return Main Menu |");
                                                            } else {
                                                                System.out.println("-------------------------------------------| INVALID INPUT |");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            subtotal5 = (int) (p13 + p14 + p15);
                                            System.out.println("------------------------------| Utensils: " + subtotal5);
                                            System.out.println("");
                                        }
                                        while (!choice.equals("x"));
                                    } else {
                                        if (menu.equals("x")) {
                                            System.out.println("----------------------------------------------------| Exit |");
                                        } else {
                                            System.out.println("-------------------------------------------| INVALID INPUT |");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                while (!menu.equals("x"));
                System.out.println("");
                System.out.println("---------------------| OFFICIAL RECEIPT |-------------------");
                if (q1 > 0) {
                    System.out.println("Item: Body Lotion x" + q1);
                }
                if (q2 > 0) {
                    System.out.println("Item: Deodorant x" + q2);
                }
                if (q3 > 0) {
                    System.out.println("Item: Mouthwash x" + q3);
                }
                if (subtotal1 > 0) {
                    System.out.println("------------------------------| Body Care Sub Total: " + subtotal1);
                }
                if (q4 > 0) {
                    System.out.println("Item: Mascara x" + q4);
                }
                if (q5 > 0) {
                    System.out.println("Item: Eye Shadow x" + q5);
                }
                if (q6 > 0) {
                    System.out.println("Item: Lipstick x" + q6);
                }
                if (subtotal2 > 0) {
                    System.out.println("------------------------------| Make-UP Sub Total: " + subtotal2);
                }
                if (q7 > 0) {
                    System.out.println("Item: Bench x" + q7);
                }
                if (q8 > 0) {
                    System.out.println("Item: Dickies x" + q8);
                }
                if (q9 > 0) {
                    System.out.println("Item: Nike x" + q9);
                }
                if (subtotal3 > 0) {
                    System.out.println("------------------------------| Underwear: " + subtotal3);
                }
                if (q10 > 0) {
                    System.out.println("Item: Bench O2 x" + q10);
                }
                if (q11 > 0) {
                    System.out.println("Item: Victoria x" + q11);
                }
                if (q12 > 0) {
                    System.out.println("Item: Avon Spary x" + q12);
                }
                if (subtotal4 > 0) {
                    System.out.println("------------------------------| Perfume: " + subtotal4);
                }
                if (q13 > 0) {
                    System.out.println("Item: Knife Set x" + q13);
                }
                if (q14 > 0) {
                    System.out.println("Item: Spoon Set x" + q14);
                }
                if (q15 > 0) {
                    System.out.println("Item: Microwave x" + q15);
                }
                if (subtotal5 > 0) {
                    System.out.println("------------------------------| Utensils: " + subtotal5);
                }
                total = subtotal1 + subtotal2 + subtotal3 + subtotal4 + subtotal5;
                if (total > 0) {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("------------------------------| Overall Total: " + total);
                    System.out.println("");
                } else {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Message: No Item");
                    System.out.println("");
                }
                do {
                    System.out.println("Do You Want Shopping Again? Type: [y]/[n]");
                    yn = input.nextLine();
                    if (yn.equals("y")) {
                        yn = "n";
                        start = "y";
                        System.out.println("-----------------------------------------| Enjoy Shopping! |");
                        System.out.println("");
                        
                        // Quantities
                        q1 = 0;
                        q2 = 0;
                        q3 = 0;
                        q4 = 0;
                        q5 = 0;
                        q6 = 0;
                        q7 = 0;
                        q8 = 0;
                        q9 = 0;
                        q10 = 0;
                        q11 = 0;
                        q12 = 0;
                        q13 = 0;
                        q14 = 0;
                        q15 = 0;
                        
                        // Prices
                        p1 = 0;
                        p2 = 0;
                        p3 = 0;
                        p4 = 0;
                        p5 = 0;
                        p6 = 0;
                        p7 = 0;
                        p8 = 0;
                        p9 = 0;
                        p10 = 0;
                        p11 = 0;
                        p12 = 0;
                        p13 = 0;
                        p14 = 0;
                        p15 = 0;
                        
                        // Tally
                        subtotal1 = 0;
                        subtotal2 = 0;
                        subtotal3 = 0;
                        subtotal4 = 0;
                        subtotal5 = 0;
                        total = 0;
                    } else {
                        if (yn.equals("n")) {
                            start = "x";
                            System.out.println("----------------------------| Thank You Please Come Again! |");
                            System.out.println("");
                        } else {
                            System.out.println("-------------------------------------------| INVALID INPUT |");
                            System.out.println("");
                        }
                    }
                }
                while (!yn.equals("n"));
            } else {
                if (start.equals("x")) {
                    System.out.println("----------------------------------------------------| Exit |");
                    System.out.println("");
                } else {
                    System.out.println("-------------------------------------------| INVALID INPUT |");
                    System.out.println("");
                }
            }
        }
        while (!start.equals("x"));
    }
    
    public static void bvonmenu() {
        System.out.println("------------------------| BVON MENU |-----------------------");
        System.out.println("Message: Welcome Customer!");
        System.out.println("Message: Here Is The Selection For April Magazine!");
        System.out.println("------------------------------------------------------------");
        System.out.println("[1] Body Care");
        System.out.println("[2] Make-up");
        System.out.println("[3] Underwear");
        System.out.println("[4] Perfume");
        System.out.println("[5] Utensils");
        System.out.println("-------------------------------------------------| [x]Exit |");
        System.out.println("| INPUT |");
    }
    
    public static void bvonstart() {
        System.out.println("---------------------------| BVON |-------------------------");
        System.out.println("[E]Enter                                             [X]Exit");
        System.out.println("------------------------------------------------------------");
        System.out.println("| INPUT |");
    }
    
    public static void selection1() {
        System.out.println("| MENU | Body Care |----------------------------------------");
        System.out.println("[1] Body Lotion    | Price: 199.00");
        System.out.println("[2] Deodorant      | Price: 179.00");
        System.out.println("[3] Mouthwash      | Price: 219.00");
        System.out.println("                   | [r] Return Main Menu");
        System.out.println("-------------------| [x] Exit");
        System.out.println("| INPUT |");
    }
    
    public static void selection2() {
        System.out.println("| MENU | Make-Up   |----------------------------------------");
        System.out.println("[1] Mascara        | Price: 349.00");
        System.out.println("[2] Eye Shadow     | Price: 149.00");
        System.out.println("[3] Lipstick       | Price: 299.00");
        System.out.println("                   | [r] Return Main Menu");
        System.out.println("-------------------| [x] Exit");
        System.out.println("| INPUT |");
    }
    
    public static void selection3() {
        System.out.println("| MENU | Underwear |----------------------------------------");
        System.out.println("[1] Bench          | Price: 299.00");
        System.out.println("[2] Dickies        | Price: 159.00");
        System.out.println("[3] Nike           | Price: 169.00");
        System.out.println("                   | [r] Return Main Menu");
        System.out.println("-------------------| [x] Exit");
        System.out.println("| INPUT |");
    }
    
    public static void selection4() {
        System.out.println("| MENU | Perfume   |----------------------------------------");
        System.out.println("[1] Bench O2       | Price: 179.00");
        System.out.println("[2] Victoria       | Price: 999.00");
        System.out.println("[3] Avon Spary     | Price: 789.00");
        System.out.println("                   | [r] Return Main Menu");
        System.out.println("-------------------| [x] Exit");
        System.out.println("| INPUT |");
    }
    
    public static void selection5() {
        System.out.println("| MENU | Utensils  |----------------------------------------");
        System.out.println("[1] Knife Set      | Price: 799.00");
        System.out.println("[2] Spoon Set      | Price: 599.00");
        System.out.println("[3] Microwave      | Price: 899.00");
        System.out.println("                   | [r] Return Main Menu");
        System.out.println("-------------------| [x] Exit");
        System.out.println("| INPUT |");
    }
}
