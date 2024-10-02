import java.util.*;
class Abs_DIFF
{
    public static void main(String[] args)
    {
       Scanner obj= new Scanner(System.in);
       int num = obj.nextInt();
       int[] number=new int[num];
       for(int i=0;i<num;i++)
       {
           number[i]=obj.nextInt();
       }
       System.out.print(findingsum(number,num));
    }

    public static int findingsum(int[] number,int num)
    {
        Arrays.sort(number);
        int sum=0;
        sum = Math.abs((number[1]-number[0])+(number[num-1]-number[num-2]));
        int abs1,abs2;
        for(int i=1;i<num-1;i++)
        {
            abs1=number[i]-number[i-1];
            abs2 =number[i+1]-number[i];
            sum += Math.abs(Math.min(abs1,abs2));

        }
        return sum;
    }

}
