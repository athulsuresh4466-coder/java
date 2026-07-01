import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double bookPrice;
    static String libraryName = "Central Library";

    void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Price: " + bookPrice);
        System.out.println("Library Name: " + libraryName);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int numberOfBooks = scanner.nextInt();

        Book[] books = new Book[numberOfBooks];

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            books[i] = new Book();

            System.out.print("Book ID: ");
            books[i].bookId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Book Name: ");
            books[i].bookName = scanner.nextLine();

            System.out.print("Book Price: ");
            books[i].bookPrice = scanner.nextDouble();
        }

        System.out.println("\n--- Displaying Book Details ---");
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Details of Book " + (i + 1) + ":");
            books[i].displayDetails();
        }

        scanner.close();
    }
}
