import java.util.Scanner;

public class Magicnumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (isMagicNumber(num)) {
            System.out.println(num + " is a magic number.");
        } else {
            System.out.println(num + " is not a magic number.");
        }
    }
    public static boolean isMagicNumber(int num) {
        int sum = sumOfDigits(num);
        int reverseSum = reverseNumber(sum);
        return sum * reverseSum == num;
    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return reverse;
    }
}
