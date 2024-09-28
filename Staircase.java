import java.util.*;
class Staircase
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int j=0;
        int h=0;
        int ways=1;
        for(int i=0;i<n;i++)
        {
            j=ways;
            ways=h+ways;
            h=j;
        }
        System.out.print(ways);
    }
}
