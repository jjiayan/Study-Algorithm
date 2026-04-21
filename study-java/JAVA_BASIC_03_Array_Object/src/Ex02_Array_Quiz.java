
public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		// 국문과 학생들의 기말고사 시험점수 입니다.
		int[] score = new int[] {79, 88, 97, 54, 56, 95};
		int max = score[0]; // 79
		int min = score[0]; // 79
		
		/*
		 1.
		 제어문을 통해서 max라는 변수에 시험점수 중에서 가장 큰 최댓값을 담고 
		 min 변수에는 시험점수 중에서 가장 작은 최솟값을 담으세요.
		 
		 - 결과: max: 97, min: 54
		 - 조건: for문을 한번만 사용해서 max와 min값을 다 구하라.
		 */
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.printf("1번 문제: max: %d, min: %d", max, min);
		System.out.println();
		/*
		 2. 10개의 방의 값을 1~10까지로 초기화시키고 출력하세요.
		 */
		System.out.printf("2번 문제: numbers ");
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = i + 1;
			System.out.printf("%d\t", numbers[i]);
		}
		System.out.println();

		
		/*
		 3. 어느 학생의 기말고사 시험점수(5과목)
		 1) 총 과목의 수
		 2) 과목의 합 
		 3) 과목의 평균 
		 2번, 3번 하나의 for문으로 해결하라.
		 */
		int[] jumsu = {100, 55, 90, 60, 78};
		int sum = 0;
		float avg = 0f;
		System.out.printf("3번 문제: (1) 총 과목의 수: %d\t", jumsu.length);
		
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		avg = (float)sum / (float)jumsu.length;
		System.out.printf("(2) 과목의 합: %d \t", sum);
		System.out.printf("(3) 과목의 평균: %f", avg);
		
	}

}
