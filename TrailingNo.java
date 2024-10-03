import java.util.*;
public class TrailingNo
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(Count(num));
    }
    public static int Count(int num)
    {
         int sum=0;
         if(num<5) return 0;
         while(num>=5)
         {
             sum+=num/5;
             num/=5;
         }
         return sum;
    }
}
