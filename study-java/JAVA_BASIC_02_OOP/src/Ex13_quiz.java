// 2025.8.26 
/*
(Quiz) 시나리오 만들기
자동차 영업소입니다.
영업사원은 고객에게 자동차를 팔려고 합니다. 
고객은 자동차의 기본 사양을 살 수도 있고... 여러가지 선택 옵션을 선택할 수도 있습니다.
자동차의 기본은
문의 개수 4개, 자동차의 색상 기본은 red 4개가 기본입니다.
그런데 고객은
문의 개수만 변경 가능하고, 자동차의 색상 기본은 red로 할 수 있고
문의 개수는 기본으로 하고 자동차의 색상 변경 가능하고
문의 개수와 자동차의 색상 모든 변경 하여 차를 구매할 수 있습니다.

자동차 구매
1. 기본사양
2. 옵션: 문 변경, 자동차의 색상 기본
3. 옵션: 자동차의 색상 변경, 문 기본
4. 옵션: 자동차의 색상 변경, 문 변경

4가지 중에 1가지 강제..
이런 시나리오  



 */


class Car8 {
	String carcolor;
	int door;
	
	public Car8() {
		carcolor = "blue";
		door = 4;
	}
	
	public Car8(int num) {
		carcolor = "blue";
		door = num;
	}
	
	public Car8(String color) {
		carcolor = color;
		door = 4;
	}
	
	public Car8(int num, String color) {
		carcolor = color;
		door = num;
	}
	
}

public class Ex13_quiz {

	public static void main(String[] args) {
		// 기본사항
		Car8 car = new Car8();
		
		// 고객
		Car8 car2 = new Car8(1, "pink");
		
	}

}
