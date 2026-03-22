import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[10];
        boolean[] issued = new boolean[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < 10) {
                        System.out.print("Enter book name: ");
                        books[count] = sc.nextLine();
                        issued[count] = false;
                        count++;
                        System.out.println("Book added successfully!");
                    } else {
                        System.out.println("Library is full!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Book List ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + books[i] + 
                            (issued[i] ? " (Issued)" : " (Available)"));
                    }
                    break;

                case 3:
                    System.out.print("Enter book number to issue: ");
                    int issueIndex = sc.nextInt() - 1;

                    if (issueIndex >= 0 && issueIndex < count) {
                        if (!issued[issueIndex]) {
                            issued[issueIndex] = true;
                            System.out.println("Book issued successfully!");
                        } else {
                            System.out.println("Book already issued!");
                        }
                    } else {
                        System.out.println("Invalid book number!");
                    }
                    break;

                case 4:
                    System.out.print("Enter book number to return: ");
                    int returnIndex = sc.nextInt() - 1;

                    if (returnIndex >= 0 && returnIndex < count) {
                        if (issued[returnIndex]) {
                            issued[returnIndex] = false;
                            System.out.println("Book returned successfully!");
                        } else {
                            System.out.println("Book was not issued!");
                        }
                    } else {
                        System.out.println("Invalid book number!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
