package java.study;
import java.util.Scanner;

public class Ex01_Study {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		double random = Math.random();

		int random_value = (int)(random * 100);
		System.out.println(random_value);
		int cnt = 1;
		
		System.out.println("1~100 사이의 숫자를 맞춰보세요!");
		while(true) {
			System.out.printf("숫자를 입력하세요: ");
			int value = Integer.parseInt(sc.nextLine());

			if(value > random_value) {
				System.out.println("더 작은 수입니다.");
			} else if(value < random_value) {
				System.out.println("더 큰 수입니다.");
			} else {
				System.out.printf("정답입니다. %d번 만에 맞추셨네요!", cnt);
				System.out.println();
				break;
			}
			cnt++;
		}
		
	}

}
