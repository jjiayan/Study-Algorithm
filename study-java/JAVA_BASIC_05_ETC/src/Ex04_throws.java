import java.io.IOException;

import kr.or.kosa.utils.ExClass;

public class Ex04_throws {

	public static void main(String[] args) {
		
		// (ver1) 
		try {
			ExClass ex = new ExClass("C:\\Temp");
		} catch (NullPointerException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* 
		// (ver2)
		try {
			ExClass ex = new ExClass("C:\\Temp");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {

		} 
		*/
		// (ver3) 초보자 코드. 가독성 떨어짐.
		/*
		try {
			ExClass ex =  new ExClass("C:\\Temp");
		} catch (Exception e) {
			
		}
		*/
		
	}

}
