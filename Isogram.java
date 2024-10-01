import java.lang.*;
import java.util.*;
public class Isogram
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String str=obj.nextLine();
        System.out.println(CheckIsogram(str));
    }
    public static boolean CheckIsogram(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            for(int k = 0; k < i; k++)
            {
                if(str.charAt(k) == c)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
