import java.util.*;

class rat.java
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int rat=obj.nextInt();
    int size = obj.nextInt();
    int Unit=obj.nextInt();
    int arr[]=new int[size];
    int count=0,sum=0;
    for(int i=0;i<size;i++)
    {
        arr[i]=obj.nextInt();
    }
    int food=rat*Unit;
    for(int i=0;i<size;i++)
    {
        if(sum<=food)
        {
            sum+=arr[i];
            count=count+1;
        }
    }
    System.out.print(count);
  }

}
