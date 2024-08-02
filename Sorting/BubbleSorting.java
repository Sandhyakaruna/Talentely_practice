import java.util.*;
public class BubbleSorting
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        int pass,itr;
        for(int i=0;i<size;i++)

            arr[i]=obj.nextInt();
        int temp;

        for(pass =0;pass<=size-2;pass+=1)
        {    
            for(itr=0;itr<size-1-pass;itr++)
            {
                if(arr[itr]>arr[itr+1])
                {
                    temp = arr[itr];
                    arr[itr]=arr[itr+1];
                    arr[itr+1]=temp;
                }
            }
        }
        for(int i : arr)
            System.out.print(i+" ");
    }
}
