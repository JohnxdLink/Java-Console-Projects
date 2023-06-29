package xxTBVG;
import java.util.*;

class Storyline {
	/*variable, data type, arrays
	elements of an array,variables, attributes*/
	    String input;
	    
	    String yes = "Yes";
	                          //0                         //1
	    String[] user = {"\nEnter Your Name Hero: ", "\nDo you want to display the damage weapon?\n",
	                     "\nWeapon Damage: ",            //2
	                     "\nSpear Dmg: 40",              //3
	                     "\nSword Dmg: 50",              //4
	                     "\nSlingshot Dmg: 100\n",       //5
	                     "\nChoose Your Weapon: 1.Spear 2.Sword 3.Slingshot \nWeapon: ", //6
	                     "\nChoose Your Action: 1.Attack 2.Guard 3. Break \nAction: ",   //7
	                     "\nGoliath Defeated!",                                          //8
	                     "\nCharge your Slingshot by pressing 1 up to 3 number\n",       //9
	                     "Charge: ",                                                     //10
	                     "\nThe stone struck on Goliath's forehead!\n"};                 //11                           
	    
	    String[] sling = {"\nHero: *Ready*",
	                 "\nHero: *Aim*",
	                 "\nHero: *Fire*"}; 
	    
	    String[] display = {"\nHealth Display: ", "\nHero HP: ",     //0  //1
	                        "\nEnemy HP: ",                               //2
	                        "Equiped Weapon: Spear",                      //3
	                        "Equiped Weapon: Sword",                      //4
	                        "Equiped Weapon: Slingshot",                  //5
	                        "\nInvalid Input."};                          //6
	    
	    String[] damage = {"\nAttack Damage: ",
	                       "\nHero Attack Dmg: ",
	                       "\nGoliath Attack Dmg:"};
	    
	    String[] weapon = {"\nWeapon Available: ", "\nSpear", "\nSword", "\nSlingshot\n"};
	    
	    String[] choices = {"\nHero Action: ", "*Attack*", "*Guard*", "*Break*"};
	    
	    String[] intro = {"\nSLAY GOLIATH THE GIANT\n", 
	                      "\nDo you want to know how to play?",
	                      "\nType: Yes or No\n",
	                      "\nI hope you are ready to fight Goliath.\n",
	                      "\nYou may now create your own Story.\n"};
	    
	    String[] how = {"\nHOW TO PLAY: ",
	                    "\nStep 1: First is you need to enter your name.",
	                    "\nStep 2: Next Choose your weapon.",
	                    "\nStep 3: In order to take an Action you need to type 1, 2, or 3.",
	                    "\nStep 4: These are the following Action: 1.Attack 2.Guard 3.Break",
	                    "\nStep 5: If the enemy try to Attack, use Guard. Pay attention that your will decrease.",
	                    "\nStep 6: If the enemy try to Guard, use Break. It will decrease the enemy's health.",
	                    "\nStep 7: If the enemy try to Break, use Attack. It will decrease the enemy's health.\n"};
	    
	    String[] expo = {"\nThe Philistine army had gathered for war against Israel.",
	                     "\nThe two armies faced each other, camped for battle on opposite sides of a steep valley.",
	                     "\nA Philistine giant measuring over nine feet tall and wearing full armor came out each day for forty days, mocking and challenging the Israelites to fight.",
	                     "\nHis name was Goliath. Saul, the King of Israel, and the whole army were terrified of Goliath.",
	                     "\nHowever, ", "there is a warrior can defeat Goliath.\n" };
	    
	    String[] climax = {"\nYou are being chosen to fight Goliath young hero!", 
	                       "\nGod choose you to save Israel.",
	                       "\nNow it is time to defeat Goliath", ".",".",".\n" };
	    
	    String[] battle = {"\nNow time to face Goliath", 
	                       "\nMay God be with you Hero.",
	                       "\n*Entering Battle*", ".", ".", ".\n"};
	    
	    String[] goliath = {"\nGoliath: Ha!",
	        "\nGoliath: You think that you can defeat me?!",
	        "\nGoliath: If you can kill me, all of my Philistine army will be your slaves!",
	        "\nGoliath: If I win this battle and kill you, All of the Israelites will be our servant!",
	        "\nGoliath: Time to face your death Hero of Israel!",
	        "\n\n*LET THE BATTLE BEGIN!*", ".", ".", ".\n"};
	    
	    String[] golact = {"\nGoliath wants to Break your Guard!",  //0
	        "\nGoliath was stunned!",                               //1
	        "\nGoliath can stand stil!",                            //2
	        "\nGoliath run towards you to Break your Defense!",     //3
	        "\nGoliath has Slain!",                                 //4   
	        "\nGoliath: *Missed*",                                 //5 
	        "\nGoliath regain his consciousness. \nHe try to Break your Guard again.", //6
	        "\nGoliath wants to Attack!",                          //7
	        "\nGoliath: *Attack*",                                //8
	        "\nGoliath pulls back and he is on Guard!",            //9
	        "\nGoliath: *Guard*",                                  //10
	        "\nGoliath fell on the ground time to Finish him!",    //11
	        "\nGoliath run towards at you!",                       //12
	        "\nGoliath : *Running*"};                              //13
	    
	    String[] gameover = {"\nYou are lack of faith.",            //0
	        "\nYou are being so reckless.",                      //1
	        "\nYou did not pay attention to enemy's movement.",  //2
	        "\nYou have been slain.",                            //3
	        "\nOnce you are dead, there is no revival.",         //4
	        "\nGAME OVER!"};                                     //5
	    
	    String[] ending = {"\nWhen the Philistines saw that Goliath was dead,",
	                       "\nthey ran away in fear.",
	                       "\nThe Israelites won the battle."};
	//object method 
	    void instruction() throws InterruptedException {
	        @SuppressWarnings("resource")
			Scanner scn = new Scanner(System.in);
	        System.out.print(intro[0]);
	        Thread.sleep(2500);
	        System.out.print(intro[1] + intro[2]);
	        input = scn.nextLine();
	/*conditional statement*/
	/*for each loop*/        
	        if (input.equalsIgnoreCase(yes)) {
	           for(String instruct : how) {
	                System.out.print(instruct);
	                Thread.sleep(2000);
	            }
	            System.out.print(intro[3]);
	            input = scn.nextLine();
	            System.out.print(intro[4]);
	            Thread.sleep(1000);
	        } else {
	             Thread.sleep(1000);
	        }
	    }
	    
	    void exposition() throws InterruptedException {
	        for(String intro : expo) {
	            System.out.print(intro);
	            Thread.sleep(2000);
	        }

	    }
	    void user() throws InterruptedException {
	        for (String cli : climax) {
	            System.out.print(cli);
	            Thread.sleep(2000);
	        }
	        System.out.print(user[0]);
	    }

}
