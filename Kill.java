import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int k=near(n);
        int v=n-k;
        System.out.print(2*v+1);
    }
    public static int near(int n){
        int i=1;
        while(i<=n){
            i*=2;
        }
        i/=2;
        return i;
    }
}
