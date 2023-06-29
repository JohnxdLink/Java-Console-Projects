package xxFoodMenu;
import java.util.*;
import java.lang.Math;

@SuppressWarnings("unused")
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String menu, pick, opt;
        int i, remove;
        double salary, days, savings, wants, needs, budget, div, reserve, cash, total;
        double item1, item2, item3, item4, item5, item6, item7;
        double qty1, qty2, qty3, qty4, qty5, qty6, qty7;
        
        // Iteration
        i = 0;
        
        // Main
        total = 0;
        cash = 0;
        budget = 0;
        salary = 0;
        days = 0;
        savings = 0;
        wants = 0;
        needs = 0;
        
        // Quantity
        qty1 = 0;
        qty2 = 0;
        qty3 = 0;
        qty4 = 0;
        qty5 = 0;
        qty6 = 0;
        qty7 = 0;
        budget = 0;
        
        // Item
        item1 = 0;
        item2 = 0;
        item3 = 0;
        item4 = 0;
        item5 = 0;
        item6 = 0;
        item7 = 0;
        do {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("[w]Wallet Check     [r]Restaurant           [x]Exit");
            System.out.println("Input: ");
            menu = input.nextLine();
            if (menu.equals("w")) {
                System.out.println("-----------------------------------| Cash: " + budget);
                System.out.println("Salary: ");
                salary = input.nextDouble();
                if (salary > 0) {
                    System.out.println("No. Of Days: ");
                    days = input.nextDouble();
                    salary = salary * days;
                    needs = salary * 0.50;
                    wants = salary * 0.30;
                    savings = salary * .20;
                    div = wants / 2;
                    cash = div;
                    budget = budget + cash;
                    System.out.println("");
                    System.out.println("---------------------------------------------------");
                    System.out.println("Salary    : " + salary);
                    System.out.println("Needs     : " + needs);
                    System.out.println("Wants     : " + wants);
                    System.out.println("Savings   : " + savings);
                    System.out.println("------------------------------| Budget: " + budget);
                    System.out.println("");
                } else {
                    System.out.println("--------------------| WARNING |--------------------");
                    System.out.println("Cash: " + salary);
                    System.out.println("");
                }
            } else {
                if (menu.equals("r")) {
                    do {
                        foodmenu();
                        System.out.println("------------------------------| Budget: " + budget);
                        System.out.println("Input: ");
                        pick = input.nextLine();
                        System.out.println("");
                        if (pick.equals("1")) {
                            qty1 = qty1 + 1;
                            item1 = 235.00;
                            System.out.println("[1]Grilled Chicken Plate        | x" + qty1);
                            if (budget < item1) {
                                budget = budget - item1;
                                item1 = item1 * qty1;
                                do {
                                    System.out.println("");
                                    System.out.println("--------------------| WARNING |--------------------");
                                    System.out.println("[1]Grilled Chicken Plate        | x" + qty1);
                                    System.out.println("Insufficient Cash: " + budget);
                                    System.out.println("[r]Remove Items                          [e]restart");
                                    System.out.println("Input: ");
                                    opt = input.nextLine();
                                    if (opt.equals("r")) {
                                        System.out.println("Number Items To Remove: ");
                                        remove = input.nextInt();
                                        if (remove > qty1) {
                                            System.out.println("--------------------| WARNING |--------------------");
                                            System.out.println("Too Much Quantity");
                                        } else {
                                            if (remove <= qty1 && remove > 0) {
                                                qty1 = qty1 - remove;
                                                if (remove <= qty1) {
                                                    if (remove <= 1) {
                                                        item1 = item1 - 235.00;
                                                        budget = budget + 235.00;
                                                        System.out.println("[1]Grilled Chicken Plate        | x" + qty1);
                                                        System.out.println("");
                                                    } else {
                                                        if (remove == qty1) {
                                                            budget = budget + item1;
                                                            item1 = 0;
                                                            qty1 = 0;
                                                            System.out.println("[1]Grilled Chicken Plate        | x" + qty1);
                                                            System.out.println("");
                                                        }
                                                    }
                                                } else {
                                                    while (i < remove) {
                                                        item1 = item1 - 235.00;
                                                        budget = budget + 235.00;
                                                        i = i + 1;
                                                    }
                                                    System.out.println("[1]Grilled Chicken Plate        | x" + qty1);
                                                    System.out.println("");
                                                }
                                                opt = "e";
                                            } else {
                                                System.out.println("--------------------| WARNING |--------------------");
                                                System.out.println("No Quantity Change");
                                            }
                                        }
                                    } else {
                                        if (opt.equals("e")) {
                                            budget = budget + item1;
                                            qty1 = 0;
                                            System.out.println("--------------------| RESTART |--------------------");
                                        } else {
                                            System.out.println("[" + opt + "]" + "Character Does Not Exist");
                                        }
                                    }
                                }
                                while (!opt.equals("e"));
                            } else {
                                budget = budget - item1;
                                item1 = item1 * qty1;
                                System.out.println("------------------------------| Sub Total: " + item1);
                                System.out.println("");
                            }
                        } else {
                            if (pick.equals("2")) {
                                qty2 = qty2 + 1;
                                item2 = 230.00;
                                System.out.println("[2]Burger Steak                 | x" + qty2);
                                if (budget < item2) {
                                    budget = budget - item2;
                                    item2 = item2 * qty2;
                                    do {
                                        System.out.println("");
                                        System.out.println("--------------------| WARNING |--------------------");
                                        System.out.println("[2]Burger Steak                 | x" + qty2);
                                        System.out.println("Insufficient Cash: " + budget);
                                        System.out.println("[r]Remove Items                          [e]restart");
                                        System.out.println("Input: ");
                                        opt = input.nextLine();
                                        if (opt.equals("r")) {
                                            System.out.println("Number Items To Remove: ");
                                            remove = input.nextInt();
                                            if (remove > qty2) {
                                                System.out.println("--------------------| WARNING |--------------------");
                                                System.out.println("Too Much Quantity");
                                            } else {
                                                if (remove <= qty2 && remove > 0) {
                                                    qty2 = qty2 - remove;
                                                    if (remove <= qty2) {
                                                        if (remove <= 1) {
                                                            item2 = item2 - 230.00;
                                                            budget = budget + 230.00;
                                                            System.out.println("[2]Burger Steak                 | x" + qty2);
                                                            System.out.println("");
                                                        } else {
                                                            if (remove == qty2) {
                                                                budget = budget + item2;
                                                                item2 = 0;
                                                                qty2 = 0;
                                                                System.out.println("[2]Burger Steak                 | x" + qty2);
                                                                System.out.println("");
                                                            }
                                                        }
                                                    } else {
                                                        while (i < remove) {
                                                            item2 = item2 - 230.00;
                                                            budget = budget + 230.00;
                                                            i = i + 1;
                                                        }
                                                        System.out.println("[2]Burger Steak                 | x" + qty2);
                                                        System.out.println("");
                                                    }
                                                    opt = "e";
                                                } else {
                                                    System.out.println("--------------------| WARNING |--------------------");
                                                    System.out.println("No Quantity Change");
                                                }
                                            }
                                        } else {
                                            if (opt.equals("e")) {
                                                budget = budget + item2;
                                                qty2 = 0;
                                                System.out.println("--------------------| RESTART |--------------------");
                                            } else {
                                                System.out.println("[" + opt + "]" + "Character Does Not Exist");
                                            }
                                        }
                                    }
                                    while (!opt.equals("e"));
                                } else {
                                    budget = budget - item2;
                                    item2 = item2 * qty2;
                                    System.out.println("------------------------------| Sub Total: " + item2);
                                    System.out.println("");
                                }
                            } else {
                                if (pick.equals("3")) {
                                    qty3 = qty3 + 1;
                                    item3 = 215.00;
                                    System.out.println("[3]Grilled Sausage              | x" + qty3);
                                    if (budget < item3) {
                                        budget = budget - item3;
                                        item3 = item3 * qty3;
                                        do {
                                            System.out.println("");
                                            System.out.println("--------------------| WARNING |--------------------");
                                            System.out.println("[3]Grilled Sausage              | x" + qty3);
                                            System.out.println("Insufficient Cash: " + budget);
                                            System.out.println("[r]Remove Items                          [e]restart");
                                            System.out.println("Input: ");
                                            opt = input.nextLine();
                                            if (opt.equals("r")) {
                                                System.out.println("Number Items To Remove: ");
                                                remove = input.nextInt();
                                                if (remove > qty3) {
                                                    System.out.println("--------------------| WARNING |--------------------");
                                                    System.out.println("Too Much Quantity");
                                                } else {
                                                    if (remove <= qty3 && remove > 0) {
                                                        qty3 = qty3 - remove;
                                                        if (remove <= qty3) {
                                                            if (remove <= 1) {
                                                                item3 = item3 - 215.00;
                                                                budget = budget + 215.00;
                                                                System.out.println("[3]Grilled Sausage              | x" + qty3);
                                                                System.out.println("");
                                                            } else {
                                                                if (remove == qty3) {
                                                                    budget = budget + item3;
                                                                    item3 = 0;
                                                                    qty3 = 0;
                                                                    System.out.println("[3]Grilled Sausage              | x" + qty3);
                                                                    System.out.println("");
                                                                }
                                                            }
                                                        } else {
                                                            while (i < remove) {
                                                                item3 = item3 - 215.00;
                                                                budget = budget + 215.00;
                                                                i = i + 1;
                                                            }
                                                            System.out.println("[3]Grilled Sausage              | x" + qty3);
                                                            System.out.println("");
                                                        }
                                                        opt = "e";
                                                    } else {
                                                        System.out.println("--------------------| WARNING |--------------------");
                                                        System.out.println("No Quantity Change");
                                                    }
                                                }
                                            } else {
                                                if (opt.equals("e")) {
                                                    budget = budget + item3;
                                                    qty3 = 0;
                                                    System.out.println("--------------------| RESTART |--------------------");
                                                } else {
                                                    System.out.println("[" + opt + "]" + "Character Does Not Exist");
                                                }
                                            }
                                        }
                                        while (!opt.equals("e"));
                                    } else {
                                        budget = budget - item3;
                                        item3 = item3 * qty3;
                                        System.out.println("------------------------------| Sub Total: " + item3);
                                        System.out.println("");
                                    }
                                } else {
                                    if (pick.equals("4")) {
                                        qty4 = qty4 + 1;
                                        item4 = 140.00;
                                        System.out.println("[4]Barbecue                     | x" + qty4);
                                        if (budget < item4) {
                                            budget = budget - item4;
                                            item4 = item4 * qty4;
                                            do {
                                                System.out.println("");
                                                System.out.println("--------------------| WARNING |--------------------");
                                                System.out.println("[4]Barbecue                     | x" + qty4);
                                                System.out.println("Insufficient Cash: " + budget);
                                                System.out.println("[r]Remove Items                          [e]restart");
                                                System.out.println("Input: ");
                                                opt = input.nextLine();
                                                if (opt.equals("r")) {
                                                    System.out.println("Number Items To Remove: ");
                                                    remove = input.nextInt();
                                                    if (remove > qty4) {
                                                        System.out.println("--------------------| WARNING |--------------------");
                                                        System.out.println("Too Much Quantity");
                                                    } else {
                                                        if (remove <= qty4 && remove > 0) {
                                                            qty4 = qty4 - remove;
                                                            if (remove <= qty4) {
                                                                if (remove <= 1) {
                                                                    item4 = item4 - 140.00;
                                                                    budget = budget + 140.00;
                                                                    System.out.println("[4]Barbecue                     | x" + qty4);
                                                                    System.out.println("");
                                                                } else {
                                                                    if (remove == qty4) {
                                                                        budget = budget + item4;
                                                                        item4 = 0;
                                                                        qty4 = 0;
                                                                        System.out.println("[4]Barbecue                     | x" + qty4);
                                                                        System.out.println("");
                                                                    }
                                                                }
                                                            } else {
                                                                while (i < remove) {
                                                                    item4 = item4 - 140.00;
                                                                    budget = budget + 140.00;
                                                                    i = i + 1;
                                                                }
                                                                System.out.println("[4]Barbecue                     | x" + qty4);
                                                                System.out.println("");
                                                            }
                                                            opt = "e";
                                                        } else {
                                                            System.out.println("--------------------| WARNING |--------------------");
                                                            System.out.println("No Quantity Change");
                                                        }
                                                    }
                                                } else {
                                                    if (opt.equals("e")) {
                                                        budget = budget + item4;
                                                        qty4 = 0;
                                                        System.out.println("--------------------| RESTART |--------------------");
                                                    } else {
                                                        System.out.println("[" + opt + "]" + "Character Does Not Exist");
                                                    }
                                                }
                                            }
                                            while (!opt.equals("e"));
                                        } else {
                                            budget = budget - item4;
                                            item4 = item4 * qty4;
                                            System.out.println("------------------------------| Sub Total: " + item4);
                                            System.out.println("");
                                        }
                                    } else {
                                        if (pick.equals("5")) {
                                            qty5 = qty5 + 1;
                                            item5 = 80.00;
                                            System.out.println("[5]Ice Tea                      | x" + qty5);
                                            if (budget < item5) {
                                                budget = budget - item5;
                                                item5 = item5 * qty5;
                                                do {
                                                    System.out.println("");
                                                    System.out.println("--------------------| WARNING |--------------------");
                                                    System.out.println("[5]Ice Tea                      | x" + qty5);
                                                    System.out.println("Insufficient Cash: " + budget);
                                                    System.out.println("[r]Remove Items                          [e]restart");
                                                    System.out.println("Input: ");
                                                    opt = input.nextLine();
                                                    if (opt.equals("r")) {
                                                        System.out.println("Number Items To Remove: ");
                                                        remove = input.nextInt();
                                                        if (remove > qty5) {
                                                            System.out.println("--------------------| WARNING |--------------------");
                                                            System.out.println("Too Much Quantity");
                                                        } else {
                                                            if (remove <= qty5 && remove > 0) {
                                                                qty5 = qty5 - remove;
                                                                if (remove <= qty5) {
                                                                    if (remove <= 1) {
                                                                        item5 = item5 - 80.00;
                                                                        budget = budget + 80.00;
                                                                        System.out.println("[5]Ice Tea                      | x" + qty5);
                                                                        System.out.println("");
                                                                    } else {
                                                                        if (remove == qty5) {
                                                                            budget = budget + item5;
                                                                            item5 = 0;
                                                                            qty5 = 0;
                                                                            System.out.println("[5]Ice Tea                      | x" + qty5);
                                                                            System.out.println("");
                                                                        }
                                                                    }
                                                                } else {
                                                                    while (i < remove) {
                                                                        item5 = item5 - 80.00;
                                                                        budget = budget + 80.00;
                                                                        i = i + 1;
                                                                    }
                                                                    System.out.println("[5]Ice Tea                      | x" + qty5);
                                                                    System.out.println("");
                                                                }
                                                                opt = "e";
                                                            } else {
                                                                System.out.println("--------------------| WARNING |--------------------");
                                                                System.out.println("No Quantity Change");
                                                            }
                                                        }
                                                    } else {
                                                        if (opt.equals("e")) {
                                                            budget = budget + item5;
                                                            qty5 = 0;
                                                            System.out.println("--------------------| RESTART |--------------------");
                                                        } else {
                                                            System.out.println("[" + opt + "]" + "Character Does Not Exist");
                                                        }
                                                    }
                                                }
                                                while (!opt.equals("e"));
                                            } else {
                                                budget = budget - item5;
                                                item5 = item5 * qty5;
                                                System.out.println("------------------------------| Sub Total: " + item5);
                                                System.out.println("");
                                            }
                                        } else {
                                            if (pick.equals("6")) {
                                                qty6 = qty6 + 1;
                                                item6 = 100.00;
                                                System.out.println("[6]Coca Cola                    | x" + qty6);
                                                if (budget < item6) {
                                                    budget = budget - item6;
                                                    item6 = item6 * qty6;
                                                    do {
                                                        System.out.println("");
                                                        System.out.println("--------------------| WARNING |--------------------");
                                                        System.out.println("[6]Coca Cola                    | x" + qty6);
                                                        System.out.println("Insufficient Cash: " + budget);
                                                        System.out.println("[r]Remove Items                          [e]restart");
                                                        System.out.println("Input: ");
                                                        opt = input.nextLine();
                                                        if (opt.equals("r")) {
                                                            System.out.println("Number Items To Remove: ");
                                                            remove = input.nextInt();
                                                            if (remove > qty6) {
                                                                System.out.println("--------------------| WARNING |--------------------");
                                                                System.out.println("Too Much Quantity");
                                                            } else {
                                                                if (remove <= qty6 && remove > 0) {
                                                                    qty6 = qty6 - remove;
                                                                    if (remove <= qty6) {
                                                                        if (remove <= 1) {
                                                                            item6 = item6 - 100.00;
                                                                            budget = budget + 100.00;
                                                                            System.out.println("[6]Coca Cola                    | x" + qty6);
                                                                            System.out.println("");
                                                                        } else {
                                                                            if (remove == qty6) {
                                                                                budget = budget + item6;
                                                                                item6 = 0;
                                                                                qty6 = 0;
                                                                                System.out.println("[6]Coca Cola                    | x" + qty6);
                                                                                System.out.println("");
                                                                            }
                                                                        }
                                                                    } else {
                                                                        while (i < remove) {
                                                                            item6 = item6 - 100.00;
                                                                            budget = budget + 100.00;
                                                                            i = i + 1;
                                                                        }
                                                                        System.out.println("[6]Coca Cola                    | x" + qty6);
                                                                        System.out.println("");
                                                                    }
                                                                    opt = "e";
                                                                } else {
                                                                    System.out.println("--------------------| WARNING |--------------------");
                                                                    System.out.println("No Quantity Change");
                                                                }
                                                            }
                                                        } else {
                                                            if (opt.equals("e")) {
                                                                budget = budget + item6;
                                                                qty6 = 0;
                                                                System.out.println("--------------------| RESTART |--------------------");
                                                            } else {
                                                                System.out.println("[" + opt + "]" + "Character Does Not Exist");
                                                            }
                                                        }
                                                    }
                                                    while (!opt.equals("e"));
                                                } else {
                                                    budget = budget - item6;
                                                    item6 = item6 * qty6;
                                                    System.out.println("------------------------------| Sub Total: " + item6);
                                                    System.out.println("");
                                                }
                                            } else {
                                                if (pick.equals("7")) {
                                                    qty7 = qty7 + 1;
                                                    item7 = 40.00;
                                                    System.out.println("[7]Water                        | x" + qty7);
                                                    if (budget < item7) {
                                                        budget = budget - item7;
                                                        item7 = item7 * qty7;
                                                        do {
                                                            System.out.println("");
                                                            System.out.println("--------------------| WARNING |--------------------");
                                                            System.out.println("[7]Water                        | x" + qty7);
                                                            System.out.println("Insufficient Cash: " + budget);
                                                            System.out.println("[r]Remove Items                          [e]restart");
                                                            System.out.println("Input: ");
                                                            opt = input.nextLine();
                                                            if (opt.equals("r")) {
                                                                System.out.println("Number Items To Remove: ");
                                                                remove = input.nextInt();
                                                                if (remove > qty7) {
                                                                    System.out.println("--------------------| WARNING |--------------------");
                                                                    System.out.println("Too Much Quantity");
                                                                } else {
                                                                    if (remove <= qty7 && remove > 0) {
                                                                        qty6 = qty6 - remove;
                                                                        if (remove <= qty7) {
                                                                            if (remove <= 1) {
                                                                                item7 = item7 - 40.00;
                                                                                budget = budget + 40.00;
                                                                                System.out.println("[7]Water                        | x" + qty7);
                                                                                System.out.println("");
                                                                            } else {
                                                                                if (remove == qty7) {
                                                                                    budget = budget + item7;
                                                                                    item7 = 0;
                                                                                    qty7 = 0;
                                                                                    System.out.println("[7]Water                        | x" + qty7);
                                                                                    System.out.println("");
                                                                                }
                                                                            }
                                                                        } else {
                                                                            while (i < remove) {
                                                                                item7 = item7 - 40.00;
                                                                                budget = budget + 40.00;
                                                                                i = i + 1;
                                                                            }
                                                                            System.out.println("[7]Water                        | x" + qty7);
                                                                            System.out.println("");
                                                                        }
                                                                        opt = "e";
                                                                    } else {
                                                                        System.out.println("--------------------| WARNING |--------------------");
                                                                        System.out.println("No Quantity Change");
                                                                    }
                                                                }
                                                            } else {
                                                                if (opt.equals("e")) {
                                                                    budget = budget + item7;
                                                                    qty7 = 0;
                                                                    System.out.println("--------------------| RESTART |--------------------");
                                                                } else {
                                                                    System.out.println("[" + opt + "]" + "Character Does Not Exist");
                                                                }
                                                            }
                                                        }
                                                        while (!opt.equals("e"));
                                                    } else {
                                                        budget = budget - item7;
                                                        item7 = item7 * qty7;
                                                        System.out.println("------------------------------| Sub Total: " + item7);
                                                        System.out.println("");
                                                    }
                                                } else {
                                                    if (pick.equals("8")) {
                                                        System.out.println("------------------| REVIEW ITEMS |-----------------");
                                                        System.out.println("");
                                                        System.out.println("[1]Grilled Chicken Plate        | x " + qty1);
                                                        System.out.println("[2]Burger Steak                 | x " + qty2);
                                                        System.out.println("[3]Grilled Sausage              | x " + qty3);
                                                        System.out.println("[4]Barbecue                     | x " + qty4);
                                                        System.out.println("[5]Ice Tea                      | x " + qty5);
                                                        System.out.println("[6]Coca Cola                    | x " + qty6);
                                                        System.out.println("[7]Water                        | x " + qty7);
                                                        System.out.println("---------------------------------------------------");
                                                        System.out.println("");
                                                    } else {
                                                        if (pick.equals("9")) {
                                                            System.out.println("---------------------| EXIT |----------------------");
                                                            System.out.println("");
                                                        } else {
                                                            System.out.println("[" + pick + "]" + "Character Does Not Exist");
                                                            System.out.println("");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        total = item1 + item2 + item3 + item4 + item5 + item6 + item7;
                    }
                    while (!pick.equals("9"));
                    System.out.println("----------------| OFFICIAL RECEIPT |---------------");
                    if (qty1 > 0) {
                        System.out.println("x" + qty1 + " Grilled Chicken Plate | P 235.00 | Sub Total: " + item1);
                    }
                    if (qty2 > 0) {
                        System.out.println("x" + qty2 + " Burger Steak          | P 230.00 | Sub Total: " + item2);
                    }
                    if (qty3 > 0) {
                        System.out.println("x" + qty3 + " Grilled Sausage       | P 215.00 | Sub Total: " + item3);
                    }
                    if (qty4 > 0) {
                        System.out.println("x" + qty4 + " Barbecue              | P 140.00 | Sub Total: " + item4);
                    }
                    if (qty5 > 0) {
                        System.out.println("x" + qty5 + " Ice Tea               | P 80.00  | Sub Total: " + item5);
                    }
                    if (qty6 > 0) {
                        System.out.println("x" + qty6 + " Coca Cola             | P 100.00 | Sub Total: " + item6);
                    }
                    if (qty7 > 0) {
                        System.out.println("x" + qty7 + " Water                 | P 40.00  | Sub Total: " + item7);
                    }
                    System.out.println("");
                    System.out.println("");
                    System.out.println("---------------------------------| Total: " + total);
                    System.out.println("");
                    System.out.println("---------------------------------------------------");
                    System.out.println("");
                    qty1 = 0;
                    qty2 = 0;
                    qty3 = 0;
                    qty4 = 0;
                    qty5 = 0;
                    qty6 = 0;
                    qty7 = 0;
                    item1 = 0;
                    item2 = 0;
                    item3 = 0;
                    item4 = 0;
                    item5 = 0;
                    item6 = 0;
                    item7 = 0;
                } else {
                    if (menu.equals("x")) {
                        System.out.println("---------------------| EXIT |----------------------");
                        System.out.println("");
                    } else {
                        System.out.println("------------------| INVALID INPUT | ---------------");
                        System.out.println("");
                    }
                }
            }
        }
        while (!menu.equals("x"));
    }
    
    public static void foodmenu() {
        System.out.println("-------------------| RESTAURANT |------------------");
        System.out.println("-------------------| DELICACIES |------------------");
        System.out.println("[1]Grilled Chicken Plate        | P 235.00");
        System.out.println("[2]Burger Steak                 | P 230.00");
        System.out.println("[3]Grilled Sausage              | P 215.00");
        System.out.println("[4]Barbecue                     | P 140.00");
        System.out.println("[5]Ice Tea                      | P 80.00");
        System.out.println("[6]Coca Cola                    | P 100.00");
        System.out.println("[7]Water                        | P 40.00");
        System.out.println("---------------------------------------------------");
        System.out.println("[8]Review Items                             [9]Exit");
    }
}
