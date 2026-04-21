import kr.or.kosa.AirPlane;

public class Ex06_static_airplane {

	public static void main(String[] args) { 
		// 비행기 3대 제작, 확인, 총대수 확인 
		/*
		 AirPlane air101 = new AirPlane();
		air101.자원 = "대한항공";
		air101.자원명 = "707";
		 */
		
		/* (1차 코드용)
		AirPlane a = new AirPlane();
		a.makeAirPlane(111, "a항공");
		
		AirPlane b = new AirPlane();
		b.makeAirPlane(222, "b항공");
		
		AirPlane c = new AirPlane();
		c.makeAirPlane(333, "c항공");
		
		c.airPlaneTotalCount();
		*/
		
		// 2차 코드 
		AirPlane a = new AirPlane(111, "a항공");
		a.airDisplay();
		a.airPlaneTotalCount();
	}

}
