package ex.algorithm;

public class Ex013 {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", (i + 2*j));
			}
			System.out.println();
		}

	}

}
