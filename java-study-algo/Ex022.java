package ex.algorithm;

import java.util.Scanner;

public class Ex022 {

	public static void main(String[] args) {

        /*
        입력된 수가 팰린드롬인치 판별하시오
        팰린드롬은 순서를 거꾸로 읽었을 때도 원래의 문자열이나 수열과 동일한 경우를 의미합니다. 
        즉, 앞에서 읽을 때와 뒤에서 읽을 때의 모양이 같으면 팰린드롬이라고 합니다.

        예시:
        - 문자열: "radar", "level", "madam", "A man, a plan, a canal, Panama!"
        - 숫자: 121, 1221

        입력 : 12321

        정답: True
        */
        Scanner sc = new Scanner(System.in);
        // 영문 숫자가 아닐 경우 ""으로 치환 후 대문자 모두 소문자로 변환 
        String input = sc.nextLine().replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        boolean isPalindrome = true;
        int len = input.length();

        for(int i = 0; i < len/2; i++){
            if (input.charAt(i) != input.charAt(len-1-i)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);


	}
}
