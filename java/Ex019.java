package ex.algorithm;

import java.util.Scanner;

public class Ex019 {

	public static void main(String[] args) {
        /*
        다음 입력 n의 m승의 결과를 출력하시오
        입력: 5 3
        정답:  125

        Tag
        반복문 (while, for)
        */
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int result = 1;

        while(m-- > 0){
            result *= n;
        }
        System.out.println(result);
	}
}
