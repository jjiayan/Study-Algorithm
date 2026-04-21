package ex.algorithm;

import java.util.Scanner;

public class Ex018 {

	public static void main(String[] args) {
        /*
        다음 입력 n을 받아 아래와 같은 *을 출력하시오
        입력: 5

        정답:  
            *
           **
          ***
         ****
        *****
        */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i < n+1; i++){
            System.out.println(" ".repeat(n-i) + "*".repeat(i));
        }
	}
}
