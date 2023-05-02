import java.util.Scanner;
public class chickrole {
  //  5.Write a program that checks the role of the user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter user role (admin/user): ");
        String role = input.nextLine();
        if(role.equalsIgnoreCase("admin")) {
            System.out.println("welcome admin");
        } else if(role.equalsIgnoreCase("superuser")) {
            System.out.println("welcome superuser.");
        } else {             System.out.println("welcome user");
        }
    }
}
