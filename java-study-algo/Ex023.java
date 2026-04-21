package ex.algorithm;

import java.util.Scanner;

public class Ex023 {

	public static void main(String[] args) {
        /*
        입력된 문자열을 뒤집어서 출력하시오
        입력 : ADEFH
        정답: HFEDA

        Tag 반복문 (while, for), Array
        */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // method1: 문자열 거꾸로 출력
        for(int i = input.length() - 1; i >= 0; i--){
            System.out.print(input.charAt(i));
        }
        System.out.println();

        // method2: array
        char arr[] = input.toCharArray();
        char tmp;
        int len = arr.length;

        for (int i = 0; i < len / 2; i++){
            tmp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = tmp;
        }
        System.out.println(new String(arr));

	}
}
