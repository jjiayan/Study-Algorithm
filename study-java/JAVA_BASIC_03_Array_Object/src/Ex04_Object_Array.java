


class Person{
	String name;
	int age;
	
	/*
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	*/
	void print() {
		System.out.println(this.name + " : " + this.age);
	}
}




public class Ex04_Object_Array {

	public static void main(String[] args) {
		// 
		int[] intarr = new int[10]; // default: [0][0][0][0][0][0][0][0][0][0]
		boolean[] boolarr = new boolean[5]; // default: [false][false][false][false][false]
		
		Person p = new Person();
		p.name = "홍길동";
		p.age = 100;
		
		// Person 타입의 사람 3명을 만드세요 
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		// 반복적 -> 배열로 만들라!
		
		// 1.
		Person[] persons = new Person[3];	// 방만 만들고, 방엔 아무도 살지 않음(null)
		persons[0] = new Person(); // 	방이 주소값을 가짐.
		// 객체배열은 선언과 각방의 할당을 따로 해주어야 한다!
		persons[1] = new Person();
		persons[2] = new Person();
		persons[2].name = "김유신";
		persons[2].age = 100;
		
		// 제어문 사용
		Person[] parr = new Person[10];
		for (int i = 0; i < parr.length; i++) {
			parr[i] = new Person();
			System.out.println("주소값: " + parr[i]);
		}
		/*
		주소값: Person@2a139a55
		주소값: Person@14ae5a5
		주소값: Person@7f31245a
		주소값: Person@6d6f6e28
		주소값: Person@135fbaa4
		주소값: Person@45ee12a7
		주소값: Person@330bedb4
		주소값: Person@2503dbd3
		주소값: Person@4b67cf4d
		주소값: Person@7ea987ac
		 */
		
		// 2. int[] arr = new int[] {10, 20, 30};
		Person[] parr2 = new Person[] {new Person(), new Person()};
		
		// 3. int[] arr = {10, 20, 30};
		Person[] parr3 = {new Person(), new Person(), new Person()};
		
		
		
		
		
		
		
		
	}

}
