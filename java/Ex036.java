package ex.algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class Ex036 {

    static String result;

	public static void main(String[] args) {
        /*
        입력된 수를 이진수로 변환하세요 (재귀)
        17
        정답: 10001
        */
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        func(input);
        System.out.println();
        
	}

    public static void func(int x) {
        if (x < 2) {
            System.out.print(x);
            return;
        }
        func(x / 2);
        System.out.print(x % 2);
    }
		
}
