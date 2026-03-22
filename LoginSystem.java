import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.print("Enter username: ");
        String u = sc.nextLine();

        System.out.print("Enter password: ");
        String p = sc.nextLine();

        if (u.equals(username) && p.equals(password)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid credentials!");
        }

        sc.close();
    }
}
