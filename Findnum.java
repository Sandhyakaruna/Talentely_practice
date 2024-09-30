import java.util.*;
public class Findnum
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int diff=obj.nextInt();
        int res=0;
        int n=obj.nextInt();
        int[]arr=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        res=findCount(num,diff,n,arr);
        System.out.println(res);
    }
    public static int findCount(int num,int diff,int n,int arr[]){
        int count=0;
        for(int i=0;i<n;i++){
            if(Math.abs(arr[i]-num)<=diff){
                count++;
            }
        }
        if(count==0) return -1;
        else return count;
    }
}
