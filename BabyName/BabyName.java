import java.util.Scanner;
import java.io.File;
import java.util.*;
import java.io.IOException;
import java.io.FileNotFoundException;


public class BabyName
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         
        System.out.print("Enter the year: ");
        String year = input.nextLine();
        
   

        System.out.print("Enter the gender: ");
        String gender = input.nextLine();

        System.out.print("Enter the name: ");
        String name = input.nextLine();

    
        ArrayList<String> list = new ArrayList<>();

        
        try {
                 File file = new File(year);
                 Scanner inputFile = new Scanner(file);
            
            
            input = new Scanner(year);
            while (input.hasNext()) {
                for (int i = 0; i < 5; i++) {
                    list.add(i, input.next());
                }

                
                if (list.get(gender(gender)).equals(name)) {
                    System.out.println(
                        name + " is ranked #" + list.get(0) + " in year " + year);
                    System.exit(0);
                }
                list.clear();
            }
        }
        catch (java.io.FileNotFoundException ex) {
            System.out.println("I/O Errors: no such file");
        }

        System.out.println("The name " + name + " is not ranked in year " + year);
    }


    public static int gender(String gender) {
        if (gender.equals("M"))
            return 1;
        else
            return 2;
    }
}