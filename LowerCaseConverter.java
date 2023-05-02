
import java.util.Scanner;
public class LowerCaseConverter {
   // 2.Write a Java program to convert a given string into lowercase.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String lowerCaseString = input.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseString);
    }
}

