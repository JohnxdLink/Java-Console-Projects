package xxTBVG;
import java.util.*;
/*hierarchical inheritance*/
class Action extends Status {
/*encapsulation*/
    private int weapon;
    private int defend = 50;
    private int repeat = 100;
    private int golatk = 100;
    private int herohp = 100;
    private int enemhp = 100;
/*overriding method*/    
    void user() throws InterruptedException {
        @SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
/*keyword super*/
        super.user();
/*operator*/
        int herohpdec = herohp - golatk;
        int herohphalfdec = herohp - defend;
        int enemhpdec1 = enemhp - spear;
        int enemhpdec2 = enemhpdec1 - spear;
        int enemhpdec3 = enemhpdec2 - 20;
        int enemhpdec4 = enemhp - sword;
        int enemhpdec5 = enemhpdec4 - sword;
        int enemhpdec6 = enemhp - slingshot;
/*while statement*/
        while (repeat > 0) {
            System.out.print(user[6]);
            weapon = scn.nextInt();
            Thread.sleep(1000);
            if (weapon == 1) { //SPEAR ACTION
                System.out.print(display[3] + "\n");
                Thread.sleep(2000);
                System.out.print(display[0] + display[1] + herohp + display[2] + enemhp + "\n");
                Thread.sleep(2000);
                System.out.print(damage[0] + damage[1] + spear + damage[2] + golatk + "\n");
                Thread.sleep(2000);
                for (String script : battle) {
                    System.out.print(script);
                    Thread.sleep(2000);
                }
                for (String script : goliath) {
                    System.out.print(script);
                    Thread.sleep(2000);
                }
                System.out.print(golact[0] + user[7]);
                weapon = scn.nextInt();
/*switch case statement*/
                switch(weapon) {
                    case 1:
                        if (spear != golatk) {
                            System.out.print(golact[5]);
                            Thread.sleep(2000);
                            System.out.print(choices[0] + choices[1] + "\n");
                            Thread.sleep(2000);
                            System.out.print(display[0]);
                            Thread.sleep(2000);
                            System.out.print(display[1] + herohp);
                            Thread.sleep(2000);
                            System.out.print(display[2] + enemhpdec1 + "\n");
                            Thread.sleep(2000);
                            System.out.print(golact[1]);
                            Thread.sleep(2000);
                            System.out.print(golact[6] + user[7]);
                            weapon = scn.nextInt();
                            if (weapon == 1 && spear != golatk) {
                                System.out.print(golact[5]);
                                Thread.sleep(2000);
                                System.out.print(choices[0] + choices[1] + "\n");
                                Thread.sleep(2000);
                                System.out.print(display[0]);
                                Thread.sleep(2000);
                                System.out.print(display[1] + herohp);
                                Thread.sleep(2000);
                                System.out.print(display[2] + enemhpdec2 + "\n");
                                Thread.sleep(2000);
                                System.out.print(golact[2]);
                                Thread.sleep(2000);
                                System.out.print(golact[3] + user[7]);
                                weapon = scn.nextInt();
                                if (weapon == 1 && spear != golatk) {
                                    System.out.print(golact[5]);
                                    Thread.sleep(2000);
                                    System.out.print(choices[0] + choices[1] + "\n");
                                    Thread.sleep(2000);
                                    System.out.print(display[0]);
                                    Thread.sleep(2000);
                                    System.out.print(display[1] + herohp);
                                    Thread.sleep(2000);
                                    System.out.print(display[2] + enemhpdec3 + "\n");
                                    Thread.sleep(2000); 
                                    System.out.print(user[8]);
                                    Thread.sleep(2000);
                                    for (String end : ending) {
                                    System.out.print(end);
                                    Thread.sleep(2000);
                                    }
                                } else {
                                System.out.print(gameover[0]);
                                Thread.sleep(2000);
                                System.out.print(display[0] + display[1] + herohpdec + display[2] + enemhp + "\n");
                                Thread.sleep(2000);
                                System.out.print(gameover[5] + "\n");
                                Thread.sleep(2000);    
                            }
                            } else {
                            System.out.print(gameover[1]);
                            Thread.sleep(2000);
                            System.out.print(display[0] + display[1] + herohpdec + display[2] + enemhp + "\n");
                            Thread.sleep(2000);
                            System.out.print(gameover[5] + "\n");
                            Thread.sleep(2000); 
                        }
                    } else {
                        System.out.print(gameover[2]);
                        Thread.sleep(2000);
                        System.out.print(display[0] + display[1] + herohpdec + display[2] + enemhp + "\n");
                        Thread.sleep(2000);
                        System.out.print(gameover[5] + "\n");
                        Thread.sleep(2000);
                    }
                        break; //case 1 break
                    case 2:
                        System.out.print(gameover[4]);
                        Thread.sleep(2000);
                        System.out.print(display[0] + display[1] + herohpdec + display[2] + enemhp + "\n");
                        Thread.sleep(2000);
                        System.out.print(gameover[5] + "\n");
                        Thread.sleep(2000);
                        break; //case 2 break
                    case 3:
                        System.out.print(gameover[3]);
                        Thread.sleep(2000);
                        System.out.print(display[0] + display[1] + herohpdec + display[2] + enemhp + "\n");
                        Thread.sleep(2000);
                        System.out.print(gameover[5] + "\n");
                        Thread.sleep(2000);
                        break; //case 3 break
                    default: 
                    } 
                break; //if break
            } else if (weapon == 2) { //SWORD ACTION
                System.out.print(display[4] + "\n");
                Thread.sleep(2000);
                System.out.print(display[0] + display[1] + herohp + display[2] + enemhp + "\n");
                for (String script : battle) {
                    System.out.print(script);
                    Thread.sleep(2000);
                }
                for (String script : goliath) {
                    System.out.print(script);
                    Thread.sleep(2000);
                }
                System.out.print(golact[7] + user[7]);
                weapon = scn.nextInt();
                switch (weapon) {
                    case 1:
                        System.out.print(gameover[4]);
                        Thread.sleep(2000);
                        System.out.print(display[0] + display[1] + herohphalfdec + display[2] + enemhp + "\n");
                        Thread.sleep(2000);
                        System.out.print(gameover[5] + "\n");
                        Thread.sleep(2000);
                        break; //case 1 break
                    case 2:
                        if (sword != golatk) {
                            System.out.print(golact[8]);
                            Thread.sleep(2000);
                            System.out.print(choices[0] + choices[2] + "\n");
                            Thread.sleep(2000);
                            System.out.print(display[0]);
                            Thread.sleep(2000);
                            System.out.print(display[1] + herohphalfdec);
                            Thread.sleep(2000);
                            System.out.print(display[2] + enemhp + "\n");
                            Thread.sleep(2000);
                            System.out.print(golact[9] + user[7]);
                            weapon = scn.nextInt();
                            if (weapon == 3 && sword != golatk) {
                            System.out.print(golact[10]);
                            Thread.sleep(2000);
                            System.out.print(choices[0] + choices[3] + "\n");
                            Thread.sleep(2000);
                            System.out.print(display[0]);
                            Thread.sleep(2000);
                            System.out.print(display[1] + herohphalfdec);
                            Thread.sleep(2000);
                            System.out.print(display[2] + enemhpdec4 + "\n");
                            Thread.sleep(2000);
                            System.out.print(golact[11] + user[7]);
                            weapon = scn.nextInt();
                            if (weapon == 1 && sword != golatk) {
                                    System.out.print(choices[0] + choices[1] + "\n");
                                    Thread.sleep(2000);
                                    System.out.print(display[0]);
                                    Thread.sleep(2000);
                                    System.out.print(display[1] + herohphalfdec);
                                    Thread.sleep(2000);
                                    System.out.print(display[2] + enemhpdec5 + "\n");
                                    Thread.sleep(2000);
                                    System.out.print(user[8]);
                                    Thread.sleep(2000);
                                    for (String end : ending) {
                                    System.out.print(end);
                                    Thread.sleep(2000);
                                    }
                                } else {
                                System.out.print(gameover[2]);
                                Thread.sleep(2000);
                                System.out.print(display[0] + display[1] + herohpdec + display[2] + enemhp + "\n");
                                Thread.sleep(2000);
                                System.out.print(gameover[5] + "\n");
                                Thread.sleep(2000);     
                            }   
                            }
                        } else {
                        System.out.print(gameover[3]);
                        Thread.sleep(2000);
                        System.out.print(display[0] + display[1] + herohpdec + display[2] + enemhp + "\n");
                        Thread.sleep(2000);
                        System.out.print(gameover[5] + "\n");
                        Thread.sleep(2000);
                        
                    }
                        break; //case 2 break
                    case 3:
                        System.out.print(gameover[3]);
                        Thread.sleep(2000);
                        System.out.print(display[0] + display[1] + herohpdec + display[2] + enemhp + "\n");
                        Thread.sleep(2000);
                        System.out.print(gameover[5] + "\n");
                        Thread.sleep(2000);
                        break; //case 3 break
                }
                break;
            } else if (weapon == 3) { //SLINGSHOT ACTION
                System.out.print(display[5] + "\n");
                Thread.sleep(2000);
                System.out.print(display[0] + display[1] + herohp + display[2] + enemhp + "\n");
                for (String script : battle) {
                    System.out.print(script);
                    Thread.sleep(2000);
                }
                for (String script : goliath) {
                    System.out.print(script);
                    Thread.sleep(2000);
                }
                System.out.print(golact[12] + user[7]);
                weapon = scn.nextInt();
                switch (weapon) {
                    case 1:
                        System.out.print(golact[13]);
                        Thread.sleep(2000);
                        System.out.print(user[9]);
/*for loop statement*/
                        for (int i = 0; i < 3; i++) {
                            System.out.print(user[10]);
                            weapon = scn.nextInt();
                        }
                    for (String swing : sling) {
                        System.out.print(swing);
                        Thread.sleep(2000);
                    }
                    System.out.print(user[11]);
                    Thread.sleep(2000);
                    System.out.print(display[0]);
                    Thread.sleep(2000);
                    System.out.print(display[1] + herohp);
                    Thread.sleep(2000);
                    System.out.print(display[2] + enemhpdec6 + "\n");
                    Thread.sleep(2000);
                    System.out.print(user[8]);
                    Thread.sleep(2000);
                    for (String end : ending) {
                        System.out.print(end);
                        Thread.sleep(2000);
                    }
                        break; //case 1 break
                    case 2:
                        System.out.print(gameover[2]);
                        Thread.sleep(2000);
                        System.out.print(display[0] + display[1] + herohpdec + display[2] + enemhp + "\n");
                        Thread.sleep(2000);
                        System.out.print(gameover[5] + "\n");
                        Thread.sleep(2000);
                        break; //case 2 break
                    case 3:
                        System.out.print(gameover[0]);
                        Thread.sleep(2000);
                        System.out.print(display[0] + display[1] + herohpdec + display[2] + enemhp + "\n");
                        Thread.sleep(2000);
                        System.out.print(gameover[5] + "\n");
                        Thread.sleep(2000);
                        break; //case 3 break
                }
                break;
            } else { //REPEAT PROCESS
                System.out.print(display[6]);
                repeat--;
            }
        }
    }
}