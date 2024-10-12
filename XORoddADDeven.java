import java.util.*;
class XORoddADDeven
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
             arr[i]=obj.nextInt();
        }
        XORandADD(N,arr);
    }
    public static void XORandADD(int N,int[] arr)
    {
        int sum=0;
        int xor=0;
        for(int i=0;i<N;i++)
        {
            if(i%2!=0)
            {
                sum +=arr[i];
            }
            if(i%2==0)
            {
                xor ^=arr[i];
            }
        }
        System.out.println(sum-xor);
    }
}
