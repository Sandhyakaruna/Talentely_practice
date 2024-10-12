import java.util.*;
class MaxPairProduct
{
    public static void FindMaxPair(int N,int[] arr)
    {
        int Max=32;
        int a=0,b=0;
        for(int i=0;i<N-1;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]*arr[j]==Max)
                {
                    a=arr[i];
                    b=arr[j];
                }
            }
        }
        System.out.println(a+" "+b);
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int N=obj.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=obj.nextInt();
        }
        FindMaxPair(N,arr);
    }
}
