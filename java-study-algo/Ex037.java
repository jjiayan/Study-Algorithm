package ex.algorithm;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex037 {

    static List<String[]> arr;
    static int rows, cols;

	public static void main(String[] args) {
        /*
        입력된 단지의 수와 각 단지의 세대수를 출력하시오 (33번 색칠과 유사)

        입력:
        00011
        00001
        10000
        11000
        11011

        정답: 3 // 단지수
             3 5 2 // 단지의 세대수

        Tag: 재귀, Recursive function
        */
        Scanner sc = new Scanner(System.in);
        arr = new ArrayList<>();
        
        while(sc.hasNextLine()){
            String tmp = sc.nextLine();
            if (tmp == ""){break;}
            String[] row = tmp.split("");
            arr.add(row);
        }
        rows = arr.size();
        cols = arr.get(0).length;
        
        // 시작점 찾기 -> 재귀 돌리기 
        int cnt = 0;
        String result = "";
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (arr.get(i)[j].equals("1")){
                    result += func(i, j) + " ";
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        System.out.println(result);
	}

    static int func(int r, int c) {
        // 범위 체크 
        if (r < 0 || c < 0 || r >= rows || c >= cols) return 0;
        if (arr.get(r)[c].equals("0")) return 0;

        arr.get(r)[c] = "0";
        int count = 1;
        count += func(r-1, c);
        count += func(r+1, c);
        count += func(r, c-1);
        count += func(r, c+1);
        return count;
    }    
		
}
