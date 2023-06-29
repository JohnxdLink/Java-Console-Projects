package xxNanoSoft;
import java.util.*;
import java.lang.Math;

@SuppressWarnings("unused")
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String startingmenu, menu, decide, choices, clm, row, wtrmrk;
        
        do {
            startingpoint();
            startingmenu = input.nextLine();
            if (startingmenu.equals("1")) {
                do {
                    menu();
                    menu = input.nextLine();
                    if (menu.equals("F") || menu.equals("f")) {
                        file();
                        do {
                            decide = input.nextLine();
                            if (decide.equals("S") || decide.equals("s")) {
                                do {
                                    savefile();
                                    choices = input.nextLine();
                                    if (choices.equals("Y") || choices.equals("y")) {
                                        System.out.println("File Save");
                                    } else {
                                        System.out.println("File Did Not Save");
                                    }
                                    System.out.println("Do you want to save your file again? Type: [Y] : [R]");
                                    decide = input.nextLine();
                                    if (decide.equals("Y") || decide.equals("y")) {
                                        System.out.println("Proceed...");
                                    } else {
                                        if (decide.equals("R") || decide.equals("r")) {
                                            System.out.println("Return...");
                                        } else {
                                            System.out.println("Invalid");
                                        }
                                    }
                                }
                                while (!decide.equals("R"));
                            } else {
                                if (decide.equals("V") || decide.equals("v")) {
                                    do {
                                        saveas();
                                        choices = input.nextLine();
                                        if (choices.equals("P") || choices.equals("p")) {
                                            System.out.println("File has been save as PDF");
                                        } else {
                                            if (choices.equals("D") || choices.equals("d")) {
                                                System.out.println("File has been save as DOCX");
                                            } else {
                                                if (choices.equals("T") || choices.equals("t")) {
                                                    System.out.println("File has been save as PPT");
                                                } else {
                                                    System.out.println("File Did Not Save");
                                                }
                                            }
                                        }
                                        System.out.println("Do you want to save another file? Type: [Y] : [R]");
                                        decide = input.nextLine();
                                        if (decide.equals("Y") || decide.equals("y")) {
                                            System.out.println("Proceed...");
                                        } else {
                                            if (decide.equals("R") || decide.equals("r")) {
                                                System.out.println("Return...");
                                            } else {
                                                System.out.println("Invalid");
                                            }
                                        }
                                    }
                                    while (!decide.equals("R"));
                                } else {
                                    if (decide.equals("O") || decide.equals("o")) {
                                        do {
                                            openfile();
                                            choices = input.nextLine();
                                            System.out.println("Your " + choices + " Has Open");
                                            System.out.println("Do you want another file to open? Type: [Y] : [R]");
                                            decide = input.nextLine();
                                            if (decide.equals("Y") || decide.equals("y")) {
                                                System.out.println("Proceed...");
                                            } else {
                                                if (decide.equals("R") || decide.equals("r")) {
                                                    System.out.println("Return...");
                                                } else {
                                                    System.out.println("Invalid");
                                                }
                                            }
                                        }
                                        while (!decide.equals("R"));
                                    } else {
                                        if (decide.equals("C") || decide.equals("c")) {
                                            closingfile();
                                            choices = input.nextLine();
                                            System.out.println("Your " + choices + " Has Close");
                                        }
                                    }
                                }
                            }
                        }
                        while (!decide.equals("R"));
                    } else {
                        if (menu.equals("H") || menu.equals("h")) {
                            home();
                            do {
                                decide = input.nextLine();
                                if (decide.equals("F") || decide.equals("f")) {
                                    do {
                                        fonts();
                                        choices = input.nextLine();
                                        if (choices.equals("1")) {
                                            System.out.println("Font Style Has Been Change Into Calibri");
                                        } else {
                                            if (choices.equals("2")) {
                                                System.out.println("Font Style Has Been Change Into Arial");
                                            } else {
                                                if (choices.equals("3")) {
                                                    System.out.println("Font Style Has Been Change Into Times New Roman");
                                                }
                                            }
                                        }
                                        choices = input.nextLine();
                                        if (choices.equals("Y") || choices.equals("y")) {
                                            choices = input.nextLine();
                                            System.out.println("Font Size Has Been Change Into " + choices);
                                        } else {
                                            System.out.println("Font Size Does Not Change");
                                        }
                                        System.out.println("Do you want to change your font again? Type: [Y] : [R]");
                                        decide = input.nextLine();
                                        if (decide.equals("Y") || decide.equals("y")) {
                                            System.out.println("Proceed...");
                                        } else {
                                            if (decide.equals("R") || decide.equals("r")) {
                                                System.out.println("Return...");
                                            } else {
                                                System.out.println("Invalid");
                                            }
                                        }
                                    }
                                    while (!decide.equals("R"));
                                } else {
                                    if (decide.equals("P") || decide.equals("p")) {
                                        do {
                                            paragraph();
                                            choices = input.nextLine();
                                            if (choices.equals("1")) {
                                                System.out.println("Align Text Has Been Change Into Left");
                                            } else {
                                                if (choices.equals("2")) {
                                                    System.out.println("Align Text Has Been Change Into Center");
                                                } else {
                                                    if (choices.equals("3")) {
                                                        System.out.println("Align Text Has Been Change Into Right");
                                                    } else {
                                                        if (choices.equals("4")) {
                                                            System.out.println("Align Text Has Been Change Into Justify");
                                                        }
                                                    }
                                                }
                                            }
                                            System.out.println("Do you want to change paragraph again? Type: [Y] : [N]");
                                            decide = input.nextLine();
                                            if (decide.equals("Y") || decide.equals("y")) {
                                                System.out.println("Proceed...");
                                            } else {
                                                if (decide.equals("R") || decide.equals("r")) {
                                                    System.out.println("Return...");
                                                } else {
                                                    System.out.println("Invalid");
                                                }
                                            }
                                        }
                                        while (!decide.equals("R"));
                                    } else {
                                        if (decide.equals("S") || decide.equals("s")) {
                                            do {
                                                styles();
                                                choices = input.nextLine();
                                                if (choices.equals("1")) {
                                                    System.out.println("Style Set Has Been Change Into Distinctive");
                                                } else {
                                                    if (choices.equals("2")) {
                                                        System.out.println("Style Set Has Been Change Into Elegant");
                                                    } else {
                                                        if (choices.equals("3")) {
                                                            System.out.println("Style Set Has Been Change Into Modern");
                                                        }
                                                    }
                                                }
                                                choices = input.nextLine();
                                                if (choices.equals("1")) {
                                                    System.out.println("Color Has Been Change Into Apex");
                                                } else {
                                                    if (choices.equals("2")) {
                                                        System.out.println("Color Has Been Change Into Aspect");
                                                    } else {
                                                        if (choices.equals("3")) {
                                                            System.out.println("Color Has Been Change Into Couture");
                                                        }
                                                    }
                                                }
                                                System.out.println("Do you want to change styles again? Type: [Y] : [N]");
                                                decide = input.nextLine();
                                                if (decide.equals("Y") || decide.equals("y")) {
                                                    System.out.println("Proceed...");
                                                } else {
                                                    if (decide.equals("R") || decide.equals("r")) {
                                                        System.out.println("Return...");
                                                    } else {
                                                        System.out.println("Invalid");
                                                    }
                                                }
                                            }
                                            while (!decide.equals("R"));
                                        }
                                    }
                                }
                            }
                            while (!decide.equals("R"));
                        } else {
                            if (menu.equals("I") || menu.equals("i")) {
                                insert();
                                do {
                                    decide = input.nextLine();
                                    if (decide.equals("T") || decide.equals("t")) {
                                        do {
                                            table();
                                            System.out.println("Enter A Value For Column: ");
                                            clm = input.nextLine();
                                            System.out.println("Enter A Value For Row: ");
                                            row = input.nextLine();
                                            System.out.println("Column : " + clm + " Row: " + row);
                                            System.out.println("Do you want to insert table again? Type: [Y] : [R]");
                                            decide = input.nextLine();
                                            if (decide.equals("Y") || decide.equals("y")) {
                                                System.out.println("Proceed...");
                                            } else {
                                                if (decide.equals("R") || decide.equals("r")) {
                                                    System.out.println("Return...");
                                                } else {
                                                    System.out.println("Invalid");
                                                }
                                            }
                                        }
                                        while (!decide.equals("R"));
                                    } else {
                                        if (decide.equals("I") || decide.equals("i")) {
                                            illustration();
                                        }
                                    }
                                }
                                while (!decide.equals("R"));
                            } else {
                                if (menu.equals("P") || menu.equals("p")) {
                                    pagelayout();
                                    do {
                                        decide = input.nextLine();
                                        if (decide.equals("G") || decide.equals("g")) {
                                            do {
                                                pagesetup();
                                                choices = input.nextLine();
                                                if (choices.equals("O") || choices.equals("o")) {
                                                    orientation();
                                                    choices = input.nextLine();
                                                    if (choices.equals("L") || choices.equals("l")) {
                                                        System.out.println("Orientation Has Been Change Into Landscape");
                                                    } else {
                                                        if (choices.equals("P") || choices.equals("p")) {
                                                            System.out.println("Orientation Has Been Change Into Portrait");
                                                        } else {
                                                            System.out.println("Orientation Is On Default");
                                                        }
                                                    }
                                                } else {
                                                    if (choices.equals("S") || choices.equals("s")) {
                                                        sizepaper();
                                                        choices = input.nextLine();
                                                        if (choices.equals("L") || choices.equals("l")) {
                                                            System.out.println("Paper Size Has Been Change Into Letter");
                                                        } else {
                                                            if (choices.equals("O") || choices.equals("o")) {
                                                                System.out.println("Paper Size Has Been Change Into Long");
                                                            } else {
                                                                if (choices.equals("A") || choices.equals("a")) {
                                                                    System.out.println("Paper Size Has Been Change Into A4");
                                                                } else {
                                                                    System.out.println("Paper Size Is On Default");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                System.out.println("Do you want to change page setup again? Type: [Y] : [R]");
                                                decide = input.nextLine();
                                                if (decide.equals("Y") || decide.equals("y")) {
                                                    System.out.println("Proceed...");
                                                } else {
                                                    if (decide.equals("R") || decide.equals("r")) {
                                                        System.out.println("Return...");
                                                    } else {
                                                        System.out.println("Invalid");
                                                    }
                                                }
                                            }
                                            while (!decide.equals("R"));
                                        } else {
                                            if (decide.equals("B") || decide.equals("b")) {
                                                do {
                                                    pagebackground();
                                                    choices = input.nextLine();
                                                    if (choices.equals("W") || choices.equals("w")) {
                                                        watermark();
                                                        wtrmrk = input.nextLine();
                                                        System.out.println("Watermark Added: " + wtrmrk);
                                                    } else {
                                                        if (choices.equals("C") || choices.equals("c")) {
                                                            pagecolor();
                                                            choices = input.nextLine();
                                                            if (choices.equals("R") || choices.equals("r")) {
                                                                System.out.println("Page Color Has Been Change Into Red");
                                                            } else {
                                                                if (choices.equals("B") || choices.equals("b")) {
                                                                    System.out.println("Page Color Has Been Change Into Blue");
                                                                } else {
                                                                    if (choices.equals("Y") || choices.equals("y")) {
                                                                        System.out.println("Page Color Has Been Change Into Yellow");
                                                                    } else {
                                                                        System.out.println("Page Color Is On Default");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    System.out.println("Do you want to change page background again? Type: [Y] : [N]");
                                                    decide = input.nextLine();
                                                    if (decide.equals("Y") || decide.equals("y")) {
                                                        System.out.println("Proceed...");
                                                    } else {
                                                        if (decide.equals("R") || decide.equals("r")) {
                                                            System.out.println("Return...");
                                                        } else {
                                                            System.out.println("Invalid");
                                                        }
                                                    }
                                                }
                                                while (!decide.equals("R"));
                                            }
                                        }
                                    }
                                    while (!decide.equals("R"));
                                }
                            }
                        }
                    }
                }
                while (!menu.equals("X"));
            } else {
                if (startingmenu.equals("2")) {
                    instruction();
                } else {
                    if (startingmenu.equals("3")) {
                    } else {
                        System.out.println("Invalid");
                    }
                }
            }
        }
        while (!startingmenu.equals("3"));
    }
    
    public static void closingfile() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|===========|           |             |                  |           |              |");
        System.out.println("|==[F]File==|  [H]Home  |  [I]Insert  |  [P]Page Layout  |           |  [R]Return   |");
        System.out.println("|===========|           |             |                  |           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |");
        System.out.println("|  [S]Save  |");
        System.out.println("|___________|");
        System.out.println("|           |");
        System.out.println("|  [V]Save  |");
        System.out.println("|      as   |");
        System.out.println("|___________|");
        System.out.println("|===========|");
        System.out.println("|==[C]Close=|                                Close Your File");
        System.out.println("|___________|");
    }
    
    public static void file() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|===========|           |             |                  |           |              |");
        System.out.println("|==[F]File==|  [H]Home  |  [I]Insert  |  [P]Page Layout  |  [X]Exit  |              |");
        System.out.println("|===========|           |             |                  |           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |");
        System.out.println("|  [S]Save  |");
        System.out.println("|___________|");
        System.out.println("|           |");
        System.out.println("|  [V]Save  |");
        System.out.println("|      as   |");
        System.out.println("|___________|");
        System.out.println("|           |");
        System.out.println("|  [O]Open  |");
        System.out.println("|___________|");
        System.out.println("|           |");
        System.out.println("|  [C]Close |");
        System.out.println("|___________|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("| Type: ");
    }
    
    public static void fonts() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |===========|             |                  |           |              |");
        System.out.println("|  [F]File  |==[H]Home==|  [I]Insert  |  [P]Page Layout  |           |  [R]Return   |");
        System.out.println("|           |===========|             |                  |           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("            |==[F]Font==|  [P]Paragraph  |  [S]Styles  |");
        System.out.println("            |__________________________________________|");
        System.out.println("            | Font Style: [1]Calibri : [2]Arial : [3]Times New Roman");
        System.out.println("            | Type : [1] : [2] : [3]");
        System.out.println("            |");
        System.out.println("            | Enter Number To Change Font Size:");
        System.out.println("            | Type : [Y] : [N]");
    }
    
    public static void home() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |===========|             |                  |           |              |");
        System.out.println("|  [F]File  |==[H]Home==|  [I]Insert  |  [P]Page Layout  |  [X]Exit  |              |");
        System.out.println("|           |===========|             |                  |           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("            |  [F]Font  |  [P]Paragraph  |  [S]Styles  |");
        System.out.println("            |__________________________________________|");
    }
    
    public static void illustration() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |           |=============|                  |           |              |");
        System.out.println("|  [F]File  |  [H]Home  |==[I]Insert==|  [P]Page Layout  |           |  [R]Return   |");
        System.out.println("|           |           |=============|                  |           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("                        |  [T]Table  |==[I]Illustrations==|");
        System.out.println("                        |_________________________________|");
        System.out.println("                                     | >> Shapes");
        System.out.println("                                     | >> CLip Art");
        System.out.println("                                     | >> Chart");
        System.out.println("                                     | Sorry This Illustrations Are Not Yet Available");
    }
    
    public static void insert() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |           |=============|                  |           |              |");
        System.out.println("|  [F]File  |  [H]Home  |==[I]Insert==|  [P]Page Layout  |  [X]Exit  |              |");
        System.out.println("|           |           |=============|                  |           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("                        |  [T]Table  |  [I]Illustrations  |");
        System.out.println("                        |_________________________________|");
    }
    
    public static void instruction() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|                                       [2]Instruction                              |");
        System.out.println("|+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
        System.out.println("|1. Type 1 For Start.                                                               |");
        System.out.println("|2. Type 2 For Instruction.                                                         |");
        System.out.println("|3. Type 3 For Exit.                                                                |");
        System.out.println("|-----------------------------------------------------------------------------------|");
        System.out.println("|4. Type F For File.                                    Input Must Be Capital Letter|");
        System.out.println("|5. Type H For Home.                                                                |");
        System.out.println("|6. Type I For Insert.                                                              |");
        System.out.println("|7. Type P For Page Layout.                                                         |");
        System.out.println("|8. Type R For Return                                                               |");
        System.out.println("|9. Type X For Exit.                                                                |");
        System.out.println("|10. Type S For Save.                                                               |");
        System.out.println("|11. Type V For Save as.                                                            |");
        System.out.println("|12. Type O For Open.                                                               |");
        System.out.println("|13. Type C For Close.                                                              |");
        System.out.println("|                                                                    Type: [3]Exit  |");
        System.out.println("|-----------------------------------------------------------------------------------|");
    }
    
    public static void menu() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |           |             |                  |           |              |");
        System.out.println("|  [F]File  |  [H]Home  |  [I]Insert  |  [P]Page Layout  |  [X]Exit  |              |");
        System.out.println("|           |           |             |                  |           |              |");
        System.out.println("|___________________________________________________________________________________|");
    }
    
    public static void openfile() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|===========|           |             |                  |           |              |");
        System.out.println("|==[F]File==|  [H]Home  |  [I]Insert  |  [P]Page Layout  |           |  [R]Return   |");
        System.out.println("|===========|           |             |                  |           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |");
        System.out.println("|  [S]Save  |");
        System.out.println("|___________|");
        System.out.println("|           |");
        System.out.println("|  [V]Save  |");
        System.out.println("|      as   |");
        System.out.println("|___________|");
        System.out.println("|           |");
        System.out.println("|===========|");
        System.out.println("|==[O]Open==|                                Open Your File");
        System.out.println("|___________|");
        System.out.println("|           |");
        System.out.println("|  [C]Close |");
        System.out.println("|___________|");
    }
    
    public static void orientation() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|  [F]File  |  [H]Home  |  [I]Insert  |==[P]Page Layout==|           |  [R]Return   |");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("                                      |==[G]Page Setup==| [B]Page Background  |");
        System.out.println("                                      |_______________________________________|");
        System.out.println("                                      |==[O]Orientation=|");
        System.out.println("                                      | Choose : [L]Landscape : [P]Portrait");
        System.out.println("                                      | Type : [L] : [P]");
    }
    
    public static void pagebackground() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|  [F]File  |  [H]Home  |  [I]Insert  |==[P]Page Layout==|           |  [R]Return   |");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("                                      |  [G]Page Setup  |=[B]Page Background==|");
        System.out.println("                                      |_______________________________________|");
        System.out.println("                                                        | [W]Watermark  |");
        System.out.println("                                                        | [C]Page Color |");
    }
    
    public static void pagecolor() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|  [F]File  |  [H]Home  |  [I]Insert  |==[P]Page Layout==|           |  [R]Return   |");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("                                      |==[G]Page Setup==| [B]Page Background  |");
        System.out.println("                                      |_______________________________________|");
        System.out.println("                                      |  [G]Page Setup  |=[B]Page Background==|");
        System.out.println("                                      |_______________________________________|");
        System.out.println("                                                        |=[C]Page Color=|");
        System.out.println("                                                        | Choose : [R]Red : [B]Blue : [Y]Yellow");
        System.out.println("                                                        | Type : [R] : [B] : [Y]");
    }
    
    public static void pagelayout() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|  [F]File  |  [H]Home  |  [I]Insert  |==[P]Page Layout==|  [X]Exit  |              |");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("                                      |  [G]Page Setup  | [B]Page Background  |");
        System.out.println("                                      |_______________________________________|");
    }
    
    public static void pagesetup() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|  [F]File  |  [H]Home  |  [I]Insert  |==[P]Page Layout==|           |  [R]Return   |");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("                                      |==[G]Page Setup==| [B]Page Background  |");
        System.out.println("                                      |_______________________________________|");
        System.out.println("                                      |  [O]Orientation |");
        System.out.println("                                      |  [S]Size        |");
    }
    
    public static void paragraph() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |===========|             |                  |           |              |");
        System.out.println("|  [F]File  |==[H]Home==|  [I]Insert  |  [P]Page Layout  |           |  [R]Return   |");
        System.out.println("|           |===========|             |                  |           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("            |  [F]Font  |==[P]Paragraph==|  [S]Styles  |");
        System.out.println("            |__________________________________________|");
        System.out.println("                        | Align Text: [1]Left [2]Center [3]Right [4]Justify");
        System.out.println("                        | Type : [1] : [2] : [3] : [4]");
    }
    
    public static void saveas() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|===========|           |             |                  |           |              |");
        System.out.println("|==[F]File==|  [H]Home  |  [I]Insert  |  [P]Page Layout  |           |  [R]Return   |");
        System.out.println("|===========|           |             |                  |           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |");
        System.out.println("|  [S]Save  |");
        System.out.println("|___________|");
        System.out.println("|===========|");
        System.out.println("|==[V]Save==|                   Save your File as [P]PDF [D]DOCX [T]PPT");
        System.out.println("|=====as====|                            Type [P] : [D] : [T]");
        System.out.println("|___________|");
        System.out.println("|           |");
        System.out.println("|  [O]Open  |");
        System.out.println("|___________|");
        System.out.println("|           |");
        System.out.println("|  [C]Close |");
        System.out.println("|___________|");
    }
    
    public static void savefile() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|===========|           |             |                  |           |              |");
        System.out.println("|==[F]File==|  [H]Home  |  [I]Insert  |  [P]Page Layout  |           |  [R]Return   |");
        System.out.println("|===========|           |             |                  |           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|===========|");
        System.out.println("|==[S]Save==|                        Do you want to save your file?");
        System.out.println("|___________|                             Type : [Y]Yes : [N]No");
        System.out.println("|           |");
        System.out.println("|  [V]Save  |");
        System.out.println("|      as   |");
        System.out.println("|___________|");
        System.out.println("|           |");
        System.out.println("|  [O]Open  |");
        System.out.println("|___________|");
        System.out.println("|           |");
        System.out.println("|  [C]Close |");
        System.out.println("|___________|");
    }
    
    public static void sizepaper() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|  [F]File  |  [H]Home  |  [I]Insert  |==[P]Page Layout==|           |  [R]Return   |");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("                                      |==[G]Page Setup==| [B]Page Background  |");
        System.out.println("                                      |_______________________________________|");
        System.out.println("                                      |==[S]Size========|");
        System.out.println("                                      | Choose : [L]Letter : [O]Long : [A]A4");
        System.out.println("                                      | Type : [L] : [O] : [A]");
    }
    
    public static void startingpoint() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                                       JC NANOSOFT                                 +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|[1]Start                              [2]Instruction                        [3]Exit|");
        System.out.println("|+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|Type : [1] : [2] : [3]");
    }
    
    public static void styles() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |===========|             |                  |           |              |");
        System.out.println("|  [F]File  |==[H]Home==|  [I]Insert  |  [P]Page Layout  |           |  [R]Return   |");
        System.out.println("|           |===========|             |                  |           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("            |  [F]Font  |  [P]Paragraph  |==[S]Styles==|");
        System.out.println("            |__________________________________________|");
        System.out.println("                                         | Style Set: [1]Distinctive [2]Elegant [3]Modern");
        System.out.println("                                         | Type : [1] : [2] : [3]");
        System.out.println("                                         | Change Color: [1]Apex [2]Aspect [3]Couture");
        System.out.println("                                         | Type : [1] : [2] : [3]");
    }
    
    public static void table() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |           |=============|                  |           |              |");
        System.out.println("|  [F]File  |  [H]Home  |==[I]Insert==|  [P]Page Layout  |           |  [R]Return   |");
        System.out.println("|           |           |=============|                  |           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("                        |==[T]Table==|  [I]Illustrations  |");
        System.out.println("                        |_________________________________|");
        System.out.println("                        | Enter A Column:");
        System.out.println("                        | Enter A Row:");
    }
    
    public static void watermark() {
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|  [F]File  |  [H]Home  |  [I]Insert  |==[P]Page Layout==|           |  [R]Return   |");
        System.out.println("|           |           |             |==================|           |              |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("                                      |  [G]Page Setup  |=[B]Page Background==|");
        System.out.println("                                      |_______________________________________|");
        System.out.println("                                                        | [W]Watermark  |");
        System.out.println("                                                        | Enter Your Watermark");
    }
}
