package ex.algorithm;

import java.util.Scanner;

public class Ex040 {

    static int[] memo = new int[10001];

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
        
        System.out.println(topDown(n));
        System.out.println(bottomUp(n));


	}

    // Top-Down: memoization
    public static int topDown(int n){
        if (n <= 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        if (memo[n] != 0) return memo[n];

        memo[n] = topDown(n - 1) + topDown(n - 2) + topDown(n - 3); 
        return memo[n];
    }
    
    // Bottom-Up: 작은 값부터, for문 
    public static int bottomUp(int n){
        int[] dp = new int[n + 1];

        dp[1] = 1;
        if (n >= 2) dp[2] = 2;
        if (n >= 3) dp[3] = 4;

        for (int i = 4; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }
}
