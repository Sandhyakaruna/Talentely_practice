import java.util.*;
class Palindrome{
    public static void main(String args[]){
  
    System.out.println(isPalin("abaaab"));
    
}

public static boolean isPalin(String s){
    int n=s.length();
    for(int i=0;i<n;i++){
         s=s.substring(1,n)+s.charAt(0);
         System.out.println(s);
        StringBuilder s1=new StringBuilder(s);
        if(s.equals(s1.reverse()))
            return true;
    }
    return false;

}
}
