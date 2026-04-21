package kr.or.kosa;

import java.util.Random;
import java.util.Scanner;

public class Cinema {
	// 1. 예매하기 - 좌석 현황, 좌석 선택, 
	// 2. 예매조회
	// 3. 좌석조회
	// 4. 예매취소
	// 5. 시스템 종료 
	private String[][] seats; 
	Scanner input = new Scanner(System.in);
	
	public Cinema(int rows, int cols) {
        seats = new String[rows][cols];
        initializeSeats();
    }
	
	// 좌석 초기화 (모두 "__"로)
    private void initializeSeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = "__";  
            }
        }
    }
    
    //////////////////////////////////////////////////////////
    // 예매번호 형태 맞는지 확인. 다 숫자로 구성되어있는지 확인.
    public boolean isReservedNum(String s) {
    	try {
    		int tmp = Integer.parseInt(s);
    		return false;
    	} catch (NumberFormatException e){
//    		System.out.println("예매번호가 올바르지 않습니다.");
    		return true;
    	}
    }
    
    // 남은 빈자리 개수
    public int countBlanck() {
    	int cnt = 0;
    	for (int i = 0; i < seats.length; i++) {
    		for (int j = 0; j < seats[0].length; j++) {
    			if (seats[i][j].equals("__")) {
    				cnt++;
    			}
    		}
    	}
    	return cnt;
    }
    
    // 이미 선택된 좌석인지 여부
    public boolean isSelected(int r, int c, int[][] tmp) {
    	for(int i=0; i < tmp.length; i++) {
    		if (tmp[i][0] == r && tmp[i][1] == c) {
    			return false;
    		}
    	}
    	return true;
    }
    
    // 1. 예매하기 
    public void reserveSeat() {
    	// 원하는 구매 매수 입력받기
    	System.out.println("==========================================");
    	System.out.println("구매 매수를 선택해주세요. 최대 5매까지 구매 가능합니다.");
    	try {
    		int num = Integer.parseInt(input.nextLine());
    	
	    	// 원하는 구매 매수 > 남은 빈자리 좌석  
	    	if (num > countBlanck()) {
	    		System.out.println("구매 가능한 좌석이 부족합니다. 초기화면으로 이동합니다.");
			// 1~5 범위 이내일 경우     
	    	} else if (num > 0 && num <= 5) {
	    		printSeats();
	    		System.out.println("좌석을 선택해주세요. 예)1-1");
	        	System.out.println("이미 예매된 좌석은 [예매]라고 표시됩니다.");
	        	// tmpSeats -1로 초기화. 2차원 배열에 들어가는 모든 숫자 -1.
	        	int[][] tmpSeats = new int[num][2];
	        	for (int i = 0; i < tmpSeats.length; i++) {
	        		tmpSeats[i][0] = -1;
	        		tmpSeats[i][1] = -1;
	        	}
	        	int cnt = 0;
	        	while(cnt < num) {
	        		String s = input.nextLine();
	        		String[] sarr = s.split("-");
	            	int r = 0;
	            	int c = 0;
	            	try {
	            		r = Integer.parseInt(sarr[0]);
	                	c = Integer.parseInt(sarr[1]);
	                	
	                	if (seats[r][c].equals("__") && isSelected(r, c, tmpSeats)) {
	            			// 1. 좌석 예매 가능한 경우: 빈좌석 && 선택되지 않은  -> 일단 임시 예매배열에 넣어두기 cnt++;
	            			tmpSeats[cnt][0] = r;
	            			tmpSeats[cnt][1] = c;
	            			cnt++;
	            		} else if (!isSelected(r, c, tmpSeats) || !seats[r][c].equals("__") ) {
	            			// 2. 이미 예매된 좌석을 경우: 다시 골라.
	            			System.out.println("이미 예약된 좌석입니다. 다시 좌석을 선택해주세요. 예)1-1");
	            		} else if (isReservedNum(seats[r][c])) { 
	            			// 3. 입력 형태 잘못되었을 경우: 다시 골라.
	            			System.out.println("잘못된 입력입니다. 다시 좌석을 선택해주세요. 예)1-1");
	            		}
	                	
	            	// 입력 형태 잘못되었을 경우
	            	} catch (NumberFormatException e){
	            		System.out.println("입력한 좌석번호가 올바르지 않습니다. 초기화면으로 이동합니다.");
	            		return;
	            	} catch (ArrayIndexOutOfBoundsException e){
	            		System.out.println("입력한 좌석번호가 올바르지 않습니다. 초기화면으로 이동합니다.");
	            		return;
	            	}
	        		
	        	}
	        	// num개 다 선택한 후, 예매 진행 유무 
	        	System.out.printf("예매 가능한 %d개 좌석을 모두 선택했습니다. 예매를 진행할까요?", num);
	        	System.out.println();
	        	System.out.println("네(1), 아니오(2), 초기화면(0)중 하나를 입력해주세요.");
	    		int s2 = Integer.parseInt(input.nextLine());
	    		switch(s2) {
	    			// 예매 진행 
	    			case 1:
	    				// 예매번호 생성 
	    				Random rand = new Random();
	    		    	String ran = Integer.toString(rand.nextInt(8) + 1);
	    				for(int i = 0; i < 7; i++) {
	    					ran += Integer.toString(rand.nextInt(9));
	    				}
	//    				seats[r][c] = ran;
	    				System.out.println("예매가 완료되었습니다.");
	    				System.out.print("예매한 좌석번호: \t");
	    				for (int i = 0; i < tmpSeats.length; i++) {
	    					// 좌석값에 예매번호 ..
	    					seats[tmpSeats[i][0]][tmpSeats[i][1]] = ran;
	    					System.out.printf("[%d-%d]\t", tmpSeats[i][0], tmpSeats[i][1]);
	    				}
	    				System.out.println();
	    				System.out.println("예매번호: [" + ran + "]");
	    				System.out.println("감사합니다.");
	    				break;
	    			// 예매 안함. 
	    			case 2:
	    				System.out.println("예매를 진행하지 않습니다.");
	    				break;
	    			// 초기화면 
	    			case 0:
	    				System.out.println("초기화면으로 돌아갑니다.");
	    				break;
	    		}
	    	} else {
	    		System.out.println("구매 매수가 구매 가능 범위를 벗어났습니다. 초기화면으로 이동합니다.");
	    	}
    	} catch (NumberFormatException e) {
    		System.out.println("잘못된 입력입니다. 초기화면으로 이동합니다.");
    		return;
    	}
	}
    //////////////////////////////////////////////////////////
    // 예매번호 입력받고 형태 맞는지 확인
    public String checkReserveNum() {
    	System.out.println("예매번호를 입력해주세요.");
    	// 예매번호 입력 
        String reserve_num = input.nextLine();
        
        if (isReservedNum(reserve_num)) {
        	
        }
        // 맞게 입력한 경우. 예매번호 출력.
        return reserve_num;
    }
    // 2. 예매조회 
    public String[] searchReservation() {
    	System.out.println("예매번호를 입력해주세요.");
    	// 예매번호 입력 
    	String reserve_num = input.nextLine();
    	// 잘못 입력한 번호일 경우. 예약번호 정확하지 않음 출력. 1. 예약번호 다시 입력 0. 초기화면으로 return 
		if (isReservedNum(reserve_num)) {
			System.out.println("예약번호가 정확하지 않습니다. 초기화면으로 돌아갑니다.");
		} else {
			// 임시 배열. 예매가능 매수 최대 5매 
	        String[] tmparr = new String[5]; 
	        // 예매번호 유무 확인 
	        boolean is_true = false;     
	        int cnt = 0;
	        // 예약번호와 같은 자릿값 모두 구함. 
	        for (int i = 0; i < seats.length; i++) {
	            for (int j = 0; j < seats[i].length; j++) {
	            	if (seats[i][j].equals(reserve_num)) {
	            		tmparr[cnt] = i + "-" + j;
	            		cnt++;
	            		System.out.printf("고객님이 예매하신 좌석은 %s입니다.", i + "-" + j);
	                	System.out.println();
	                	is_true = true;
	            	} 
	            }
	        } 
	        String[] reserved = new String[cnt];
	        for (int i = 0; i < cnt; i++) {
	        	reserved[i] = tmparr[i];
	        }
	        // 예매번호 없는 경우 
	        if (!is_true) {
	        	System.out.println("고객님은 예매한 번호가 없습니다.");
	        	// 빈 배열 (null?) 출
//	        	return null;
	        }
	        // 예매번호 있고, 좌석번호 들어있는 배열 출력.
	        return reserved;
		}
		return null;
    }
    
    //////////////////////////////////////////////////////////
    // 3. 좌석조회 - 좌석현황 출력 
    public void printSeats() {
        System.out.println("******** 좌석 현황 ********");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
            	// 좌석값 길이가 3보다 클 경우(예매번호) -> [예매]로 출
            	if (seats[i][j].length() > 2) {
            		System.out.print("[예매]");
            	} else { // 나머진 좌석값 = "__" (빈자리) -> [i-j] 형태로 출
            		System.out.printf("[%d-%d]", i, j);
            	}
            }
            System.out.println();
        }
        System.out.println("*************************");
    }
    
    //////////////////////////////////////////////////////////
    // 4. 예매 취소 
    public void cancelReservation(String[] s) {
    	
//    	String s = searchReservation();
    	if (s.length > 0) {
    		System.out.println("예매를 취소하시겠습니까?");
        	System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");
            String continue_reserve = input.nextLine();
            
            // 네(1): 예매취소. 
            if (continue_reserve.equals("1")) {
            	for (String value: s) {
            		String[] tmparr = value.split("-");
            		seats[Integer.parseInt(tmparr[0])][Integer.parseInt(tmparr[1])] = "__";
            	}
            	System.out.println("예매가 취소되었습니다. 감사합니다.");
            // 아니오(2): 예매 취소 x
            } else if (continue_reserve.equals("2")){
            	System.out.println("예매를 취소하지 않았습니다.");
        	// 나머지: 초기화면으로 
            } else {
            	System.out.println("잘못된 번호를 누르셨습니다. 초기화면으로 돌아갑니다.");
            }
    	}
    }
    
    // 5. 시스템 종료
    public void exitSystem() {
    	initializeSeats();
        System.out.println("시스템을 종료합니다.");
        System.exit(0);
    }
    
    public static void main(String[] args) {
        Cinema cinema = new Cinema(4, 5); 
        String[] tmp = new String[0];
        while(true) {
        	// 초기화면 
        	System.out.println();
        	System.out.println("*************************");
            System.out.println("***** 영화 예매 시스템 *****");
            System.out.println("*************************");
            
            System.out.println("1. 예매하기");
            System.out.println();
            System.out.println("2. 예매조회");
            System.out.println();
            System.out.println("3. 좌석조회");
            System.out.println();
            System.out.println("4. 예매취소");
            System.out.println();
            System.out.println("5. 시스템종료");
            System.out.println();
            
            Scanner sc = new Scanner(System.in);
            try {
	            int menu = Integer.parseInt(sc.nextLine());
	            
	            switch(menu) {
	            	// 1. 예매하기 
	            	case 1:
	            		cinema.reserveSeat();
	                	break;
	                	
	            	// 2. 예매조회 
	            	case 2:
	            		tmp = cinema.searchReservation();
	            		break;
	            		
	            	// 3. 좌석조회 
	            	case 3:
	            		cinema.printSeats();
	            		break;
	            		
	            	// 4. 예매취소 
	            	case 4:
	            		tmp = cinema.searchReservation();
	            		cinema.cancelReservation(tmp);
	            		break;
	            		
	            	// 5. 시스템 종료 
	            	case 5:
	            		cinema.exitSystem();
	            	default:
	            		System.out.println("잘못된 입력입니다. 다시 메뉴를 선택해주세요.");
	            }
            } catch (NumberFormatException e) {
            	System.out.println("잘못된 입력입니다. 다시 메뉴를 선택해주세요.");
            }
        }
    }	
}
