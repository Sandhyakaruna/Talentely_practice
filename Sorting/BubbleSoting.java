import java.util.*;
public class BubbleSoting 
{
 public static void main(String[] args)
 {
    Scanner obj = new Scanner(System.in);
    int size = obj.nextInt();
    int[] arr = new int[size];
    int i;
    for(i=0;i<size;i++)
    
        arr[i]=obj.nextInt();
        int temp;
    
        for(int count =0;count<=size-2;count+=1)
        {
            for(i=0;i<size-1-count;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for(int i : arr)
        System.out.print(i+" ");
 }
}
