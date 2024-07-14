import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }

        if (digits.length() > 0) {
            System.out.println(digits.toString());
        } else {
            System.out.println("0");
        }
    }
}
