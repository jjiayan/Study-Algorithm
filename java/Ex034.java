package ex.algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class Ex034 {

	public static void main(String[] args) {
        /*
        입력된 항의 피보나치 수를 구하시오 (재귀)
        6
        정답: 8
        */
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        System.out.println(fibo(input));
	}

    public static int fibo(int x) {
        if (x == 1 | x == 0) {
            return x;
        }
        return fibo(x-1) + fibo(x-2);
    }
		
}
