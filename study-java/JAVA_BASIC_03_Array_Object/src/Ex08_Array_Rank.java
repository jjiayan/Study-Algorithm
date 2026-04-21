
public class Ex08_Array_Rank {

	public static void main(String[] args) {
		/*
		 다차원 배열(2차원) 
		 [행][열] 
		 
		 일상생활 속 행열: 영화관 좌석, PC방 좌석, 지도  좌표값, 오목, 엑셀 등 
		 */
		int[][] score = new int[3][2];
		score[0][0] = 100;
		score[0][1] = 200;
		
		score[1][0] = 300;
		score[1][1] = 400;
		
		score[2][0] = 500;
		score[2][1] = 600;
		
		// 중첩 for문
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[0].length; j++) { // 카페에 있는 그림을 보고 이해하길 ..
				System.out.printf("score[%d][%d] = [%d] \t", i, j, score[i][j]);
			}
			System.out.println();
		}
		
		int[][] score2 = new int[][] {{11, 12}, {13, 14}, {15, 16}};
		
		// Quiz time
		// 개선된 for문을 사용해서 2차원 배열 -> index를 따로 설정할 순 없음 	
		for(int[] row: score2) {
			for(int col: row) {
				System.out.println(col);
			}
		}
		
		
		
	}

}
