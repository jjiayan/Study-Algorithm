/*
 데이터 타입
 1. 자바가 제공하는 기본 타입(원시타입) > 8가지
 2. 8가지 타입(값을 저장) 
 
 boolean
 
 숫자 
  ㄴ 정수(음의 정수, 0, 양의 정수)
    - byte(8bit) -128 ~ 127 (1byte > 8bit) > 통신 시 주로 사용, 파일 다운/업로드 할 때 
    - char(2byte) 한 문자가 들어갈 수 있는 공간 (*내부적으로 정수값을 갖는다: ascii 코드표 10진수와 문자 비교)
    >> 영문자, 특수문자, 공백 (1byte로 표현 가능), 한글 2byte 
    Tip) create table emp ( empno number, 
    						ename char(20), 
    						hobby varchar2(20),
    						addr nvarchar2(20))
	ex) char c = 'A', char c2 = '가' 
	javascript ) let c = 'AAAA', let c2 = "AAAA" 
	
	- short 호완성(c언어) - 현재 안 씀
	- int (4byte -21 ~ 21억 ) ** 정수 리터럴의 기본 타입 int 
	- long(8byte)
	
	
  ㄴ 실수(부동소수점) 
    - float ( 4byte) 소수이하 대략 7자리 정도 표현 가능
    - double (8byte) 소수이하 대략 15자리 정도 표현 가능 > 정밀도높음(표현의 범위가 크다) ** 실수 리터럴의 기본 타입 double
    
 
 논리
 	- 참 거짓 판단(true, false) 
 
 가장 많이 사용하는 타입(String)
 String str="홍길동";
 String은 클래스이다!!
 String은 값타입처럼 사용해도 문제 없음
 
 String str = new String("홍길동")
 약속) 강사님 별도의 이야기 전까지 8가지 기본타입 + 1 >> int, double 처럼 쓰세용 아무 문제 없게 설계되어 있어용
 
 자바타입은
 1.값타입: 8+1 (값을 저장)
 2.참조타입(주소값을 저장): 클래스 타입, 인터페이스 타입, Array 등..
 class Car{}
 
 main(){
 	Car car = new Car(); car 변수에는 주소값이 들어있음
 	int num = 100;	num 변수에는 100 값이 들어있음
 }
 
 정수값을 표기하는 방법
 십진수: 100
 16진수: 0x2a
 8진수: 0123
 2진수: 0b1100100
 
 123L or 123l 리터럴 long 타입 십진수
 Ox2aL        리터럴 long 타입 16진수
 
 [실수값을 표기하는 방법]
 3.14
 123.4
 123.4F, 123.4f
 
 1.23e2승 > 123.4 지수표기법
 
 문자값을 표기하는 방법
 'A' or '가'
 '\u0065' 이렇게도 문자값을 표현함.
 진리값을 표기하는 방법
 true, false

 문자열을 표기하는 방법
 "홍길동"
 "ABCD"
 
 */
