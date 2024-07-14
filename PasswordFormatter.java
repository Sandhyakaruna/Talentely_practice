import java.util.Scanner;

public class PasswordFormatter {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        // Convert the input string to a password format (using asterisks)
        String passwordFormat = convertToPasswordFormat(input);
        
        // Print the password format string
        System.out.println(passwordFormat);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to convert a string to password format
    public static String convertToPasswordFormat(String input) {
        // Create a StringBuilder to build the password format string
        StringBuilder passwordBuilder = new StringBuilder();
        
        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // Append an asterisk to the password format string
            passwordBuilder.append('*');
        }
        
        // Return the password format string
        return passwordBuilder.toString();
    }
}
