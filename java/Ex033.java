package ex.algorithm;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex033 {

    static List<String[]> arr;
    static int rows, cols;

	public static void main(String[] args) {
        /* 재귀로 
        00000
        00110
        00001
        00000
        00100

        0을 모두 2로 색칠하시오.
        (단, 0은 어떻게든 모두 연결됨)

        정답:
        22222
        22112
        22221
        22222
        22122
        */
        // 2차원 배열 받기. 배열 길이 모른 상태로 
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
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (arr.get(i)[j].equals("0")){
                    func(i, j);
                    break;
                }
            }
        }

        // 출력
        for (int i = 0; i < arr.size(); i++){
            for (int j = 0; j < arr.size(); j++){
                System.out.print(arr.get(i)[j]);
            }
            System.out.println();
        }
	}
	
    static void func(int r, int c) {
        // 범위 체크 
        if (r < 0 || c < 0 || r >= rows || c >= cols) return;
        if (!arr.get(r)[c].equals("0")) return;

        arr.get(r)[c] = "2";
        func(r-1, c);
        func(r+1, c);
        func(r, c-1);
        func(r, c+1);
    }    
}
