/*
생성자 함수(Constructor) 
1. 특수한 목적의 함수 
2. 목적: member field의 초기화 : static {}, {} 
3. 일반 함수와 다름
3.1 함수 이름이 고정되어 있음 (class 이름 동일) 
3.2 return type 존재할 수 없음 (void): 객체 생성과 동시에 호출. return 받을 대상 없음
3.3 new Car > heap 객체 생성 > member field 자리 잡음 > 초기화 생성자 함수 자동 호출 
3.4 return type(x) >> void >> public void(생략) Car(){} >> public Car() {}

** 싱글톤 면접 자주 나오는 문제 !!
참고) 생성자 접근자 private 가능(싱글톤 패턴) : 객체를 하나만 만들어 공유 

4. 왜 생성자를 만들어야 할까? 
[생성되는 객체]마다 [강제적]으로 member field를 초기화

5. 생성자 함수 1개 만들 수 있을까요?
아니요 > 생성자 함수 > overloading 사용하면 (강제구현) > Today's Point
*** 생성자 함수를 쓰는 가장 중요한 목적은 member field 강제적 초기화 

class Car {
	String color;
}
>> 설계도를 만든 사람은 자동차 색상은 니가 알아서 해(안해도 어쩔 수 없어)

class Car {
	String color = "blue";
}
>> blue 색상을 다른 색상으로..

설계자의 고민(문제): 자동차의 색상을 정하지 않고 출고 
출고(반드시 어떤 색상은 강제로 정하게)

class Car {
	String color;
	public Car(){//default (parameter(x))
	
	}
	public Car(String data){ // overloading
		color = data;
	}
}
 
 */


class Car{
	String carName = "포니";
	// 여러분이 강제적으로 구현하지 않는다면 default 생성자를 
	// 컴파일러가 알아서 생성 
	// public Car() {} 생략 
	public Car() { // Default Constructor 
		System.out.println("나는 기본 생성자 함수");
		carName = "내마음";
		
	}
}

class School{
	String schoolName = "강남";
	// default 생성자가 생략되었구나. (컴파일러가 자동으로 생성하는 구나) public School() {}
}

class Car2{
	String carName;
}

class Car3 {
	String carName;
	public Car3() { // default constructor method
		carName = "포니"; // carName 초기화 
		
	}
}

class Car4{
	String carName;
	public Car4()	{ // default
		carName = "기본포니";
	}
	
	public Car4(String name) { // overloading(생성자 오버로딩) 
		carName = name;
		
	}
	// Car4 사용하는 개발자에게 옵션 (default, overloading)
}

class Car5{
	String carName;
//	public Car5()	{ // default
//		carName = "기본포니";
//	}
	// 멤버필드를 반드시 초기화하려는 목적 
	public Car5(String name) { // overloading(생성자 오버로딩) 
		carName = name;
		
	}
	// Car5 사용하는 개발자에게 옵션 (default, overloading)
}

public class Ex12_Constructor {

	public static void main(String[] args) {
		Car car = new Car();	// default 함수 호출 // 나는 기본 생성자 함수
		System.out.println(car.carName); // 내마음
		
		Car4 car4 = new Car4("그랜저");
		System.out.println(car4.carName);
		
		Car5 car5 = new Car5("v6"); // 생성자가 원하는 방법 
	}

}













