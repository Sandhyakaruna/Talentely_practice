import java.util.*;
class Tables
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int m = obj.nextInt();
        int sum=0;
        for(int i=1;i<=m;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
            sum+=n*i;
        }
        System.out.println(sum);
    }
}
