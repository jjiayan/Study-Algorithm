package ex.algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class Ex031 {

	public static void main(String[] args) {
        /*
        입력된 수의 팩토리얼을 구하시오
        5
        정답: 120

        Tag
        재귀, Recursive function
        */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(fac(n));
	}

    public static int fac(int n) {
        if (n <= 1){
            return 1;
        }
        return n * fac(n - 1);
    }
		
}
