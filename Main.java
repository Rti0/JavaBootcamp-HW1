import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        {
            //1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.
            System.out.println("Enter first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter second number: ");
            int num2 = input.nextInt();
            // Addition
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
            // Multiplication
            int multiply = num1 * num2;
            System.out.println("Multiplication: " + multiply);
            // Subtraction
            int subtract = num1 - num2;
            System.out.println("Subtraction: " + subtract);

            // Division
            int divide = (int) num1 / num2;
            System.out.println("Division: " + divide);
            // Remainder
            int remainder = num1 % num2;
            System.out.println("Remainder: " + remainder);
            input.close();
        }
    }
}