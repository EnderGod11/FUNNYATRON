import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class isFunny {
   static boolean Funny()  {
       int funnyOrNot=0;
       funnyOrNot = (int)(Math.random() * 10+60);  // 60-69 
        return (funnyOrNot==69);
       }
   static String whitelist(String input) {
       String output="failed";
       try {
         File file = new File("lib/whitelist.txt");
         Scanner sc = new Scanner(file);
         while (sc.hasNextLine()) {
           String data = sc.nextLine();
           String[] isFunny = data.split(" ", 3);
           if (isFunny[1].toLowerCase().contains(input.toLowerCase())) {   
               App.funny=(isFunny[0].equals("funny"));
               output=isFunny[2];
           }
         }
         sc.close();
       } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
     
       }
       return output;
    }
   }
