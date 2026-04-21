package ex.algorithm;

import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {
        /*
        다음 입력 n을 받아 아래와 같은 *을 출력하시오.
        입력: 5
        정답: 

        *****
         ****
          ***
           **
            *
        Tag: 반복문(while, for)
        */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String result1 = "";
        String result2 = "";
        for (int i = 0; i < n; i++){
            result2 += "*";
        }

        for (int i = 0; i < n; i++){
            System.out.println(result1 + result2.substring(i));
            result1 += " ";
        }
	}
}
