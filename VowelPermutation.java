import java.util.*;
class VowelPermutation
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String S=obj.next();
        int result=FindingVowel(S);
        System.out.println(result);
    }
    public static int FindingVowel(String S)
    {
        List<Character> vowel=new ArrayList<>();
        List<Character> consonent=new ArrayList<>();
        for(char c:S.toCharArray())
        {
            if(isVowel(c))
            {
                vowel.add(c);
            }else if(Character.isLetter(c))
            {
                consonent.add(c);
            }
        }
        if(consonent.size()==0)
        {
            return 0;
        }
        int vowelcount=0;
        int permutation=factorial(vowelcount);

        return permutation;
    }

    public static int factorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static boolean isVowel(char c)
    {

        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
