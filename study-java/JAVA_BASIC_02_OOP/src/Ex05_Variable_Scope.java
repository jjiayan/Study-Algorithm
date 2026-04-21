// 2025.8.25

/*
- 변수 종류 
1. instance variable: 생성되는 객체마다 다른 값을 가질 수 있다. 초기화 굳이 필요 없음. 
2. local variable: 함수 안에 선언. 반드시 초기화가 필요함. ex. main 함수 내에 선연된 변수: 지역변
3. static variable
4. block variable: 제어문에서 사용 

- Today's Point
static variable >> 공유자원( heap에 생성된 객체간 공유자원) 
1. 객체 생성 이전 메모리에 올라가는 자원. (클래스(메서드) 영역: static)
2. 설계도를 구체화시키는 방법, 메모리에 올리는 방법은 new
3. static 자원은 new 없이도 메모리에 올라감. -> 메모리에 올라가면 사용 가능하다. new 없이도** 

 */

class VariableClass{ // default, 다른 패키지가 쓸 수 없음 
	 int iv; // instance variable, member field
	 		 // 언제 사용 가능? > 메모리에 언제 올라가지? > new 선언
	 		 // VariableClass V = new VariableClass(); > heap 메모리에 객체 생성 > 객체 안에 instance variable 
	 		 // VariableClass V2 = new VariableClass(); > heap 메모리에 객체 생성 > 객체 안에 instance variable 
	 		 // 목적: 데이터(정보, 자료)를 담을 목적. *정보: 고유, 상태, 부품(class) 
	 		 // 생성되는 객체마다 다른 값을 가질 수 있다! 그래서 초기화를 해서 값을 강제하지 않음. 
	 		 // default값. int = 0, double = 0.0, char = 'u0000'(빈문자), boolean = false, String = null, Car or Emp = null
	 
	 static int cv; // static variable
	 /*
	  1. class variable (클래스 변수). 일반적으로 static variable(객체간 공유자원) 
	  2. 목적: 정보를 담는 것. (생성되는 모든 객체가 공유하는 자원) 
	  3. 접근 방법
	  	 - 클래스 이름.static변수명 -> VariableClass.cv (new 선언 전 메모리에 올라가있음)
	  	 - VariableClass v = new VariableClass(); -> v.cv 로도 접근 가능
	  	   VariableClass v2 = new VariableClass(); -> v2.cv 
	  	   >> v.cv == v2.cv (같은 주소) -> 모든 객체가 동일하게 바라보는 공유자원 
	  	 *** 생성시점 ***
	  	 Hello.java > javac Hello.java > Hello.class
	  	 > java.exe Hello 엔터 실행
	  	 > JVM > OS > Memory 빌려 > 정리(영역을 나눔) > class Loader System 분석
	  	 > 클래스 정보(metadata:설명) >> class area(method area)
	  	   메모리에 올려요 (언제, 어떤 자원, 버전..)
	  	 > 그 클래스 안에 [static variable] 또는 [static method] 있다면
	  	 > 두 녀석을 class area(method area) 영역에 할당
	  	 > 그런데 함수의 이름 만약에 main() 이라면 정해진 규칙에 따라서 실행함 (Stack 영역) 자원 할당 ..
	  
	  
	  */
	 
	 void method() {
		 int lv = 0; // local variable ( 함수 안에 들어있는 지역변수. 사용 전에 반드시 초기화) 
		 			 // 생명주기: 함수가 호출되면 stack 메모리에 올라감. 함수가 끝나면 소멸
		 			 
		 
		 
		 for(int i = 0; i <= 100; i++) { // block variable 
			 
		 }
	 }
}



public class Ex05_Variable_Scope {
	
	// public int data; // -> main에서 사용할 수 없음 

	public static void main(String[] args) {
		
		// Ex05_Variable_Scope ex05 = new Ex05_Variable_Scope(); // -> 이렇게 하면 data 사용 가능 
		
		VariableClass.cv = 100; // class area, static area에 cv 올라감 
		
		VariableClass vc = new VariableClass();
		vc.iv = 200;
		vc.method();
		vc.cv = 200; //  공유자원이기 때문에 cv 는 200으로 바뀜
		
		VariableClass vc2 = new VariableClass();
		System.out.println(vc2.cv); // 200
		vc2.cv = 444;
		
		System.out.println(VariableClass.cv); // 444
		
	}

}
