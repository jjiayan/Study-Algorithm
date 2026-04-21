package ex.algorithm;

import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		
		
		for (int i = 1; i < 10; i++) {
			for (int j = Integer.parseInt(arr[0]); j < Integer.parseInt(arr[1]) + 1; j++) {
				System.out.printf("%d * %d = %d \t", j, i, j*i);
			}
			System.out.println();
		}
		

	}

}
