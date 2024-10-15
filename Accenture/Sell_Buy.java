import java.util.*;
public class Sell_Buy
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int app=obj.nextInt();
        int mang=obj.nextInt();
        int rs=obj.nextInt();
        int sel =0;
        int buy=0;
        if(app>=mang)
        {
            sel=app-mang;
            rs=rs-sel;
            System.out.print("Apple price is "+rs);
        }
        else if(app<=mang)
        {
            sel =mang-app;
            buy =sel-buy;
            System.out.print("Mang price is "+buy);
        }
    }
}
