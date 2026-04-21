package default_;

import kr.or.kosa.common.AirPlane;

//2025.8.22.
/*
 클래스 == 설계도 == 타입(사용자 정의 타입)
 
 클래스의 구성 요소(설계도라고 판단 근거)
 [필드 + 메서드] + 생성자
 속성 + 기능
 
 *필드(member field) >> 데이터, 정보를 담고 있음
 >> 고유정보, 상태정보, 부품정보 >> field >> variable
 
 *함수(method)
 >> 기능(행위) >> 자동차 >> 달린다, 멈춘다, 소리가 난다, 문을 연다
 + 추가적으로 함수(생성자) >> 특수한 목적(기능 정해져 있다) >> 객체 생성시 member field 초기화
 , getter, setter(함수 : 특수한 목적 > 캠슐화된 자원 > read, write > 직접 할당 아니고 간접 할당)
 
 class 설계도 {
 	고유정보
 	상태정보
 	부품정보 >> 또 다른 설계도
 
	기능(행위)
 } -> 코딩 실력만이 아니라 도메인 이해하는 것 또한 중요!
 
 클래스, 필드, 생성자 함수, 메서드: 영역(범위) >> 생성되는 장소(위치)에 따라서 달라지는 것이 있음. or 접근자(한정자, 수정자) (public 등)
 
 장소(위치): 폴더(package) 기반으로 .. 클래스 내부, 함수 내부, 제어문 내부 
 접근자: public, private, default(가지고 있는 기본값), protected(상속관계)
 
 kr.or.kosa.common 안에 클래스 Car > public class Car() {} 나 다 오픈할거야
 kr.or.kosa.common 안에 클래스 AirPlane > class AirPlane {} > default class AirPlane 해석
 
 default 같은 폴더에서만 공유(같은 package 에서만 사용)
 
 모든 웹개발
 M(model): DTO(VO), DAO, SERVICE >> java 
 V(view): html, jsp, 타임리프, freemarker, react, vue 
 C(controller): servlet(웹용 자바)
 
 주로 spring에서도 spring MVC
 
 금융, 국방, 공공, 
 
 class Emp{
	 private int empno;
	 private String ename;
 }
 
 class EmpDao{
 	DB 연결(select, insert, update, delete)
 }
 
(정리) 
 class ClassName {                ← class (설계도)

    // 멤버 필드 (속성, 상태)
    private int number;          ← private member field
    String name;                 ← default member field
    public String type;          ← public member field

    // 메서드 (기능, 행위)
    public void run() { ... }    ← public method
    private void stop() { ... }  ← private method

}  ← 클래스 범위(scope)

 
 연습 
 하나의 클래스 안에서 클래스 만들어서 사용 
 */
class Emp{ // 연습할 때 공부할 때.. 해봅시
	
	
}

class Dept{ // default class Dept . 같은 폴더 안에서만 쓸 수 있음. 
	int deptno; // 접근자가 없음 (default int deptno) 
	public String dname; // default class 안에 public이 있음. 에러는 아니지만 다른 폴더에서 사용 불가. -> 문법적으로 문제 없으나 의미가 없
	private int count; // 설계자의 의도: 감추다, 숨기다, 캡슐화, 은닉하다 -> 클래스 내부에서만 사용 -> 직접할당은 막고 간접할당으로 제어. 
	
	// 특수한 함수(기능): 함수 하나는 하나의 기능을 구현 
	// getter 함수(읽기 전용) 
	public int getCount() {
		return count;
	}
	
	// setter 함수 
	public void setCount(int num) {
		// 간접 
		if(num < 0) {
			count = 0;
		}else {
			count = num;
		}
	}
}

// 연습용
class Test { // default class
	int i; // default int 
	
	void print() { // default void print 
		for(int i = 0; i <= 100; i++) {
			
		}
	}
}


public class Ex01_Main {

	public static void main(String[] args) {
		// Dept 구체화 : 메모리에 올려 사용하겠다 
		Dept dept = new Dept();	 // 메모리에 올림. 
		dept.deptno = 10;
		dept.dname = "홍길동";
		dept.setCount(-100);
		System.out.println(dept.getCount());
		
		AirPlane airPlane = new AirPlane();
		airPlane.data = 100;
		
		Test t = new Test();
		t.i = 100;
		t.print(); 

	}

}
