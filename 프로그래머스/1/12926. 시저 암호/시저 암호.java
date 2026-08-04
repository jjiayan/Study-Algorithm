import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (char c: s.toCharArray()) {
            int tmp = (int) c;
            if (tmp >= 97) {
                sb.append((char) ((tmp + n - 97) % 26 + 97));
            } else if (tmp >= 65) {
                sb.append((char) ((tmp + n - 65) % 26 + 65));
            } else {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}