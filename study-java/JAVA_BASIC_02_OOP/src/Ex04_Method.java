import kr.or.kosa.Mouse;
import kr.or.kosa.NoteBook;

public class Ex04_Method {

	public static void main(String[] args) {
		// 노트북 구매 
		NoteBook noteBook = new NoteBook();
		noteBook.setColor("red");
		noteBook.setYear(2025);
		String color = noteBook.getColor();
		int year = noteBook.getYear();
		System.out.println("color: " + color + "year: " + year);
		
		// ------------------------------------------------------
		// 노트북 .. 마우스 사용 불편해
		// 마우스 구매
		Mouse mouse = new Mouse();
		
		// 노트북 마우스 연결
		noteBook.handleMouse(mouse);
		
		// 통합제품을 가져갈 것인지
		// 다른 제품을 연결해 사용할 것인지 고민
		
		
	}

}
