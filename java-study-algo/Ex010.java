package ex.algorithm;

public class Ex010 {

	public static void main(String[] args) {
		int n = 4;
		// method1: 2중 for문 
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n + 1; j++) {
				System.out.printf("%4d", (j + n * i));
			}
			System.out.println();	
		}
		// method2: 단일 for문
		for (int i = 1; i < n * n + 1; i++)	{
			System.out.printf("%d ", i);
			if (i % n == 0) System.out.println();
		}
	}
}
