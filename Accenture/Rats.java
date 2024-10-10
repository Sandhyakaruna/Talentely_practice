import java.util.*;
class Rats
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int rat=obj.nextInt();
        int unit=obj.nextInt();
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println(TotalAmtFood(rat,unit,n,arr));
    }
    public static int TotalAmtFood(int rat,int unit,int n,int[] arr)
    {
        int foodreq=rat*unit;
        int food=0;
        int count=0;
        if(arr==null)
        {
            return -1;
        }
        for(int i=0;i<n;i++)
        {
            food+=arr[i];
              count+=1;
            if(food>=foodreq)
            {
                return count;
            }
        }
        return 0;
    }

}
