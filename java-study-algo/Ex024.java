package ex.algorithm;

import java.util.Scanner;

public class Ex024 {

	public static void main(String[] args) {
        /*
        평균은 넘겠지
        학생들과 점수들이 순서대로 입력된다. 평균보다 넘은 학생들의 비율을 출력하시오

        입력 : 7 100 95 90 80 70 60 50
        정답: 57.143.%
        태그: 반복문, if문
        */
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int sum = 0;
        int[] arr2 = new int[n];

        for (int i = 1; i < n; i++){
            arr2[i-1] = Integer.parseInt(arr[i]);
            sum += arr2[i-1];
        }
        double avg = (double) sum / n;

        double result = 0;
        for (int v: arr2){
            if(v > avg){
                result++;
            }
        }
        System.out.printf("%.3f %%", result * 100 / 7);
        System.out.println();
        
	}
}
