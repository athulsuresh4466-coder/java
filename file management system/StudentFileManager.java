import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileManager {

    private static final String FILE_NAME = "student.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Student Marks: ");
        String marks = scanner.nextLine();
        
        writeStudentToFile(id, name, marks);
        readStudentFromFile();
        
        scanner.close();
    }

    public static void writeStudentToFile(String id, String name, String marks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write("ID: " + id);
            writer.newLine();
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Marks: " + marks);
            writer.newLine();
            System.out.println("\nSuccessfully saved student details to " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static void readStudentFromFile() {
        System.out.println("\n--- Fetching Student Details From File ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + FILE_NAME + "' was not found.");
        } catch (IOException e) {
            System.err.println("Error: An issue occurred while reading the file: " + e.getMessage());
        }
    }
}
