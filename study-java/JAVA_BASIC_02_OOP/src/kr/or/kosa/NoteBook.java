package kr.or.kosa;

/*
노트북은 색상을 가지고 있다. (private) setter getter 
노트북은 생산년도를 가지고 있다. (private) setter getter
노트북은 마우스를 가지고 있다. (마우스는 2개 좌표값을 가지고 있다.) (x, y)

 */



public class NoteBook {
	private String ncolor;
	private int nyear;
//	private Mouse mouse = new Mouse();	// 이렇게 만들면 Notebook은 mouse에 접근 못함 
//	public Mouse mouse = new Mouse();  // 통합제품 (노트북 사라지면 마우스 같이 사라짐)
	
	// 노트북 [필요에 따라서] 마우스를 가질 수 있다
	// 기능이 동작될 때 ...
	public void handleMouse(Mouse mouse) { // 마우스 객체의 주소(main 함수 new 된)
		mouse.setX(10);
		mouse.setY(20);
		mouse.getReadMouseData();
	}
	
	public String getColor() { // getter 
		return ncolor + " 색상";
	}
	public void setColor(String data) { // setter 
		ncolor = data;
	}
	
	public int getYear() {
		return nyear;
	}
	public void setYear(int data) {
		if(data < 0) {
			nyear = 1999;
		}else {
			nyear = data;
		}
	}
	
	
	
}