package ex.algorithm;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(fac(Integer.parseInt(sc.nextLine())));
		
	}
	
	static int fac(int x) {
		if (x <= 1) return 1;
		return x * fac(x - 1);
	}

}
