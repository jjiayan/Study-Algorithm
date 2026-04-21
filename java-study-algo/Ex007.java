package ex.algorithm;

public class Ex007 {

	public static void main(String[] args) {
		/*
		입력된 수 가 소수인지 판별하시오
		13
		정답: 13은 소수입니다.
		
		Tag
		반복문 (for, while), if
		*/
		
		int n = 13;
		if (isprime(n)) System.out.println(n + "은 소수입니당.");
		else System.out.println(n + "은 소수 아닙두.");


	}
	
	public static boolean isprime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = num-1; i > 1; i--) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
		
}
