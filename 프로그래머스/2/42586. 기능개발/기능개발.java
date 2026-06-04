import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> stack = new ArrayDeque<>();
        int max_day = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            int dev = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
            if (i == 0 || max_day < dev) {
                max_day = dev;
                stack.push(1);
            } else if (max_day >= dev) {
                int tmp = stack.pop();
                stack.push(tmp + 1);
            }
        }
        
        int[] answer = new int[stack.size()];
        int index = 0;
        // 맨 뒤부터 차례대로 꺼내서 배열에 채우기
        while (!stack.isEmpty()) {
            answer[index++] = stack.pollLast();
        }
        
        return answer;
    }
}

