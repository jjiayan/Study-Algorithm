package ex.algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class Ex028 {

	public static void main(String[] args) {
        /*
        입력받은 10진수를 n진수로 변환시키시오.
        예제 입력: 19 16
        출력 13
        */
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int num = Integer.parseInt(arr[0]);
        int base = Integer.parseInt(arr[1]);
        String result = "";
        
        while(true){
            int tmp = num / base;
            int tmp2 = num % base;
            if (tmp == 0){break;}
            if (base == 16 && tmp2 > 9){
                result += (char)(tmp2+55);
            } else{
                result += tmp2 + "";
            }
            num = tmp;
        }

        if (base == 16 && num > 9){
            result += (char)(num+55);
        } else {
            result += num + "";
        }
        
        for (int i = result.length()-1; i >= 0; i--){
            System.out.print(result.charAt(i));
        }
        System.out.println();
	}
}
