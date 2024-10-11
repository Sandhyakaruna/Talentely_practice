import java.util.*;
class Clock
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        int time=n*m;
        System.out.println(TheCorrectTime(time));
    }
    public static int TheCorrectTime(int time)
    {
        if(time<=0||time>=24)
        {
            return -1;
        }
        if(time>0&&time<24)
        {
            time =24-time;
        }
        return time;
    }
}
