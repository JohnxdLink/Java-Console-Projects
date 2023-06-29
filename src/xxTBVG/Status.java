package xxTBVG;
import java.util.*;

class Status extends Storyline {
    String input;
    @SuppressWarnings("unused")
	private String name;
    int spear, sword, slingshot;
/*overloading constructor*/
    Status() {}
/*constructor*/
    Status(String name) throws InterruptedException {
        @SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
/*keyword this*/
        this.name = name;
        for (String weap : weapon) {
            System.out.print(weap);
            Thread.sleep(2000);
        }
        System.out.print(user[1]);
        input = scn.nextLine();
        if (input.equalsIgnoreCase(yes)) {
            System.out.print(user[2] + user[3] + user[4] + user[5]);
            Thread.sleep(2000);
        } else {
            
        }
    }
/*method overriding*/    
    void user() throws InterruptedException {
/*keyword super*/
        spear = 40;
        sword = 50;
        slingshot = 100;
        
    }
}    
