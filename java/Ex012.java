package ex.algorithm;

public class Ex012 {

	public static void main(String[] args) {
		/*
		입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력하시오
		4
		
		정답:  1  5  9 13 
		      2  6 10 14
		      3  7 11 15
		      4  8 12 16
		Tag
		중첩 반복문 (for 혹은 while), 배열
		 */
		int n = 4;
		// method: 2중 for문 
		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", (i + 4 * j));
			}
			System.out.println();	
		}
	}

	
}