package ex.algorithm;

import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {
		/*
		입력된 숫자의 개수를 출력하라
		입력: 421314218
		정답:  
		0: 0
		1: 3
		2: 2
		3: 1
		4: 2
		5: 0
		6: 0
		7: 0
		8: 1
		9: 0
		
		Tag
		반복문 (for 혹은 while), 배열, %
		 */
		Scanner sc = new Scanner(System.in);
//		String input = "421314218";
		String input = sc.nextLine();
		int[] arr = new int[10];
		for (int i = 0; i < input.length(); i++) {
			arr[Character.getNumericValue(input.charAt(i))]++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d: %d", i, arr[i]);
			System.out.println();
		}
	}

}