public class Ex03_DataType {
	public static void main(String[] args) {
		
		//int(-21 ~21억)
		int num = 10000000;
		System.out.println("num: " + num);
		
		//int num2 = 10000000000;
		int num2 = 10000;
		//The literal 10000000000 of type int is out of range
		
		long num3 = 100;
		//사실은 컴파일러가 내부적으로 일을 함
		// long num3 = (long) 100;
		// 암시적 형변환 (컴파일러가 자동으로 형변환)
		// 작은 타입을 큰 타입 넣는 것은 당근..
		
		// 초보 개발자 주의사항! 
		// int num4 = 100000000000;	
//		 int num4 = 100000000000L;	
		// long num4 = 100000000000L; // 해결방법1. 받는 그릇의 크기를 늘린다.
		int num4 = (int)100000000000L; // 해결방법2. 개발자 의도 명시적 형 변환(타입 변환, casting)
		System.out.println("num4" + num4);	// ghost data. 쓰레기 값.  정상적인 값이 아노지 않는 경우 발생.
		
		int num5 = (int)100000L; // 큰값을 작은값으로 변환할 경우, 데이터 손실이 없음. 	
		// 담는 그릇을 크게 하면 이런 문제 고민할 필요 없음. 
		
		
		// char 2byte  > 한 문자를 표현 > 내부적으론 정수값을 가짐(0~65535)
		// ascii 코드표('A': 65) 정도만 외워두기. 정수와 호환됨.
		char ch = '가';
		System.out.println(ch);
		
		ch = 'a';
		ch = 'A'; 	// 오버라이트 됨
		// char 정수 타입(문자를 저장하지만 내부적으론 정수값을 가지고 있음)
		
		int chint = ch;
		System.out.println("ch 문자를 정수값으로 보면: " + chint);
		
		// int chint = (int)ch;
		
		char chint2 = 'a';
		System.out.println(chint2);
		
		// int intch2 = (int)chint2; // 명시적 형변환
		
		// 문제 제
		// int intch3 = 65;
		// char ch3 = intch3;
		// 해결방법 1 (명시적 형변환, 데이터 손실 발생할 수 있음)
		// char ch3 = (char) intch3;
		// 해결방법 2 (받 그릇을 크게)
		// int ch3 = intch3;
		
		/*
		 1. 할당에 있어서 값을 보지 말고 값이 가지는 타입을 보자
		 1.1 리터럴 값에 대해서 (개발자가 직접 입력하는 값)
		 1.1.1 정수 리터럴의 기본 타입은 int
		 1.1.2 실수 리터럴의 기본 그릇은 double
		 
		 2. 암시적 형변환, 명시적 형변환
		 2.1 큰 타입에 작은 타입의 값을 넣는 것은 암시적 형변환을 통해 개발자가 건드릴 필요 없음
		 2.2 작은 타입에 큰 타입을 넣고자 한다면 자동 형변환 지원되지 않음 -> (강제적) 명시적 형변환 
		 2.2.1 접미사(L, l) 또는 (int) 정수
		 KEY POINT: 강제적 형변환은 데이터의 손실을 감수해야 한다. (책임은 개발자가~)
		 ex) char c = (char) int 데이터 손실 발생 가능성
		 
		 String 8+1(String)
		 값 타입처럼 써도 문제 없음, 단 문제가 있을 경우가 있긴 함.
		 문자열은 존재하지 않음. 문자열을 타입으로 존재하지 않음. 문자의 집합이기 때문. char 배열의 모음.
		 ex) "가나다" >> 내부 ['가']['나']['다']
		 >> 문자열은 char의 집합
		 int, long 동일하게 사용
		   
		 */
		
		String name = "홍길동";
		name = "홍길도 바보";	// 이 과정이 사실 값을 덮어쓰는 것이 아니라, 메모리를 새로 할당하고 주소를 바꾸는 것임. 
		
		String color = "red";
		color = color + "방가방가";
		System.out.println(color);
		
		// TIP)
		// 연산자 언어마다 표현이 다름
		// JAVA > + : 산술, 결합 
		// Oracle > +: 산술, 결합 연산자 || > '안녕' || '방가방가'
		
		// 자바는 타입에 엄격한 언어 <-> 자바스크립트는 유함
		/*
			let i;	// undefined
			i = 100; 이때 타입이 결정됨 (number)
			
		 */
		
		// JAVA에서 특수문자 처리하기
		// char sing = ' ';
		//char sing = '''; // Invalid character constant
		// 이스케이프 문자: 특정 문자 앞에 \다음 값은 데이터 인정
		char sing = '\'';
		System.out.println(sing);
		
		// Quiz) 홍"길"동 이라는 문자열을 출력하고 싶을 땐?
		String userName = "홍\"길\"동";
		System.out.println(userName);
		
		String str1 = "10000";	// 10000이라는 문자열
		String str2 = "10";
		String result = str1 + str2; // 결합
		System.out.println("result: " + result);
		
		// 문자열 + 숫자 -> 문자열이 이
		System.out.println("100" + 100);	// 100100
		System.out.println(100 + "100");
		System.out.println(100 + 100 + "100");
		System.out.println(100 + (100 + "100"));
		System.out.println(100 + "100" + 100);
		
		//Quiz 경로 C:\Temp 문자열로 String 변수에 담아서 출력
		String path = "C:\\Temp";
		System.out.println("path : " + path);
		//Invalid escape sequence (valid ones are \b \t \n \f \r \" \'
		
		// \t (tab),  \n (new line)
		path = "C:\\T\te\tm\np";
		System.out.println("path: " + path);
		
		// byte: 네트워크 데이터 교환.. 파일처리(파일 업로드 다운로드)
		// byte[] ...배열로 활용
		// long: 금융 화폐
		
		// 실수형(부동소수점)
		// float 4byte
		// double 8byte (실수 리터럴의 기본 타입: double)
		// float f = 3.14;
		// 해결방법1 float f = 3.14f; 	-> 짧아서 이거 사용하는 경우 많음 
		// 해결방법2 float f = (float)3.14; 	
		// 두 방법 모두 데이터 손실 발생
		
		// 현명한 개발자라면?
		double d = 3.14; // 처음부터 타입을 크게 잡고 사용하는 것이 편함
		// 정수값 int, 실수값 double 사용하는 게 편함~
		
		float data = 1.123456789f; 
		System.out.println("float data: " + data); // 1.1234568 8에서 반올림되어서 출력됨 
		// 대략적으로 소수점 7자리 표현 가능 
		
		double data2 = 1.123456789123456789;
		System.out.println("double data: " + data2);
		// 소수점 16자리 표현 가능. 
		
		// 자바는 BigDecimal 클래스를 만들어 정밀한 수(화폐 단위)를 표현할 수 있게 만들어짐. *****중요!
		
		// Quiz)
		double data3 = 100;
		System.out.println("data3 : " + data3); // 100.0
		
		// Quiz)
		double data4 = 100;
		int number = 100;
		// int result2 = data4 + number; -> double + int = double
		// int result2 = (int)(data4 + number); // 손실이 발생할 수도 
		double result2 = data4 + number; // 받는 그릇을 크게 만드는 것이 편함 
		
		// Quiz
		int number2 = 100;
		// byte b2 = number2;
		// byte b2 = (byte)number2;
		// int b2 = number2;
		
		// Today's Point
		// 1. 큰타입 + 작은타입 연산 결과는 큰타입을 따라간다
		// 2. 타입 간 변환 >> 변수가 가지는 값을 보지말고 변수의 타입을 보자 
		// 3. 명시적(강제적) 형변환은 데이터 손실을 가져올 수 있으니 고민해야 함
		
		int data5 = 100;
		byte b3 = (byte)data5; // 명시적(강제적) 형변환
		
		byte b4 = 20;
		//int data6 = b4; // 이렇게만 작성하면 충분함. 
		//int data6 = (int)b4; // 이렇게 써도 무방하나, 컴파일러가 자동으로 하는 것은 개발자가 굳이 할 필요 없음. 암시적 변환
		
	}

}
