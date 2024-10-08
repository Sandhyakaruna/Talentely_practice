import java.util.*;
public class Replace0
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value: ");

        int input1 = scanner.nextInt();

        int stabilizedValue = stabilizeSystem(input1);

        System.out.println("Stabilized value: " + stabilizedValue);
    }

    public static int stabilizeSystem(int number)
    {
        String numberStr = Integer.toString(number);
        {
            numberStr = numberStr.replace("0", "5");
        }
        return Integer.parseInt(numberStr);
    }
}
