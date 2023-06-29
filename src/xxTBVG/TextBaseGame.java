package xxTBVG;
import java.util.*;

public class TextBaseGame {
    
    @SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);
        String name;
        Storyline story = new Storyline ();
        story.instruction();
        story.exposition();
        story.user();
        name = scn.nextLine();
        Status stat = new Status(name);
        Action act = new Action();
        act.user();
        
    }
}