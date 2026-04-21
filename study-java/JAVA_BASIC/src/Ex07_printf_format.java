import java.util.Scanner;

public class Ex07_printf_format {

	public static void main(String[] args) {
		// java: System.out.println()
		// c#: Console.WriteLine();
		
		System.out.println("A");	// 출력하고 줄바꿈
		System.out.println();	// 엔터, 줄바꿈
		System.out.println("B");	
		
		int num = 1000;
		System.out.println(num);
		System.out.println("num 값은 " + num + " 입니다.");
		
		// 형식(format)
		// System.out.printf(null, args) (형식, 형식에 들어갈 값)
		System.out.printf("num 값은 %d 입니다.", num); // 내부적으로 개행하지 않음
		System.out.println();
		System.out.printf("num 값은 [%d] 입니다. 또 [%d]도 있어요 \n", num, 12345);
		
		/*
		 %d 10진수 형식의 정수
		 %f 실수 
		 %s 문자열 
		 %c 문자 
		 
		 \t, \n 조합해서 format 생성
		 
		 */
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f 변수값은 %f 입니다. \n", f);
		
		
		// cmd 모드 입력값 받기
		
		Scanner sc = new Scanner(System.in); // 입력값 받는 클래스
		// String value = sc.nextLine(); // 무엇인가 입력하고 enter 칠 때까지 대기상태 
		// 프로그램이 종료되지 않고 계속 대기
		// System.out.println("value 입력값: " + value);
		
		// float value = sc.nextFloat();
		// System.out.println("value 입력값: " + value);
		
		// Tip
		// 권장: nextInt, nextFloat 보다는 모든 데이터를 nextLine() read
		// 필요하면 타입 변환 
		
		// Today's Point
		// [문자열] -> 숫자(정수, 실수)
		
		/*
		 String data = sc.nextLine();
		 int age = Integer.parseInt(data);	// 문자열을 정수로 바꿔줌 
		 
		 wrapper class
		 Integer.parseInt("1000") -> 1000
		 Float.parseFloat("3.1415") -> 3.1415
		 */
		// 문자열로 받아서 숫자로 바꿔서 처리하는 습관 가지기 ***** 
		System.out.println("숫자를 입력하세요 ");
		int number = Integer.parseInt(sc.nextLine());
		System.out.printf("입력한 숫자는: %d", number);
		
		
		
		
		
		
		
		
	}

}
