  import java.io.File;
  import java.io.*;
  import java.util.Scanner;

  public class fileIO {
  public static void main(String[] args) throws IOException {

    System.out.print("Enter file name: ");
    File file = new File(new Scanner(System.in).next());

    String buffer = "";
    int[] letterCount = new int[26];
    try (Scanner input = new Scanner(file)) {

        while (input.hasNextLine()) {
            buffer = input.next();
            for (char ch : buffer.toCharArray()) {
                
                if (isLetter(ch)) {
                    letterCount[ch - 'A']++;
                }
            }

        }
    } 
    catch (FileNotFoundException e) {
       e.printStackTrace();
       System.out.print(file + " not found.\n");
       System.exit(0);
        
     
    }

    for (int i = 0; i < letterCount.length; i++) {
        System.out.println("The occurance of " + (char)(i + 'A') + "'s is "  + letterCount[i]);
    }

}

public static boolean isLetter(char ch) 
{

    return (ch >= 'A' && ch <= 'Z');
}
}