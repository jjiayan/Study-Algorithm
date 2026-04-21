package ex.algorithm;

import java.util.Scanner;

public class Ex021 {

	public static void main(String[] args) {

        /*
        1~100까지의 숫자가 띄어쓰기를 두고 입력 될 때 
        한번이라도 입력되었으면 중복이 없게끔 출력하라
        
        입력 1 2 3 1 1 2 3 4 5 5
        출력 1 2 3 4 5
        */
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[101];

       for(String val: sc.nextLine().split(" ")){
            arr[Integer.parseInt(val)]++;
        }
       
       for(int i = 1; i < arr.length; i++){
          if (arr[i] > 0){
               System.out.println(i);
          }
       }
	}
}
