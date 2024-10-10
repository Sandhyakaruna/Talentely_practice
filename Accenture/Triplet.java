import java.util.*;
class Triplet
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int key=obj.nextInt();
        if(!Findtripletnum(n,arr,key))
        {
            System.out.println(-1);
        }

    }
    public static boolean Findtripletnum(int n,int[] arr,int key) {

        for (int i = 0; i < n - 2; i++) {
            for (int j = 1; j < n - 1; j++) {
                for (int k = 1; k < n; k++) {

                    if (arr[i] + arr[j] + arr[k] == key) {

                        System.out.println(arr[i] +" "+ arr[j] +" "+ arr[k]);
                        return true;
                    }
                }

            }

        }
        return false;
    }
}
