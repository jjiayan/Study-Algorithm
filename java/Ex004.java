package ex.algorithm;

public class Ex004 {

	public static void main(String[] args) {
		int num = 19;
		String tmp = "";
		while(num > 0) {
		    tmp += num % 2;
		    num /= 2;
		}

//		String[] result = tmp.split("");
//		for (int i = result.length-1; i >= 0; i--) {
//			System.out.print(result[i]);
//		}
		for (int i = tmp.length() - 1; i >= 0; i--) {
			System.out.print(tmp.charAt(i));
		}

	}

}
