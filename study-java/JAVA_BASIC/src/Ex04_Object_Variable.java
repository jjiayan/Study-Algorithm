/*
 클래스 == 설계도 == 데이터타입
 
 Tip) 하나의 물리적 java 파일에 여러개의 클래스 생성 가능 (실무 x, 연습과 문법이해)
 원칙적 방법 
 패키지
 kr.or.kosa.utils.Apt
 kr.or.kosa.model.Apt
 
 
 */ 

class Apt{
	// 설계도 (데이터 타입: 사용자 정의 타입)
	// 설계도는 구체화되지 않으면 의미가 없다(종이와 같다) 
	// 목적: Apt 설계도를 만들어, 똑같은 아파트를 무한히 생산하겠다는 의미. 
	// 설계도 목적: 재사용성 
	String doorColor;
}

public class Ex04_Object_Variable {
	public static void main(String[] args) {
		Apt apt; // apt라는 지역변수는 Apt 아파트의 주소를 담을 수 있음.
		apt = new Apt(); 
		// heap 메모리에 아파트가 한채 지어지고 생성된 아파트의 주소를 apt 변수가 받는다. 
		System.out.println("apt 주소: " + apt); // Apt@2a139a55
		
		Apt apt2 = new Apt();
		// apt, apt2는 다른 주소를 가짐. 
		System.out.println(apt == apt2); // false 
		
		Apt apt3 = apt;
		// apt3는 apt 주소를 갖고 있어 메모리를 갖고 있음. 주소값 할당. -> 집 주소를 가짐 
		System.out.println(apt == apt3); // true
		
		int i = 10;
		int j = i;
		j = 10000;
		// i값 10.
		
		apt2.doorColor = "red";
		System.out.println(apt2.doorColor);
		
		/*
		 javac Ex04_object_Variable.java > Ex04 Object_Variable.class
		 java Ex04_Object_Vairable 엔터 실행
		 1. JVM > OS > 빌려줘 > memory
		 2. memory 정리(자료구조) 할당 
		 3. main 함수 실행 
		 */
		
	}
}
