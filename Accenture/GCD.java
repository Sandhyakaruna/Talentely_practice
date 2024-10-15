import java.util.*;
class GCD
{
   public static void main(String[] args)
   {
       Scanner obj = new Scanner(System.in);
       int n=obj.nextInt();
       int m= obj.nextInt();
       int g=0;
       for(int i=1;i<=n;i++)
       {
           if(n%i==0 && m%i==0)
               g=i;
       }
       System.out.println(g);
   }
}
