//import java.util.Scanner;

import java.util.Scanner; // 해당 코드에 필요한 import 하려면 command + shift + o 하면 자동 import 생김


public class Ex11_Statement_Quiz {

	public static void main(String[] args) {
//		// quiz1
//		// 메뉴를 보여주고 사용자가 선택
//		// 원하는 메뉴를 선택하지 않으면 강제로 다시 메뉴를 보여주세요
//		
//		// 1. 예금
//		// 2. 출금
//		// 3. 잔고
//		// 4. 종료 조건 판단 while 탈출
//		
//		// 잔액 변수를 생성(balance)
//		// 예금처리 + 누적
//		// 출금처리 - 누적
//		// 잔고 balance 출력
//		// 종료 프로그램 끝(함수의 종료, 프로그램의 강제 종료);
//		// 논리적 종료(return (x), exit(x) 안되요)
//		
//		Scanner sc = new Scanner(System.in);
//		int action = 0, balance = 0, tmp = 0;
//		
//		while(true) {
//			System.out.println("1.예금, 2.출금, 3.잔고, 4.종료 ");
//			System.out.println("원하시는 메뉴(번호)를 선택하세요.");
//			action = Integer.parseInt(sc.nextLine());
//			
//			if(action == 1) {
//				// 예금
//				System.out.println("예금할 금액을 입력하세요.");
//				tmp = Integer.parseInt(sc.nextLine());
//				balance += tmp;
//				System.out.printf(">> [%d]원을 예금했습니다. ", tmp);
//				System.out.println();
//			} else if(action == 2) {
//				// 출금 
//				System.out.println("출금할 금액을 입력하세요.");
//				tmp = Integer.parseInt(sc.nextLine());
//				balance -= tmp;
//				System.out.printf(">> [%d]원을 출금했습니다. ", tmp);
//			} else if(action == 3) {
//				// 잔고 
//				System.out.printf(">> 현재 잔고는 [%d]원 입니다.", balance);
//				System.out.println();
//			} else if(action ==4) {
//				// 종료 
//				System.out.println(">> 작동을 종료합니다.");
//				break;
//			} else {
//				continue;
//			}
//			
//		}
		
		// quiz2) 조별 가위바위보 게임, 짧은 코딩 
//		double random = Math.random();
//		System.out.println(random);	 // 0 <= random < 1
//		random = (3*random+1); // 1 <= random < 4
//		System.out.println((int)random);
		
		Scanner sc = new Scanner(System.in);
		int action = 0;
		
		System.out.println("=====================================");
		System.out.println("가위(1), 바위(2), 보(3) 게임을 시작합니다. ");
		System.out.println("게임은 컴퓨터를 이길 때까지 계속됩니다.");
		System.out.println("=====================================");
		while(true) {
			// 컴퓨터 
			double random = Math.random();
			random = (3*random+1);
			// user 
			System.out.println("> user님 입력하세요. ");
			action = Integer.parseInt(sc.nextLine());
			System.out.printf("> 컴퓨터: %d, user: %d", (int)random, action);
//			// 방법 1
//			// 비길 경우 
//			if((int)random == action) {
//				System.out.println("> 비겼습니다");
//			// 이길 경우1. user 가위(1), 컴퓨터 보(3) 
//			} else if(action == 1 && random == 3) {
//				System.out.println("> 축하합니다. 당신은 컴퓨터를 이겼습니다.");
//				System.out.println("> 게임을 종료합니다.");
//				break;
//			// 이길 경우2. user 값 > 컴퓨터 값 
//			} else if(action > random) {
//				System.out.println("> 축하합니다. 이겼습니다.");
//				System.out.println("> 게임을 종료합니다.");
//				break;
//			// 나머지, 질 경우 
//			} else {
//				System.out.println("> 당신은 컴퓨터에게 지셨습니다.");
//			}
			// 방법 2
			if((int)random == action) {
				System.out.println("> 비겼습니다");
			// 이길 경우1. user 가위(1), 컴퓨터 보(3) 
			} else if(((action - (int)random) == -2) || (((action - (int)random) == 1))) {
				System.out.println("> 축하합니다. 당신은 컴퓨터를 이겼습니다.");
				System.out.println("> 게임을 종료합니다.");
				break;
			// 나머지, 질 경우 
			} else {
				System.out.println("> 당신은 컴퓨터에게 지셨습니다.");
			}
		}
	

	}

}
