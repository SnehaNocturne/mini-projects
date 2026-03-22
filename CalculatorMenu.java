import java.util.Scanner;

public class CalculatorMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add 2.Subtract 3.Multiply 4.Divide 5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                switch (choice) {
                    case 1: System.out.println("Result: " + (a + b)); break;
                    case 2: System.out.println("Result: " + (a - b)); break;
                    case 3: System.out.println("Result: " + (a * b)); break;
                    case 4: System.out.println("Result: " + (a / b)); break;
                }
            }

        } while (choice != 5);

        sc.close();
    }
}
