import java.util.Scanner;

public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
		/*
		간단한 사칙 연산기 (+ , - , * , /)
		입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환)
		목적 : Integer.parseInt() ,  ** 구글 java equals() 활용  문자열의 비교** 
		hint)
		- if 조건값이 boolean
		- switch 문은 정수형(byte, short, int)와 문자(char), 문자열(String) 조건식 사용
		
		
		화면
		>입력값:숫자
		>입력값(기호): +
		>입력값:숫자 
		>연산결과 :200
		-------------
		>입력값:100
		>입력값(기호): -
		>입력값:100
		>연산결과 :0 

		 */ 
		// (내 풀이)
//		Scanner sc = new Scanner(System.in);
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.printf(">입력값: %d", num1);
//		System.out.println();
//		
//		String opt = sc.nextLine();
//		System.out.printf(">입력값(기호): %s", opt);
//		System.out.println();
//		
//		int num2 = Integer.parseInt(sc.nextLine());
//		System.out.printf(">입력값: %d", num2);
//		System.out.println();
//		
//		switch(opt){
//			case "+" : System.out.println(">연산결과: " + (num1+num2));
//				break;
//			case "-" : System.out.println(">연산결과: " + (num1-num2));
//				break;
//			case "*" : System.out.println(">연산결과: " + (num1*num2));
//				break;
//			default: System.out.println(">연산결과: " + (num1/num2));
//		
//		}
		
		// **** 중요!
		// equals 알아보기
		/*
		 == 연산자는 값을 비교

		 */
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println(str1 == str2); // true 
		// 같은 값인지를 판단
		// str1과 str2는 같은 메모리를 참조 = 주소 동일 -> 값도 같고 주소도 같음 .
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3 == str4); // false 
		// str3와 str4는 다른 메모리를 참조 
		// 문자열 비교는 equals를 써라 -> 주소값을 비교하지 말고 그 안의 값을 비교해라. 
		System.out.println(str3.equals(str4)); // true 
		if (str3.equals(str4)) {
			
		}
		
		
		
		
		

	}

}
