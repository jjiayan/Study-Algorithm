
public class Ex09_Static_Method {
	
	void method() {
		System.out.println("나 일반 함수!");
	}
	
	static void smethod() {
		System.out.println("나 static 함수!");
	}
	
	public static void main(String[] args) {
		
		Ex09_Static_Method.smethod();	// 나 static 함수!
		Ex09_Static_Method ex09 = new Ex09_Static_Method();
		ex09.method(); // 나 일반 함수!
		ex09.smethod();	// 나 static 함수!
		
	}

}
