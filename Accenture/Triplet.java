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
        System.out.println(Findtripletnum(n,arr,key));

    }
    public static int Findtripletnum(int n,int[] arr,int key) {
        int flag = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = i+1; k < n; k++) {

                    if (arr[i] + arr[j] + arr[k] == key) {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        flag = 1;

                    }
                }
            }
        }
        if (flag == 0) {
            System.out.println("Triplet Not found");
        }
        return flag;
    }
}
