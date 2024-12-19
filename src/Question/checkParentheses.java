package Question;

import java.util.Stack;

public class checkParentheses {

    public boolean isValid(String s) {

        Stack stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.empty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        checkParentheses cp = new checkParentheses();
        String s = "[]{}()";    //=> true
        // String s = "[]{}(}"; //=> false
        System.out.println(cp.isValid(s));
    }
}
