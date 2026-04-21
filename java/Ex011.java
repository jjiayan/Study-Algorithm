package ex.algorithm;

public class Ex011 {

	public static void main(String[] args) {
		/*
		입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 
		숫자 사각형을 출력하시오
		4
		
		정답:  1  2  3  4 
	           8  7  6  5
	           9  10 11 12
	          16 15 14 13
		Tag
		중첩 반복문 (for 혹은 while), 조건문(if), 배열
		 */
		int n = 4;
		// method1: 2중 for문 
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j < n + 1; j++) {
					System.out.printf("%4d", (j + n * i));
				}
			} else {
				for (int j = n; j > 0; j--) {
					System.out.printf("%4d", (j + n * i));
				}
			}
			
			System.out.println();	
		}
	}

}
