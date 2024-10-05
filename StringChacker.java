import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class StringChecker
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String str=obj.next();
        Pattern p=Pattern.compile("sandhya");
        Matcher m=p.matcher(str);
        while (m.find())
        {
            System.out.print(m.start()+m.group());
        }
    }
}
