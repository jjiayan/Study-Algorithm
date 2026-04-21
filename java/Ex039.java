package ex.algorithm;

import java.util.Scanner;

public class Ex039 {

	public static void main(String[] args) {
        /*
        정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
        1+1+1+1
        1+1+2
        1+2+1
        2+1+1
        2+2
        1+3
        3+1
        정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

        예제입력: 
        4
        7
        10
        출력
        7
        44
        274
        문제 출처: 백준

        */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        System.out.println(func(n));


	}

    public static int func(int n) {
        if (n <= 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        return func(n-1) + func(n-2) + func(n-3);    
    } 
		
}
