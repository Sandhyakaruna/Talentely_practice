import java.util.Scanner;

public class CapitalLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String input = scanner.nextLine();
        
        // Initialize a StringBuilder to collect capital letters
        StringBuilder capitals = new StringBuilder();
        
        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                capitals.append(ch);
            }
        }  
        // Print the collected capital letters
        System.out.println(capitals.toString());
        // Close the scanner
        scanner.close();
    }
}
