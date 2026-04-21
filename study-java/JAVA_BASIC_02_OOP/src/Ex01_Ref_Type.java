
// 연습용

import kr.or.kosa.Person;

class Test{
	int i;
	int j;
	void print() {
		System.out.println(i);
	}
}

public class Ex01_Ref_Type {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "홍길동";
		person.age = 100;
		person.power = true;
		
		person.personPrint();
		
		// 결과 
		System.out.println(person); // .toString() 생략되어 있음 
									// kr.or.kosa.Person@27716f4: 조합된 주소값 
									// kr.or.kosa.Person(패키지명) + "@" + 16진수값 
		System.out.println(person.toString()); // kr.or.kosa.Person@27716f4
		// toString() Object 조상객체 
		
		Person person2 = person; // 주소값 할당 
		// person, person2 동거 = 같은 집에 산다. 
		// 같은 집에 살고 있음을 증명하세요
		System.out.println(person==person2); // true > 같은 집에 산다. 
		
	}
}
