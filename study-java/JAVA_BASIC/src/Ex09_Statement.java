
public class Ex09_Statement {

	public static void main(String[] args) {
		/*
		 제어문
		 	ㄴ 조건문: if(3가지), switch(조건)
		 	ㄴ 반복문: for(반복 횟수가 명확할 때), while(진위여부), do{} ~ while()
		 	ㄴ 분기문: break(블럭 탈출), continue(아래 구문 skip) 
		 */
		int count = 0;
		if (count < 1) System.out.println(); // 단일 if는 블럭 {} 생략함.
		if (count < 1) {
			System.out.println("true");			
		}
		
		char data='A';
		switch(data) {
			case 'A': System.out.println("문자 비교 같음");
				break;
			case 'B': System.out.println("...");
				break;
			default: System.out.println("나머지 처리");
		}
		
		// 1~100 합 구하기 
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.printf("1~100 누적합: %d \n", sum);
		
		// 1~5 합
		// for 문과 while 문 사용하지 말고 (수학적으로) 
		int n = 5;
		System.out.println(n * (n+1) / 2);	// 1~n까지의 합 = n * (n+1) / 2
		
		// 1~10 홀수의 합
		// 단, for문만 사용, 단,for문 안에 if 사용 금지
		int sum2 = 0;
		for(int i=1; i <= 10; i+=2) {
			sum2 += i;
		}
		System.out.println(sum2);
		
		// for문, if문 사용해서 1~1000 짝수의 합
		int sum3 = 0;
		for(int i=1; i <= 1000; i++) {
			if(i%2==0) sum3 += i;
		}
		System.out.println(sum3);
		
		// 구구단, 별찍기 
		// for 분기문(continue, break) 사용 
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i==j) {
					break;
				}
				System.out.printf("%s", "*");
			}
			System.out.println();
		}
		/*
		(출력결과)
		*
		**
		***
		****
		*****
		******
		*******
		********
		 
		 */
		
		//i=j일 때를 제외하고 출력
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i==j) {
					continue;
				}
				System.out.printf("%d * %d = %d", i, j, i*j);
			}
			System.out.println();
		} 
		
		// 버블 정렬 
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j < i; j++) {
				System.out.printf("%s", "*");
			}
			System.out.println();
		}
		
		// 100 부터 0까지의 값을 출력(시작값) 
		for(int i=100; i > -1; i--) {
			System.out.println(i);
		}
		
		// 피보나치 수열, swap 
		int a = 0, b = 1, c = 0;
		for(int i = 0; i < 10; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.printf("[%d] * [%d] = [%d] \t", a, b, c);
			System.out.println("  " + c);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
