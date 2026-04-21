package kr.or.kosa;

public class Mouse {
	// 마우스는 (x, y) 한 점을 표현
	// x, y 캡슐화 
	// write만 구현 (setter 구현)
	// 함수를 출력되게 
	
	private int x; 
	private int y;
	
	public void setX(int n) {
		x = n;
	}
	public void setY(int n) {
		y = n;
	}
	public void getReadMouseData() {
		System.out.println("x :" + x + " y: " + y);
	}
	
}
