import java.util.Scanner;
public class calculate {
    public static void main(String[] args) {
        //6.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        if(num1 + num2 == num3) {
            System.out.println("The sum of " + num1 + " and " + num2 + " is equal to " + num3);
            System.out.println("true");
        } else {
            System.out.println("The sum of " + num1 + " and " + num2 + " is not equal to " + num3);
            System.out.println("false");
        }
    }
}

