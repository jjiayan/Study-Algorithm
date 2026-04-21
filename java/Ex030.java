package ex.algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class Ex030 {

	public static void main(String[] args) {
        /*
        입력된 숫자까지 + - 를 차례대로 반복하시오
        예제 입력: 9
        출력 1+2-3+4-5+6-7+8-9
        */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int cur = 1;

        while (cur < n){
            if (cur % 2 != 0){
                System.out.printf("%d+", cur);
            } else {
                System.out.printf("%d-", cur);
            }
            cur++;
        }
        System.out.println(n);
	}
}
