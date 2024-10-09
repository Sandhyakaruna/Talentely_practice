import java.util.*;
class Velocity
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int H=obj.nextInt();
        int V=obj.nextInt();
        int Vn=obj.nextInt();
        int En =V/Vn;
        System.out.println(RebounceVelocity(H,V,Vn,En));
    }
    public static int RebounceVelocity(int H,int V,int Vn,int En)
    {
        H = H*(En*En);
        return H;
    }
}
