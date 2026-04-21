/*
오류
1. 에러(error)    : 네트워크 장애 , 메모리 , 하드웨어 >> 개발자가 코드적으로 해결 불가
2. 예외(exception): 개발자가 코드 실수로 발생 >> 문제 발생 코드 찿아서 >> 수정 >> 배포
2.1 컴파일시 ...실행파일 생성 안되요 (무조건 해결)
2.2 ** 런타임시 (실행도중) 에 문제가 발생 >> 강제 종료 >> 문제가 생긴 시점 >> 이후 나머지 코드 실행 안되요

여담) 개발자가 싫어하는 숫자: 404, 500, 
	        좋아하는 숫자: 200번대 숫자 

예외처리 : 프로그램이 안정적으로 종료 >> 나면 원인 분석 >> 코드 수정 ....>> 다시 배포
try{
     >>문제가 의심되는 코드
     >>문제가 발생 되면 >> 어떤 일이 >> 예외가 발생한 정보를 담을 수 있는 객체 자동생성
     ex)
     >>[0][1][2]  >> car[3] = "" >> ArrayIndexOutOfBoundsException (생성) >>  예외담기
     >> new ArrayIndexOutOfBoundsException("정보")
}catch(Exception e){  Exception 모든 예외에 부모타입 
      >> 문제 파악
      >> 처리 (코드 수정되지 않아요) 보고
      >> 1.관리자 email
      >> 2.로그기록 (장애 발생 기록)
      >> 3.강제 종료는 막는다 ^^
}finally{ // 진짜 강력!
      >> 문제가 발생되던 , 발생하지 않던 강제적으로 실행되는 코드
      >> 함수 return 만나요 종료 ... return 을 만나도 finally 강제 실행
      >> DB작업 ...DB자원 종료(해제) 강제....
}
 */


public class Ex01_Exception {

	public static void main(String[] args) {
		/*
		System.out.println("main start");
		System.out.println(0/0);			// java.lang.ArithmeticException: / by zero 연산 예외 
		System.out.println("main end");
		*/
		
		System.out.println("main start");
		try {
			System.out.println(0/0);
		} catch (Exception e) {	// e 라고 하는 참조변수가 예외객체의 주소값을 받아요 (다형성) 
			// 문제 파악만 가능. (코드를 고치는 것이 아님)
			System.out.println(e.getMessage());
			e.printStackTrace(); // 몇번째 줄에서 어떠한 에러 발생했는지, 상세한 정보 제공 
								 // java.lang.ArithmeticException: / by zero
								 //			at Ex01_Exception.main(Ex01_Exception.java:43)
			
		}
		System.out.println("main end 여기까지 도달 ");
	}

}
