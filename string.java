import java.util.Scanner;
public class string {
    public static void main(String[] args) {
       //3. Write a Java program that takes a string and a number from the user,then prints the character in the given index.

        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int index = scanner.nextInt();
        char ch = input.charAt(index);
        System.out.println("Character at index " + index + " is: " + ch);
        }
}
