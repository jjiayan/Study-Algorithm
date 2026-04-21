package ex.algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class Ex035 {

    static String result;

	public static void main(String[] args) {
        /*
        입력된 수를 높은 자릿수 부터 출력하시오(재귀로) 
        2312

        정답:
        2
        3
        1
        2
        */
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        func(input);
        
	}

    public static void func(int x) {
        if (x < 10) {
            System.out.println(x);
            return;
        }
        func(x / 10);
        System.out.println(x % 10);
    }
		
}
