package ex.algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class Ex029 {

	public static void main(String[] args) {
        /*
        1부터 8까지 차례대로 입력되면 ascending, 8부터 1까지 차례대로입력되면 descending, 둘다 아니라면 mixed를 출력하시오.

        예제 입력: 1 2 3 4 5 6 7 8 
        출력 ascending 7
        예제 입력: 8 7 6 5 4 3 2 1
        출력 descending -7
        예제 입력: 8 1 7 2 6 3 5 4
        출력 mixed

        출처: 백준 온라인 저지 – 음계(2920)
        */
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int result = 0;

        for (int i = 0; i < 7; i++){
            result += Integer.parseInt(arr[i+1]) - Integer.parseInt(arr[i]);
        }
        
        if (result == 7){
            System.out.println("ascending");
        } else if (result == -7){
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
	}
}
