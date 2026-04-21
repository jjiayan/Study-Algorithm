package kr.or.kosa;

/*
method: 기능(행위) 만드는 방법 > 행위 또는 기능의 최소 단위
		[하나의 함수]는 [하나의 기능]만 구현

* 가장 좋은 코드: 유지보수가 좋은 코드, 변화에 대응되는 코드. 

ex) 먹는 기능, 자는 기능 o, 먹고자는 기능 x

** 모든 함수는 호출에 의해서만 동작한다. **
> 누군가 나의 이름을 부르지 않으면 실행되지 않는다. 

(JAVA) 함수 종류 4가지
1. void, parameter(o): public void print(String str) { 실행구문 }
2. void, parameter(x): public void print() { 실행구문 }
3. return type, parameter(o): public int print(int data) { return 100; } 타입에 맞는 답을 리턴해야 함.
4. return type, parameter(x): public int print() { return 100; } 

void: return type이 없다  
return type > 8 + 1(String), Array, Class, interface, Collection 

public boolean print() { return true; }

* 주의
public Car print() { Car c = new Car(); return c; } : Car 객체의 주소값 리턴 // 어려울 수 있음. 변수c를 안에서 활용한다면 이렇게 작성하는 게 맞음 
public Car print() { return new Car(); } // 이런 코드 선호  
 
public String print() { return "AAA"; }  

parameter type >> void print(String 변수) 
parameter type > 8 + 1(String), Array, Class, interface, Collection 

void print(int i) {} >> print(100); 
void print(String str) {} >> print("hello"); 
void print(Car c) {} >> Car c1 = new Car(); print(c1); // 주소값 
					 >> print(new Car());	

parameter 1개 

void print2(int a, int b, int c) {}

ex) 
print2(10); (error)
print2(10, 20); (error)
print2(10, 20, "30"); (error) 
print2(10, 20, 30); (o)

함수의 이름: 관용적
ex) class Car, class Person 앞글자를 대문자로.

method 이름
ex) getNumber(); 

사원테이블에서 사원의 모든 정보를 가지고 오는 함수를 만드세요 
void getEmpAllList()

사원테이블에서 사원의 번호를 가지고 한 사원의 모든 정보를 가져오는 함수를 만드세요
void getEmpListByEmpno(int empno) 



* 오버로딩과 오버라이딩의 차이점
오버로딩: 하나의 이름으로 기능을 여러개 만드는 것. 
오버라이드: 상송관계에서의 재정의 
 */



public class Fclass {
	int data; // default
	
	// 함수의 접근자(수정자) : 70% public
	// 30% private: 공통함수(클래스 [내부]에서 다른 함수를 도와주는 함수) 
	public void m() { // void parameter(x) 
		// 기능구현 
		System.out.println("일반함수: void, parameter(x)");
	}
	
	public void m2(int i) {
		System.out.println("일반함수: void, parameter(o)");
		System.out.println("parameter 값 활용: " + i);
	}
	
	public int m3() { // 강제로 return 키워드를 구현해야 함. 
		return 1000;
	}
	
	public int m4(int data) {
		return 100 + data;
	}
	// 여기까지 가장 기본적인 함수 4가지 
	
	// 확장
	public int sum(int i, int j, int k) {//return type, parameter (o) -> 3번 type, 갯수만 늘어난 거
		return i + j + k;
	}
	
	private int subSum(int i) { // 객체에서 접근 불가 (클래스 내부 ..)
		return i + 100;
	}
	
	public void callSubSum() {
		int result = subSum(100);
		System.out.println("call result: " + result); 
	}
	
	public int opSum(int data) {
		int result = subSum(data);
		
		// 제어
		if(result > 0) {
			return 1;
		}else {
			return -1;
		}
	}
	
	/*
	 Quiz 
	 함수를 생성하는데 
	 정수타입의 parameter 2개를 받아서 둘중에 큰 값을 리턴하는 함수를 만드세요
	 ex) max(10, 5) return 10 이 반환됩니다
	 
	 */
	public int max(int i, int j) {
		// 코드를 단순화 해라. 60점.
//		if(i >= j) {
//			return i;
//		}else {
//			return j;
//		}
		// 90점. simple한 코드가 직관적, 보기 좋은 코드  
		return (i > j)? i : j;
		
	}
	
	
	
	
	
	
}
