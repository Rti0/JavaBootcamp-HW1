import java.util.Scanner;
public class greatest {
    public static void main(String[] args) {
       // 7.Take three numbers from the user and print the greatest number.
        Scanner input = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Input the 2st number: ");
        int num2 = input.nextInt();
        System.out.print("Input the 3st number: ");
        int num3 = input.nextInt();
        int max = num1;
        if(num2 > max) {
            max = num2;
        }
        if(num3 > max) {
            max = num3;
        }
        System.out.println("The greatest number is: " + max);
    }
}
