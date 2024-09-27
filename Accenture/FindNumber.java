import java.util.*;
class FindNumber
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int a = 1;
        while(a<=num)
        {
            a=a*2;
        }
        a=a/2;
        int res=(num-a)*2+1;
        System.out.print(res);
    }
} 