package ex.algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class Ex032 {

	public static void main(String[] args) {
        /*
        입력된 두 수까지의 합을 구하시오
        1 4

        정답: 10
        Tag
        재귀, Recursive function
        */
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        System.out.println(sum(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
	}

    public static int sum(int a, int b) {
        if (b <= a) {
            return a;
        }
        return sum(a, b-1) + b;
    }
		
}
