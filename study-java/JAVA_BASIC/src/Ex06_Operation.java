
public class Ex06_Operation {

	public static void main(String[] args) {
		// 대입 연산자
		// +=, -=, *=, /=
		
		int sum = 10;
		sum += 1; // sum = sum + 1;
		sum -= 1;
		System.out.println(sum);
		
		/*
		 if(조건식) {}
		 if(조건식) {} else {}
		 if(조건식) {} else if(조건식) {} else if(조건식) ... else {}
		 
		 간단한 학점 계산기
		 학점: A+, A-, B+, B-, ... F
		 
		 판단 기준: 90점 이상이고 95점 이하이면 
		 // 90 A > 다시 판단 95 A+, 나머지 A-
		 // 80 B > 다시 판단 85 B+, 나머지 B-
		 
		 90, 80, 70, 나머지 F
		 
		 if(){
		 	//조건판단
		 } else if(){
		 }
		 */
		
		int score = 94;
		String grade = ""; // 문자열 초기화 // A+, A-, C+
		System.out.println("당신의 점수는: " + score);
		// 논리구
		if(score >= 90) {
			grade = "A";
			/*if(score >= 95) {
				grade += "A+";
			} else {
				grade = "A-";
			}*/
			grade = (score >= 95)? (grade+="+"):(grade+='-');
		} else if(score >= 80) {
			grade = "B";
			grade = (score >= 85)? (grade+="+"):(grade+='-');
		} else if(score >= 70) {
			grade = "C";
			grade = (score >= 75)? (grade+="+"):(grade+='-');
		} else {
			grade = "F";
		}

		//
		System.out.println("당신의 학점은: " + grade);
		
		// 'A' ~ 'Z'
		// for문
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
		}
		System.out.println(); // 엔터 
		for(int i = 65; i <= 90; i++) {
			System.out.println((char)i);
		}
		
		for(int i = 1; i <= 100; i++) {
			System.out.print(i + " "); // 개행이 없음 
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		
		// 입사시험 3번문제: 구구단
		// 행열개념
		// 2~9, 1~9
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				// System.out.print(i + "*" + j + "=" + i*j + "\t");
				System.out.printf("%d*%d=%d\t", i, j, i*j);
			}
			System.out.println();
		}
		
	}

}
