package xxATMSystem;
import java.util.*;
import java.lang.Math;

@SuppressWarnings("unused")
public class Main {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String menu, cmd;
        String newacc = null, acc, newpin = null, pin, confirm;
        int trcknum;
        double amount, balance, deposit, withdraw, sumdeposit, sumwithdraw;
        
        amount = 0;
        balance = 12000;
        deposit = 0;
        withdraw = 0;
        sumdeposit = 0;
        sumwithdraw = 0;
        
        // Iteration
        int i, attempt;
        
        attempt = 5;
        i = 0;
        
        // Random Number
        trcknum = random.nextInt(9999);
        do {
            System.out.println("");
            System.out.println("---------------| ATM SYSTEM |---------------");
            System.out.println("----------------------------| System Online");
            System.out.println("[l]Login     [n]Create Account       [e]Exit");
            System.out.println("Input: ");
            menu = input.nextLine();
            System.out.println("--------------------------------------------");
            if (menu.equals("l") || menu.equals("L")) {
                do {
                    System.out.println("-----------------| Login |------------------");
                    System.out.println("Username: ");
                    acc = input.nextLine();
                    System.out.println("PIN: ");
                    pin = input.nextLine();
                    if (acc.equals(newacc) && pin.equals(newpin)) {
                        attempt = attempt - attempt;
                        System.out.println("-----------| Login Sucessfully |------------");
                    } else {
                        attempt = attempt - 1;
                        System.out.println("Incorrect Username or PIN");
                        System.out.println("----------------------------| Attepmt: " + attempt);
                    }
                }
                while (attempt != 0);
                do {
                    System.out.println("____________________________________________");
                    System.out.println("[b]Balance [w]withdraw [d]Deposit [r]Receipt");
                    System.out.println("-----------------------------------| [x]Exit");
                    System.out.println("Input: ");
                    cmd = input.nextLine();
                    if (cmd.equals("b") || cmd.equals("B")) {
                        System.out.println("Balance     : " + balance);
                    } else {
                        if (cmd.equals("d") || cmd.equals("D")) {
                            do {
                                amount = 0;
                                deposit = 0;
                                System.out.println("Amount: ");
                                amount = input.nextDouble();
                                if (amount > 0) {
                                    System.out.println("Deposit     : " + amount);
                                    System.out.println("");
                                    System.out.println("---------| Confirm Deposit Amount |---------");
                                    System.out.println("[p]Proceed                         [r]Return");
                                    System.out.println("Input: ");
                                    cmd = input.nextLine();
                                    if (cmd.equals("p") || cmd.equals("P")) {
                                        deposit = amount + deposit;
                                        balance = balance + deposit;
                                        sumdeposit = sumdeposit + deposit;
                                        System.out.println("Deposit     : " + deposit);
                                        System.out.println("Balance     : " + balance);
                                    } else {
                                        if (cmd.equals("r") || cmd.equals("R")) {
                                            amount = 0;
                                        } else {
                                            amount = 0;
                                            System.out.println("[" + cmd + "] " + "Character Does Not Exist");
                                        }
                                    }
                                } else {
                                    System.out.println("----------------| Warning! |----------------");
                                    System.out.println("No Amount Deposit");
                                    System.out.println("[p]Proceed                         [r]Return");
                                    System.out.println("Input: ");
                                    cmd = input.nextLine();
                                    if (cmd.equals("p") || cmd.equals("P")) {
                                        amount = 0;
                                    } else {
                                        if (cmd.equals("r") || cmd.equals("R")) {
                                            amount = 0;
                                        } else {
                                            amount = 0;
                                            System.out.println("[" + cmd + "] " + "Character Does Not Exist");
                                        }
                                    }
                                }
                            }
                            while (!cmd.equals("p"));
                        } else {
                            if (cmd.equals("w") || cmd.equals("W")) {
                                do {
                                    amount = 0;
                                    withdraw = 0;
                                    System.out.println("Amount: ");
                                    amount = input.nextDouble();
                                    if (amount > 0) {
                                        if (amount <= balance) {
                                            System.out.println("Balance     : " + balance);
                                            withdraw = withdraw + amount;
                                            balance = balance - withdraw;
                                            System.out.println("Withdraw    : " + withdraw);
                                            System.out.println("Balance     : " + balance);
                                            System.out.println("");
                                            System.out.println("---------| Confirm Withdraw Amount |--------");
                                            System.out.println("[p]Proceed                         [r]Return");
                                            System.out.println("Input: ");
                                            cmd = input.nextLine();
                                            if (cmd.equals("p") || cmd.equals("P")) {
                                                sumwithdraw = sumwithdraw + withdraw;
                                                System.out.println("Withdraw    : " + withdraw);
                                                System.out.println("Balance     : " + balance);
                                            } else {
                                                if (cmd.equals("r") || cmd.equals("R")) {
                                                    balance = balance + withdraw;
                                                    amount = 0;
                                                } else {
                                                    balance = balance + withdraw;
                                                    amount = 0;
                                                    System.out.println("[" + cmd + "] " + "Character Does Not Exist");
                                                }
                                            }
                                        } else {
                                            System.out.println("----------------| Warning! |----------------");
                                            System.out.println("Insufficient Balance");
                                            System.out.println("Balance     : " + balance);
                                            System.out.println("Withdraw    : " + amount);
                                            System.out.println("[p]Proceed                         [r]Return");
                                            System.out.println("Input: ");
                                            cmd = input.nextLine();
                                            if (cmd.equals("p") || cmd.equals("P")) {
                                                amount = 0;
                                            } else {
                                                if (cmd.equals("r") || cmd.equals("R")) {
                                                    amount = 0;
                                                } else {
                                                    amount = 0;
                                                    System.out.println("[" + cmd + "] " + "Character Does Not Exist");
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("----------------| Warning! |----------------");
                                        System.out.println("No Amount Withdraw");
                                        System.out.println("[p]Proceed                         [r]Return");
                                        System.out.println("Input: ");
                                        cmd = input.nextLine();
                                        if (cmd.equals("p") || cmd.equals("P")) {
                                            amount = 0;
                                        } else {
                                            if (cmd.equals("r") || cmd.equals("R")) {
                                                amount = 0;
                                            } else {
                                                System.out.println("[" + cmd + "] " + "Character Does Not Exist");
                                            }
                                        }
                                    }
                                }
                                while (!cmd.equals("p"));
                            } else {
                                if (cmd.equals("r") || cmd.equals("R")) {
                                    System.out.println("------------| Unoffical Receipt |-----------");
                                    System.out.println("Username            : " + acc);
                                    System.out.println("Updated Balance     : " + balance);
                                    System.out.println("History Withdraw    : " + sumwithdraw);
                                    System.out.println("History Deposit     : " + sumdeposit);
                                    System.out.println("Tracked Number      : Undefined");
                                    System.out.println("");
                                    System.out.println("--------------------------------------------");
                                } else {
                                    if (cmd.equals("x") || cmd.equals("X")) {
                                        System.out.println("-------------| Offical Receipt |------------");
                                        System.out.println("Username            : " + acc);
                                        System.out.println("Updated Balance     : " + balance);
                                        System.out.println("History Withdraw    : " + sumwithdraw);
                                        System.out.println("History Deposit     : " + sumdeposit);
                                        System.out.println("Tracked Number      : " + trcknum);
                                        System.out.println("");
                                        System.out.println("--------------------------------------------");
                                        System.out.println("-----------------------------------| [x]Exit");
                                    } else {
                                        System.out.println("[" + cmd + "]" + " Character Does Not Exist");
                                    }
                                }
                            }
                        }
                    }
                }
                while (!cmd.equals("x"));
            } else {
                if (menu.equals("n") || menu.equals("N")) {
                    System.out.println("-----------| Create New Account |-----------");
                    System.out.println("Create Username: ");
                    newacc = input.nextLine();
                    System.out.println("Create PIN: ");
                    newpin = input.nextLine();
                    do {
                        System.out.println("--------------| Confirm PIN |---------------");
                        System.out.println("Confirm PIN: ");
                        confirm = input.nextLine();
                        if (confirm.equals(newpin)) {
                            i = i + 20;
                            System.out.println("Match PIN");
                            System.out.println("------| Account Sucessfully Created |-------");
                            acc = newacc;
                            pin = newpin;
                            System.out.println("Username    :   " + acc);
                            System.out.println("PIN         :   " + pin);
                        } else {
                            i = i + 1;
                            System.out.println("Unmatch PIN Please Try Again");
                        }
                    }
                    while (i < 20);
                } else {
                    if (menu.equals("e") || menu.equals("E")) {
                        System.out.println("-------------| Shutting Down |--------------");
                    } else {
                        System.out.println("--------------| Invalid Input |-------------");
                    }
                }
            }
        }
        while (!menu.equals("e"));
    }
}
