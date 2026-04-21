/*
 OOP: 여러개의 작은 클래스를 모아 모아서 하나의 큰 클래스를 만드는 행위 
 
 큰클래스(설계도): 메인 설계도, 부분 설계도, 독립적인 별도 설계도, 메인 설계도의 하위 설계도 

1. 상속
JAVA: child extends Base
C#  : child : Base

특징
1. 다중상속불가( 단일 상속 원칙 >> 계층적 상속)
2. 계층적 상속(여러개의 클래스 상속 가능)
3. 예외적으로 다중 상속이 가능한 자원 > 인터페이스 (표준, 규칙, 규약, 약속 정의) 


상속 
1. 진정한 의미: 재사용성 
2. 단점: 초기 설계 비용 ..., 부모 자식 관계(커플링) >> 디커플링 (느슨한 관계) 
3. 재사용성 ... 최대한 ...

모든 클래스는 메모리에 올라가야 사용 가능
Child child = new Child();


 */

class Car { // class Car extends Object 생략
	// Car 부모는 Object
	// Object 꺼는 내꺼 ..(상속관계에서)
}

class GrandFather{
	public int gmoney=5000;
	private int pmoney=10000; // 무덤까지 가져 갈거야(상속관계에서 접근 불가) >> public을 통한 간접 접근은 가능 
	public GrandFather()	{
		System.out.println("GrandFather 생성자");
	}
}

class Father extends GrandFather{
	public int fmoney=3000;
	public Father()	{
		System.out.println("Father 생성자");
	}
}

class Child extends Father{
	public int cmoney=100;
}

// Object > GrandFather > Father > Child 

public class Ex01_Inherit {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println();

	}

}
