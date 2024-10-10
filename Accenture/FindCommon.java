import java.util.*;
class FindCommon
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int s1=obj.nextInt();
        int s2=obj.nextInt();
        int s3=obj.nextInt();
        CommonDigit(s1,s2,s3);
    }
    public static void CommonDigit(int s1,int s2,int s3)
    {
        String str1=Integer.toString(s1);
        String str2=Integer.toString(s2);
        String str3=Integer.toString(s3);
        int flag=0;
        for(int i=0;i<str1.length();i++) {
            for (int j = 0; j < str2.length(); j++) {
                for (int k = 0; k < str3.length(); k++) {
                    char ch1 = str1.charAt(i);
                    char ch2 = str2.charAt(j);
                    char ch3 = str3.charAt(k);
                    if (ch1 == ch2 && ch2 == ch3 && ch3 == ch1) {
                        System.out.println(ch1);
                        flag=1;
                    }

                }
            }
        }
        if(flag!=1)
        {
            System.out.println(-1);
        }
    }
}
