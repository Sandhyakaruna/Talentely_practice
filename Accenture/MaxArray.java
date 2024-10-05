import java.util.*;
class MaxArray
{
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
         int Size=obj.nextInt();
         int[] arr=new int[Size];
         for(int i=0;i<Size;i++)
         {
             arr[i]=obj.nextInt();
         }
         int max=arr[0];
         int index =0;
        for(int i=1;i<Size;i++)
        {
            if(arr[i]>max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}
