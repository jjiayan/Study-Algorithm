package ex.algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class Ex025 {

	public static void main(String[] args) {
        /*
        입력 n에 따른 달팽이 모양의 숫자를 출력하시오
        예제 입력: 5

        출력
        1  2  3  4   5
        16 17 18 19  6
        15 24 25 20  7
        14 23 22 21  8
        13 12 11 10  9
        */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[n][n];

        int[] dx = {0, 1, 0, -1}; // 오른쪽, 아래, 왼쪽, 위
        int[] dy = {1, 0, -1, 0};
        int dir = 0; // 현재 방향
        int x = 0, y = 0; // 시작 위치

        for (int cnt = 1; cnt <= n * n; cnt++) {
            arr[x][y] = cnt;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 0) {
                x = nx;
                y = ny;
            } else {
                // 범위 벗어나면 방향 전환 
                dir = (dir + 1) % 4; 
                x += dx[dir];
                y += dy[dir];
            }
        }
        
        for(int i=0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
	}
}
