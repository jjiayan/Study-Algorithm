import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
		// 반복문 (while, do-while)
		int i = 10;
		while(i >= 10) {
			// 반드시 증가감을 명시해야 함. true, false
			// 아님 무한루프 빠짐. 
			--i;
			System.out.println(i);
		}
		
		// while 1~100 합
		int j = 1;
		int sum = 0;
		while(j <= 100) {
			sum += j;
			j++;
		}
		System.out.println(sum);
		
		// while(true){} 무한루프 
		int k = 2;
		int p = 1;
		while(k <= 9) {
			p = 1;
			while(p <= 5) {
				System.out.printf("%d*%d=%d\t", k, p, k*p);
				p++;
			}
			System.out.println();
			k++;
			
		}
		
		// while(true) {}
		// for(;;) {}
		// do-while() 일단 한번 강제적으로 실행. 조건을 보고 판단. 
		/*
		메뉴 구성
		점심 메뉴 선택
		1. 짜장
		2. 짬뽕
		 */
		
		Scanner sc = new Scanner(System.in);
		int inputData = 0;
		do {
			System.out.println("숫자 입력해(0~9)");
			inputData = Integer.parseInt(sc.nextLine());
		} while(inputData >= 10);
		
		//조건식이 true do 문을 계속 실행
		//조건식이 false do 문을 탈출  
		System.out.println("당신이 입력한 숫자는: " + inputData);
		
		//
		
	}

}
