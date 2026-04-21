package kr.or.kosa.Emp

public class Ex02_Variable {
	public static void main(String[] args) {
		
		//변수 정의 
		// 타입이란 
		// 제어문 
		
		int value; // 변수 선언 (지역변수) 선언은 되어있지만 초기화 되어있지 않음 / 초기화 : 변수의 초기화 : 변수가 할당을 통해 처음 값을 갖는 것 
//		System.out.println(value); 
		//the local variable value may not have been initialized : 지역변수는 사용시 반드시 초기화를 선행 해야 한다
		//지역변수(local) 무조건 초기화 해라 ....
		value = 100;  // 선언과 할당이 분리됨 
		
		// 선언과 할당을 동시에
		int age = 50;
		System.out.println(age);
		
		Emp emp; // 선언 (지역변수)
//		System.out.println(emp);
		// 초기화 : 메모리에 올리기 : new
		emp = new Emp(); // 주소값 할당 (초기화)
		
		// new 연산자 : 클래스 구체화 : 메모리(heap)에 할당 -> 메모리 주소 생
		System.out.println(emp);
		
		// . 연산자는 주소를 찾아가는 연산자 : publc한 자원만 보임 
		System.out.println(emp.empno);    // 0 : 디트 
		Emp emp2 = emp;
		emp2.empno = 5000;
		System.out.println(emp.empno); // 주소값 할당 
		
		/*
		 블럭주석
		 클래스 == 설계도 == 데이터 타입(작은 여러개를 가지는 큰 타입)
		 클래스 변수명;
		 
		 클래스의 종류
		 1. class Car{} > main 함수를 가지고 있지 않은 클래스 > 독자적인 실행 불가능 > 다른 클래스에 도움을 주는 클래스 (lib)
		 2. class Car{	public static void main() {}} > main 합수를 가지는 클래스 > 독자적인 실행 불가능 
		 3. 현재는 main 함수를 가지는 클래스 .. 결과를 확인
		 3.1 class Car{} > Car car = new Car(); car.move()
		 3.2 Ex02_Variable ex02 = new Ex02_Variable()
		 3.3 그런데 .. new 없이도 memory 올릴 수 있는 방법이 있다면 >> static
		 3.4 당신이 필요한 변수, 함수가 memory 있다면 static 변수, static 함수
		 3.4 Ex02_Variable new 하지 않고 .. static 함수 main 이름 (진입점) 약속
		 
		 변수: Variable
		 데이터(자료) 담을 수 있는 공간(메모리)의 이름
		 
		 공간(크기) > 데이터 타입(자료형) >> 메모리의 공간을 한정(크기) >> 최소 공간 최대의 데이터 표현
		 int age = 150;
		 
		 변수가 선언되는 위치 (scope, 유효범위)
		 1. instance variable: 객체변수(클래스 안에) >> class Car { public int door}
		 2. local variable: 지역변수(함수 안에) >> class Car { public void run(){int data=0;} }
		 3. static variable: 정적변수, 공유자원(객체간) >> class Car { public static int NUM;}
		 4. 함수 안에 있는 제어블럭 안에 있는 변수 (if, for) 블럭 변수
		 class Car { void run { for(int i = 0; i..... }}
		 
		 크기별 변수 나열: static > instance > local > block
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 */
	}

}
