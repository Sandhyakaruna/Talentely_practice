import java.util.*;
class Max_usingFunction
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int Size = obj.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < Size; i++) {
            arr[i] = obj.nextInt();
        }
        int[] res= Greater(arr,Size);
        System.out.println("The max element "+res[0]+"\nIndex "+res[1]);
    }
    public static int[] Greater(int[] arr,int Size)
    {
         int max=arr[0];
         int index =0;
        for(int i=1;i<Size;i++)
        {
            if(arr[i]>max) {
                max = arr[i];
                index = i;
            }
        }
        return new int[]{max,index};
    }
}
