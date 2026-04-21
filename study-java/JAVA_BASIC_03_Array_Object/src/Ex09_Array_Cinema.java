import java.util.Random;

public class Ex09_Array_Cinema {

	public static void main(String[] args) {
		String[][] seat = new String[3][5];
		Random r = new Random();	// 나오는 난수값에 대해 정수값, 실수값을 뽑을 수 있음 
		
		String ran = Integer.toString(r.nextInt(8) + 1);
		for(int i = 0; i < 7; i++) {
			ran += Integer.toString(r.nextInt(9));
		}
		System.out.println("예매번호: " + ran);
		
		/*
		 [][][][][]
		 [][][][][]
		 [][][][][]
		 */
		// 좌석 초기화
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "__"; // 빈의자 배치 
			}
		}
		
		//
		seat[2][1] = "홍길동";
		seat[0][0] = "김유신";
		seat[2][2] = ran;
		
		// 예매 현황 
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j].equals("__")? " 좌석 ":seat[i][j]);
			}
			System.out.println();
		}
		
		// 예매(어떤 좌석 선택을 했을 때, [행][열] 예매 가능 여부
		int row, col;
		row = 1;
		col = 0;
		
		if(seat[row][col].equals("__")) {
			System.out.println("예매 가능해요.");
		} else {
			System.out.println("이미 예매 되었습니다.");
		}
		
		// 예매 종료(영화 시작)
		// 좌석 초기화 
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "__"; // 빈의자 배치 
			}
		}
		
		
	}

}
