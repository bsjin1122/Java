package etc;

import java.util.Stack;

public class BracketTurn {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("[](){}");
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if(isBracket(sb.toString())){
                count++;
            }
            char firstChar = sb.charAt(0);
            sb.delete(0,1);
            sb.append(firstChar);
        }
        System.out.println(count);

    }
    public static boolean isBracket(String str){
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false; // 닫힌 괄호가 왔는데 스택이 비어있으면 유효하지 않은 문자열
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false; // 닫힌 괄호와 스택의 top 괄호가 짝이 맞지 않으면 유효하지 않은 문자열
                }
            }
        }
        return stack.isEmpty();
    }
}
