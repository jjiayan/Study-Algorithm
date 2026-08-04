import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String p: participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for (String c: completion) {
            if (map.get(c) > 1) {
                map.replace(c, map.get(c) - 1);
            } else {
                map.remove(c);
            } 
        }
        
        answer = String.join("", map.keySet());
        return answer;
    }
}