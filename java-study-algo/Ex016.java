package ex.algorithm;

import java.util.Scanner;

public class Ex016 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// int n = 5;
        int n = Integer.parseInt(sc.nextLine());
        String result = "";

        while(n-- > 0){
            result += "*";
            System.out.println(result);
        }
	}

}
