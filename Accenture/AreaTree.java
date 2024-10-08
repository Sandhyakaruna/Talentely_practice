import java.util.*;
class AreaTree
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int r=obj.nextInt();
        float area=3.14f*r*r;
        System.out.println((int)Math.ceil(area));
    }
}
