import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        int count = 0;
        int choice;

        do {
            System.out.println("\n1.Add Student 2.View Students 3.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < 5) {
                        System.out.print("Enter name: ");
                        names[count] = sc.nextLine();
                        count++;
                    } else {
                        System.out.println("List is full!");
                    }
                    break;

                case 2:
                    System.out.println("Students:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(names[i]);
                    }
                    break;
            }

        } while (choice != 3);

        sc.close();
    }
}
