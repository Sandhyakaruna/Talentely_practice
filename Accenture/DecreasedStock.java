import java.util.*;
class DecreasedStock
{
   public static void main(String[] args)
   {
       Scanner obj = new Scanner(System.in);
       int noofDays =obj.nextInt();
       int[] stock=new int[noofDays];
       for(int i=0;i<noofDays;i++)
       {
           stock[i]=obj.nextInt();
       }
       System.out.println(DecreasStock(noofDays,stock));
   }
   public static int DecreasStock(int noofDays,int[] stock)
   {
       int C_negative=0;
       for(int i=0;i<noofDays;i++)
       {
           if(stock[i]<0)
           {
              C_negative+=1;
           }
       }
       return C_negative;
   }
}
