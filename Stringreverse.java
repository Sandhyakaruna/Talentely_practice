import java.util.Scanner;

public class ReverseStringExceptSpecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] strArray = input.toCharArray();

        int left = 0;
        int right = strArray.length - 1;

        while (left < right) {
            // Skip special characters
            if (!Character.isLetterOrDigit(strArray[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(strArray[right])) {
                right--;
            } else {
                // Swap characters
                char temp = strArray[left];
                strArray[left] = strArray[right];
                strArray[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(new String(strArray));
    }
}
