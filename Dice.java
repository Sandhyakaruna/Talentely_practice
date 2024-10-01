import java.util.*;
public class Dice
{
   public static void main(String[] args)
   {
       Scanner obj = new Scanner(System.in);
       int num=obj.nextInt();
       System.out.println(Sum(num));
   }
   public static int Sum(int num)
   {
       int count=0;
       for(int i=0;i<=6;i++)
       {
           if(num-i<=6)
           {
               System.out.println(num-i+" "+i);
               count=count+1;
           }
       }
       return count;
   }
}
