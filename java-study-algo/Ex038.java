package ex.algorithm;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex038 {

    public static void chicken(int coupon, int k, int ate) {
        int i = coupon / k;
        int j = coupon % k;
        int l;
        int m;
        l = ate + i;
        m = i + j;
        if(m < k){
            System.out.println(l);
            return;
        }
        chicken(m, k, l);
    }

	public static void main(String[] args) {
        /*
        강민이는 치킨 한 마리를 주문할 수 있는 치킨 쿠폰을 n장 가지고 있다.
        이 치킨집에서는 치킨을 한 마리 주문할 때마다 도장을 하나씩 찍어주는데,
        도장을 k개 모으면 치킨 쿠폰 한 장으로 교환할 수 있다.

        강민이가 지금 갖고 있는 치킨 쿠폰으로 치킨을 최대 몇 마리나 먹을 수 있는지 구하여라.
        단, 치킨을 주문하기 위해서는 반드시 치킨 쿠폰을 갖고 있어야 한다.

        * 입력: n k
        * 출력: 정답
        
        * 예제 입력:
        4 3
        10 3
        100 5

        * 출력:
        5
        14
        124

        */
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        
        // chicken(n*k, k, 0);
        System.out.println(func(n, k) + n);


	}

    public static int func(int n, int k) {
        if (n < k) return 0;
        return func((n / k) + (n % k), k) + n / k;
    } 
		
}
