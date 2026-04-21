import java.util.Scanner;

public class Practice_Flowchat {

	public static void main(String[] args) {
		
		int u = 10000;
		int s = 0;
		
		Scanner sc = new Scanner(System.in);
		int money = Integer.parseInt(sc.nextLine());
		System.out.println(money);
		
		while(u > 1) {
			int num = (int)(money/u);
			System.out.printf("%d %d개", u, num);
			System.out.println();
			
			money -= u * num;
			if (s == 0) {
				u /= 2;
				s = 1;
			} else {
				u /= 5;
				s = 0;
			}
			
			
		}
		System.out.printf("1 %d개\n", money);
		
	}

}
