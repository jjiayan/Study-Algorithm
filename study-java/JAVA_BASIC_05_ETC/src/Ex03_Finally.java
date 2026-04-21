/*

try{

} catch (Exception e){

} finally {
	만들어서 .. 문제 발생했던, 정상적으로 수행되었던 실행되는 블럭
	강제적으로 실행 블럭 
}

게임 CD 사서
1. 설치파일 >> C:Temp 폴더 >> 복사
2. 복사한 파일 >> 프로그램 설치
3. 정상 성치 >> C:\Temp 내용 삭제
4. 비정상 성치 >> C:\Temp 내용 삭제

강제로 실행되는 블럭이 필요: finally


 */

import java.io.IOException;

public class Ex03_Finally {
	
	static void copyFiles()	{
		System.out.println("copy files");
		
	}
	
	static void startInstall()	{
		System.out.println("install..");
		
	}
	
	static void fileDelete() {
		System.out.println("file delete..");
	}
	
	/*
	 예외가 발생: 0/0, index 범위
	 
	 개발자가 예외를 강제로 던질 수 있음. 
	 "홍길동" 입력되면 나느 예외로 보겠다.. 개발자가 필요에 의해서 예외 상황 만들 수 있음 
	 
	 사용자 정의 예외처리 
	 throw new IOException 
	 */
	
	public static void main(String[] args) {
//		copyFiles();
//		startInstall();
//		fileDelete();
		
		
		try {
			copyFiles();
			startInstall();
			
			throw new IOException("Install 도중 문제 발생...");
		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		} finally {
			// 강제 실행 블럭
			// 정상, 비정상 무조건 실행
			// 함수가 가지는 return 을 만나도 finally 블럭은 실행된다 **
			fileDelete();
		}
		
	}

}
