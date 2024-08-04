import java.util.Stack;

public class InfixToPrefix {

    // Function to check if the character is an operator
    static boolean isOperator(char c) {
        return (!(Character.isLetterOrDigit(c)));
    }

    // Function to check precedence of operators
    static int getPrecedence(char c) {
        switch (c) {
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

    // Function to reverse a string
    static String reverse(String exp) {
        StringBuilder rev = new StringBuilder(exp).reverse();
        return rev.toString();
    }

    // Function to convert infix to postfix
    static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If the character is an operand, add it to the output
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If the character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the character is ')', pop and output from the stack until '(' is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            // An operator is encountered
            else {
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Function to convert infix to prefix
    static String infixToPrefix(String infix) {
        // Reverse the infix expression
        String reversedInfix = reverse(infix);

        // Replace '(' with ')' and vice versa
        reversedInfix = reversedInfix.replace('(', 'X');
        reversedInfix = reversedInfix.replace(')', '(');
        reversedInfix = reversedInfix.replace('X', ')');

        // Get postfix of the modified expression
        String postfix = infixToPostfix(reversedInfix);

        // Reverse the postfix to get the prefix expression
        String prefix = reverse(postfix);

        return prefix;
    }

    public static void main(String[] args) {
        String infix = "(A-B/C)*(A/K-L)";
        System.out.println("Infix Expression: " + infix);
        System.out.println("Prefix Expression: " + infixToPrefix(infix));
    }
}
