package ex.algorithm;


import java.util.HashMap;
import java.util.Map;


public class Ex003 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2};
		
		HashMap<Integer, Integer> cnt = new HashMap<>();
		for (int v: arr) {
			if (cnt.containsKey(v)) {
				int tmp = cnt.get(v);
				cnt.put(v, tmp+1);
			} else {
				cnt.put(v, 0);
			}
		}
		
		int maxCnt = 0;
		int result = -1;

		for(Map.Entry<Integer, Integer> m: cnt.entrySet()) {
			if (maxCnt < m.getValue()) {
				maxCnt = m.getValue();
				result = m.getKey();
			}
		}
		
		System.out.println("최빈값: " + result);

	}

}
