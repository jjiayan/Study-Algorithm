package java.study;
import java.util.Scanner;



public class Ex01_Study2 {
	
	public static int v1;
	public static int v2;
	public static int v3;
	
	public static void main(String[] args) {
		
		// 첫번째 숫자 		
		v1 = (int)(Math.random() * 15) + 1;
		
		// 두번째 숫자 
		while (true) {
			v2 = (int)(Math.random() * 15) + 1;
			if (v1 != v2) {
				break;
			}
		}
		
		// 세 번째 숫자 (v1, v2와 달라야 함)
		while (true) {
			v3 = (int)(Math.random() * 15) + 1;
			if (v3 != v1 && v3 != v2) {
				break;
			}
		}
		
		// 오름차순 정렬 (swqp) 
		if (v1 > v2) {
			int tmp = v1;
			v1 = v2;
			v2 = tmp;
		}
		if (v1 > v3) {
			int tmp = v1;
			v1 = v3;
			v3 = tmp;
		}
		if (v2 > v3) {
			int tmp = v2;
			v2 = v3;
			v3 = tmp;
		}
		
		System.out.printf("%d %d %d", v1, v2, v3);
		
	}

}
