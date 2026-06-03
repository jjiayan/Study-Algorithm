import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            String tmp = s.substring(i, len) + s.substring(0, i);
            
            if (isTrue(tmp)) {
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isTrue(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // 열린 괄호 추가 
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else { // 닫힌 괄호일 경우
                // 스택 비어있을 경우
                if (stack.isEmpty()) {
                    return false;
                }
                
                // 스택 top이 짝이 아닐 경우 
                char top = stack.peek();
                if ((c == ']' && top == '[') ||
                   (c == '}' && top == '{') ||
                   (c == ')' && top == '(')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}