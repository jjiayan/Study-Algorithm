package kr.or.kosa;
/*
문제
우리 회사는 비행기를 주문 제작 판매하는 회사이다.
우리 회사는 비행기를 생산하는 설계도를 만들려고 한다.

client 요구사항
1. 비행기를 생산하고 비행기의 이름과 번호가 부여되어야 한다.
2. 비행기가 생산되면 비행기의 이름과 번호가 맞게 부여되었는지 확인하는 작업(기능) 출력
3. 공장장은 현재까지 만들어진 비행기의 총 누적대수를 확인할 수 있다(기능) 출력 

제약사항: 생성자 사용 금지. this 사용 금지. 앞으로 배워서 바꾸겠음 

ex) 
AirPlane air101 = new AirPlane();
air101.자원 = "대한항공";
air101.자원명 = "707";

비행기의 이름과 번호 출력

총 비행기 누적대수: 5대 생산 
비행기의 대수 > new의 개수에 비례. 

현재까지 배운 코드로 작성해보세요.
추후 개선 예정 
 */

/* (1차 코드)
public class AirPlane {
	private String airName;	// 비행기 이름 
	private int airNum;		// 비행기 번호 
	private static int airTotalCount;   // 비행기 누적 대수. 모든 객체가 공유하는 자원 
	
	public void makeAirPlane(int num, String name) {
		airName = name;
		airNum = num;
		airTotalCount++;
		airDisplay();
	}
	
	private void airDisplay() {
		System.out.printf("비행기 번호: [%d], 이름: [%s] \n", airNum, airName);
	}
	
	public void airPlaneTotalCount() {
		System.out.printf("총 비행기 제작 대수: [%d] \n", airTotalCount);
	}
	
}*/


// 생성자를 통해서 구현. 반드시 비행기를 만들 때, (번호, 이름) 부여하도록 
public class AirPlane {
	private String airName;	// 비행기 이름 
	private int airNum;		// 비행기 번호 
	private static int airTotalCount;   // 비행기 누적 대수. 모든 객체가 공유하는 자원 
	
	// default 안쓰고 오버로딩만 하길 원함 
	public AirPlane(int num, String name) {
		airNum = num;
		airName = name;
		airTotalCount++;
	}
	

//	public void makeAirPlane(int num, String name) {
//		airName = name;
//		airNum = num;
//		airTotalCount++;
//		airDisplay();
//	}
	
//	private void airDisplay() {
//		System.out.printf("비행기 번호: [%d], 이름: [%s] \n", airNum, airName);
//	}
	public void airDisplay() {
		System.out.printf("비행기 번호: [%d], 이름: [%s] \n", airNum, airName);
	}
	
	
	public void airPlaneTotalCount() {
		System.out.printf("총 비행기 제작 대수: [%d] \n", airTotalCount);
	}
	
}