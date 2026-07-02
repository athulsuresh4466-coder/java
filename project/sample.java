import java.util.Scanner; // Import the Scanner class to read input

public class sample {
    public static void main(String[] args) {
        // Create a Scanner object to read from the standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for text input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a full line of text

        // Prompt the user for a number input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer

        // Print the final output to the console
        System.out.println("\n--- Hello " + name + "! ---");
        System.out.println("You are " + age + " years old.");

        // Close the scanner resource to prevent memory leaks
        scanner.close();
    }
}
