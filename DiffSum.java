import java.util.*;
public class DiffSum
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int m = obj.nextInt();
        int n_sum = 0;
        int m_sum = 0;
        for (int i = 1; i <=m; i++) {
            if (i % n == 0) {
                n_sum += i;
            } else {
                m_sum += i;
            }
        }

        System.out.println(Math.abs(m_sum-n_sum));
    }
}
