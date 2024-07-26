import java.util.*;
import java.util.Stack;
public class Stackkkk
{
    public static int precedence(char operator)
    {
        switch(operator)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static boolean  check(char op1,char op2)
    {
        return precedence(op1) >=precedence(op2);
    }
    public static String infixtopost(String n)
    {
        StringBuilder postfix = new StringBuilder();
        Stack <Character> stack = new Stack<>();
        for(int i=0;i<n.length();i++)
        {
            char a=n.charAt(i);
            if(Character.isLetterOrDigit(a)) {
                postfix.append(a);
            }
            else if(a== '(')
            {
                stack.push(a);
            }
            else if(a==')')
            {
                while(!stack.isEmpty() && stack.peek() != '(' && check(stack.peek(),a))
                {
                    postfix.append(stack.pop());
                }
                stack.pop();
            }else{
                while (!stack.isEmpty() && stack.peek() != '(' && check(stack.peek(),a))
                {
                    postfix.append(stack.pop());
                }
                stack.push(a);
            }
        }
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        String n=obj.nextLine();
        String result = infixtopost(n);
        System.out.println(result);
    }
}
