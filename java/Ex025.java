package ex.algorithm;

import java.util.Scanner;

public class Ex025 {

	public static void main(String[] args) {
        /*
        더하기 사이클
        N이 주어졌을 때 N 의 사이클의 길이를 구하시오 (1 ≤  N < 100)
        입력 26
        정답 4
        풀이 26 → 2 + 6 = 8 → 68
            68 → 6 + 8 = 14 → 84
            84 → 8 + 4 = 12 → 42
            42 → 4 + 2 = 6 → 26

        태그: 반복문, if
        */
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int result = input;
        int len = 0;
        while(true){
            result = result % 10 * 10 + (result / 10 + (result % 10)) % 10;
            len++;
            if (input == result){break;}
        }
        System.out.println(len);
	}
}
