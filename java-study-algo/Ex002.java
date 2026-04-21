package ex.algorithm;



public class Ex002 {
	
	public static void main(String[] args) {
		
		
		int[] fibo = new int[20];
		for (int i = 0; i < fibo.length; i++) {
			if (i == 0 || i == 1) {
				fibo[i] = 1;
				continue;
			} 
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		for(int v: fibo) {
			System.out.print(v + " ");
		}
		
		
	}
}
