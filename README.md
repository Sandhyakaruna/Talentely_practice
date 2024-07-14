# DailyTests
hello friends, I've showcased all the programs that I've solved during my daily assessment test conducted by Talentely in my college that imporoved my technical and problem solving skills.

Here is a code that counts the frequency of each digit (0-9) in a given integer and displays the results

    import java.util.Scanner;
    class DigitFrequency
    {
  
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        String numStr = String.valueOf(num);

        int[] frequency = new int[10];

        for (char c : numStr.toCharArray()) {
            if (Character.isDigit(c)) {
                frequency[c - '0']++;
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            System.out.println(i + " occurs " + frequency[i] + " times");
        }
    }
    }
