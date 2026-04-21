/*
static 초기화
1. static variable	: 객체마다 같은 값을 공유 
2. instance variable: 생성되는 객체마다 다른 값을 가지게 하겠다 

두 자원은 default 값(초기화 할 필요 없음) 
 

 */

class Test2{
	static int cv = 10;	// 초기화
	static int cv2; // default = 0
	
	int iv = 9;	
	
	// 1. static 자원 초기화 블럭 static {}
	static {
		// 실행되는 시점 : static int cv = 10; or static int cv2;가 메모리에 올라간 직후 자동 호출(실행) 
		cv = 1111; 
		cv2 = 10;
		// ** 조작된 표현이 가능 (제어문) **
		cv2 = cv + 2222;
		// iv는 static 초기화에서 보이지 않기 때문에 사용할 수 없음 
	}
	
	// 2. 일반 자원 초기화: 일반자원의 초기화 블럭. 생성자 함수와 기능이 겹침. 잘 사용하진 않음 
	// 객체가 생성되면(new Test2()) > heap 영역 만들어지고 member field 올라가고 자동으로 초기화블럭 실행 
	{
		System.out.println("초기화 블럭이 실행");
		if(iv < 10) iv = 10000;
	}
	
}


public class Ex07_Static_Init {

	public static void main(String[] args) {
		System.out.println(Test2.cv);  // 1111
		System.out.println(Test2.cv2); // 3333
		
		// 초기화 (일반)
		Test2 test2 = new Test2(); // 초기화 블럭이 실행
		System.out.println(test2.iv); // 10000 
		
	}

}
