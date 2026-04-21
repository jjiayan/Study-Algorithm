//import java.lang.Math;
//import java.lang.*;


public class Ex05_Operation {

	public static void main(String[] args) {
		// 연산자 (산술, 논리, 관계)
		int result = 100/100;
		System.out.println("result:" + result);
		
		result = 13/2; // 몫 
		System.out.println("result:" + result);
		
		// 나머지 구하는 연산자 : %
		result = 13%2;
		System.out.println("result:" + result);
		
		// 증가, 감소 (증가감 연산자: ++ 1씩 증가, -- 1씩 감소)
		int i = 10;
		++i; // 전치증가 
		System.out.println("i:" + i);
		i++; // 후치증가 
		System.out.println("i:" + i);
		// 증가감 연산자가 다른 연산과 결합되지 않으면 의미가 없다(전치, 후치)
		
		// Today's Point
		int i2 = 5;
		int j2 = 4;
		
		int result2 = i2 + ++j2;
		System.out.println("result2:" + result2 + " j2: " + j2);
		// result2: 10 j2: 5
		result2 = i2 + j2++;
		System.out.println("result2:" + result2 + " j2: " + j2);
		// j2 는 6이 되고, result2에 변화는 없음
		
		byte b = 100;
		byte b2 = 1;
		// *** 자바의 정수 연산의 기본은 int 
		// int + int
		// byte b3 = (byte)(b + b2); // 손실 발생 가능성
		int b3 = b + b2; // byte + byte > int + int > 결과 int 
		
		/*
		 Today's Point 
		 1. 정수 연산은 [int]타입으로 변환 후 처리
		 ex) byte + short >> 컴파일러 >> int + int
		 ex) char + char >> 컴파일러 >> int + int
		 정수의 연산에서 int 보다 작은 타입들은 내부적으로 int로 바꿔 처리함.
		 예외) 정수에서 long은 예외적으로 빠짐. 나머지 byte, char, short >> int로 변환
		 
		 ex) char + int >> int 
		 ex) int + int >> int
		 ex) int + long >> long 큰 타입 따라 감
		 
		 정수 + 실수 >> 타입의 크기 상관없이 실수 따라감. - 실수 표현되는 범위가 더 큼
		 
		 */
	long lo = 10000000000L;
	float fo = 1.2f;
	
	//long result3 = (long)(lo + fo);
	float result3 = lo + fo; //해
	System.out.println(result3);
	
	// 변수 > 데이터타(값타입, 참조타입) > 연산자(산술, 논리, 관계) > 제어문(if, for)
	// 제어문 
	int sum=0;
	for(int j = 0; j <= 100; j++) {
		// sum = sum + j;
		sum += j;
	}
	System.out.println(sum);
	
	// 짝수의 합 
	for(int j=1; j <= 100; j++) {
		if(j % 2 == 0) {
			sum += j;
		}
	}
	
	// == : 값을 비교하는 연산
	if(10 == 10.0f) { // == 타입을 비교하는 것이 아니라 값을 비
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	// 2025.8.21
	// != 부정연산자
	if('A' != 65) {
		// 같지 않으면
		System.out.println("같지 않아: true");
	}else {
		// 같다면
		System.out.println("같아:false");
	}
	
	// Today's Point
	// 연산자 중에서 제어문 역할(조건, 반복)
	// 삼항 연산자
	int p = 10;
	int k = -10;
	// (조건)? True일 경우 결과: False일 경우 결
	int result5 = (p == k)? p : k;
	System.out.println("result5:" + result5);
	
	// if문으로 바꿔보기
	int result6 = 0;
	if(p==k) {
		result6 = p;
	} else {
		result6 = k;
	}
	
	/*
	 진리표(논리연산)
	 0: 거짓(false)
	 1: 참(true)
	 
	 OR연산, AND연산
	 DB 쿼리
	 SQL 자연어 ...
	 select * from emp where job='IT' and sal > 3000 -> 조건 둘다 충족되어야 
	 select * from emp where job='IT' or sal > 3000 -> 조건 둘 중 하나만 충족되어도
	 
	      AND   OR
	 0 0   0    0
	 0 1   0    1
	 1 0   0 	1
	 1 1   0	1
	 
	 연산자 비트 연산 ( | or연산, & and연산)
	  */
	int x = 3;
	int y = 5;
	
	// 비트연산(십진수 >> 이진수로 바꾸어 연산 or, and 진리표 기준)
	System.out.println("x | y : OR연산 " + (x | y));
	/*
	256 128 64 32 16 8 4 2 1
	                 0 0 1 1 >> 3
	                 0 1 0 1 >> 5
	                 0 1 1 1 >> 비트 OR 연산 > 4+2+1 = 7
	                 0 0 0 1 >> 비트 AND 연산 > 1
	 */
	System.out.println("x & y : AND연산 " + (x & y));
	// 비트 연산 -> 영상처리, 판독 분야에서 주로 사용. 웹개발자는 사실 실무에서 쓸 일 없음
	
	// Today's Point
	// && : and 연산
	// || : or 연산
	// if (10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) {A} else {B} 거짓 조건 
	// if (10 > 0 || -1 > 1 || 100 > 2 || 1 > -1) {A} else {B}
	
	// switch 
	int data = 90;
	switch(data) {
		case 100 : System.out.println("100입니다.");
		case 90 : System.out.println("90입니다.");
		case 80 : System.out.println("80입니다.");
		default: System.out.println("일치하는 값이 없어요.");
	}
	// break 없는 switch -> 만족하는 조건부터 모든 값을 출력
	
	switch(data) {
		case 100 : System.out.println("100입니다.");
			break;
		case 90 : System.out.println("90입니다.");
			break;
		case 80 : System.out.println("80입니다.");
			break;
		default: System.out.println("일치하는 값이 없어요.");
	}
	
	// 난수(랜던값, 임의의 추출값)
	// GPT, 구글검색도 가능하지만, 
	// API 문서(오라클 배포: https://docs.oracle.com/javase/8/docs/api/)를 봐야
	/*
	 API 문서
	 패키지 기준으로 정렬(폴더별로 사용하는 것들을 모아서)
	 
	 java.lang.Math 수학적인 작업하는 함수가 있음 
	 
	 import java.lang.Math;	권장
	 import java.lang.*; 	비추천, default opened
	 
	 Math 클래스 
	 public static double random()
	 double greater than or equal to 0.0 and less than 1.0.
	 
	 0.0 <= random < 1.0
	 
	 */
	System.out.println("Math.random(): " + Math.random());
	System.out.println("Math.random() * 10: " + (Math.random() * 10) ); // 0~ 9
	System.out.println((int)(Math.random() * 10)+1 ); // 1~10 
	
	/*
	   금요일 퀴즈 	  
	   우리는 백화점 경품 시스템을 만들려고 한다
	   경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
	   경품 추첨시 1000 점수가 나오면
	   경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
	   경품 추첨시 900 점수가 나오면
	   경품으로  NoteBook , 냉장고 , 한우세트 , 휴지
	   경품 추첨시 800 점수가 나오면
	   경품으로  냉장고 , 한우세트 , 휴지
	   경품 추첨시 700 점수가 나오면
	   경품으로  한우세트 , 휴지
	   경품 추첨시 600 점수가 나오면
	   경품으로  휴지
	   그외 점수는 100 ~ 500 까지는 칫솔 
	   경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
	   사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
	   프로그램을 한번 실행하면 그 때 랜덤값이 나오고 그 랜덤값에 의해서 경품을 출력하면 되요
	 */
	int jumsu = ((int)(Math.random()* 10) + 1)*100;
	String tmp = "";
	tmp += "고객니므이 점수는: " + jumsu + "이고, 상품은: ";
	switch(jumsu) {
	case 1000 : tmp+="TV";
	case 900 : tmp+="NoteBook";
	case 800 : tmp+="냉장고";
	case 700 : tmp+="한우세트";
	case 600 : tmp+="휴지";
		break;
	default: tmp+="칫솔";
	}
	System.out.println(tmp);
	// switch(조건) 정수만이 아니라
	// 문자열, 문자도 가능
	// String m = "F"
	// switch (m) case "A"
	
	
	
	
	
	
	
	
	
	}
}

