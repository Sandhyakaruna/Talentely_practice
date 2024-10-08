import java.util.*;
class IpAddressValidation
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        String[] arr = s.split("\\.");
        System.out.println(Validation(arr));
    }
    public static boolean Validation(String arr[]){
        if(arr.length!=4) return false;
        for (String s : arr) {
            int n = Integer.parseInt(s);
            if ((n < 0) || (n > 255)) {
                return false;
            }
        }
        return true;
    }
}
