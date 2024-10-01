import java.util.*;
public class Sum_Div
{
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        int m =obj.nextInt();
        int n = obj.nextInt();
        System.out.println(Calculator(m,n));
    }
    public static int Calculator(int m,int n)
    {
        int result=0;
        for(int i=12;i<=50;i++)
        {
            if(i%3==0&&i%5==0)
            {
                result=result+i;
            }
        }
        return result;
    }
}
