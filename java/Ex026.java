package ex.algorithm;

import java.util.Scanner;

public class Ex025 {

	public static void main(String[] args) {
        /*
        상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 
        예를 들어, 734과 893을 칠판에 적었다면, 
        상수는 이 수를 437과 398로 읽는다. 
        따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

        예제 입력: 734 893
        예제 출력: 437

        출처: 백준 (2908번)
        */
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("");
        String tmp = "";
        int n = 0;
        
        for (int i = arr.length - 1; i >= 0; i--){
            if (arr[i].equals(" ")){
                n = Integer.parseInt(tmp);
                tmp = "";
                System.out.println(n);
            } else {
                tmp += arr[i];
            }
        }
        
        System.out.println(n > Integer.parseInt(tmp) ? n: Integer.parseInt(tmp));
        
	}
}
