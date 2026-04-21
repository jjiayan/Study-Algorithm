
public class Ex02_Exception {

	public static void main(String[] args) {
		// 
		System.out.println("main start");
		
		int num = 100;
		int result = 0;
		
		
		// 코드가 의심되면 ... 
		try {
			for (int i = 0; i < 10; i++) {
				result = num / (int)(Math.random() * 10); // 0~9
				System.out.println("result: " + result + "i: " + i);
			}
		} catch (Exception e) { // 실제 예외가 터지는 ArithmeticException e 쓰는 것이 유지보수와 가독성에 좋음 
			// 문제의 원인을 파악하겠다...
			System.out.println("문제 발생했어요.. 관리자에게 알려주세요 ");
			System.out.println("원인: " + e.getMessage());
		}
		
		System.out.println("main end");
		
		
	}

}
