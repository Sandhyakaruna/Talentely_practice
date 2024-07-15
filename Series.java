import java.util.*;
class Series
  {
    public static void main(String[] args)
    {
      Scanner obj= new Scanner(System.in);
      int size=obj.nextInt();
      int a=0;
      int b=0;
      for(int i=1;i<size;i++)
       {
         if(i%2==1)
         {
           System.out.print(a+" ");
           a=a+2;
         }
         if(i%2==0)
         {
           System.out.print(b+" ");
           b=a/2;
         }
       }
    }
 }
         
    
  
    
