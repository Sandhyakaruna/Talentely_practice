import java.util.Scanner;
public class MonotonicArr{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        if (isMonotonic(arr)) {
            System.out.println("Monotonic");
        } else {
            System.out.println("Not Monotonic");
        }
        scanner.close();
    }
    public static boolean isMonotonic(int[] arr) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                decreasing = false;
            }
            if (arr[i] < arr[i - 1]) {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
}
