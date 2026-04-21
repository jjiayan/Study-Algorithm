package ex.algorithm;

import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int result1 = 0;
		int result2 = 0;
		
		for (int i = 0; i < input.length(); i++) {
			// method1: ascii code 48: 0 - 57: 9
			result1 += input.charAt(i) - 48 ; 
			// method2: Character.getNumericValue()
			result2 += Character.getNumericValue(input.charAt(i));
		
		}
		System.out.println(result1);
		System.out.println(result2);
		
		int input1 = Integer.parseInt(input);
		int result3 = 0;
		int tmp = 0;
		while(input1 > 0) {
			result3 += input1 % 10;
			input1 /= 10;
		}
		System.out.println(result3);
	}

}
