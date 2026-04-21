/*
현업 개발에서
한개의 클래스만 설계하는 경우는 없음. 

설계도 1장 모든 업무를 구현 ... 현실적으로 불가능
설계도를 여러장으로 나눈다 ... 고민(기준, 논리적)


쇼핑몰
결제관리, 배송관리 재고관리, 회원관리, 상품관리, 판매처 관리, 카드 관리 >> 업무별 설계도 

DB: 관계 (1:1, 1:N, M:N) 3가지 >> M:N(책:저자) > 1:N

***********기준************
여러개의 설계도가 있을 때 관계 기준

1. 상속 >>  is ~ a: 은(는) ~이다
2. 포함 >> has ~ a: 은(는) ~ 가지고 있다 

원은 도형이다
원 extends 도형

삼각형은 도형이다
삼각형 extends 도형 

원, 점 관계
원은 점이다(x)

원은 점을 가지고 있다.(o)
has ~ a(부품)

>> class 원 {점이라는 부품이 member field 구현}
>> class 점 {x, y}

원은 도형이다
삼각형은 도형이다
사각형은 도형이다

도형(분모) 공통적 자원: 추상화, 일반화 >> 그리다, 색상 
원은 구체화, 특수화 (특징) >> 반지름, 한점 

점 (좌표값) (x, y)
원은 점을 가지고 있다
삼각형은 점을 가지고 있다
사각형은 점을 가지고 있다

class Shape { 그리다, 색상 } // 부모 > 상속 
class Point { 좌표값 } // 부품 	 > member field

 */

class Shape{
	String color = "gold";
	void draw() {
		System.out.println("도형을 그리다");
	}
}

class Point{
	int x;
	int y;
	
	Point()	{
//		this.x = 1;
//		this.y = 2;
		this(1, 2);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

/*
(문제)
원을 만드세요 (원의 정의: 원은 한점과 반지금을 가지고 있다)
1. 원은 도형이다 (is ~ a) : Shape
2. 원은 점을 가지고 있다 (has ~ a) : Point
3. 원은 특수화되고 구체화된 내용은 : 반지금

원의 반지름은 초기값 10을 가진다
점의 좌표는 초기값 (10, 15) 를 가진다
초기값을 설정하지 않으면 반지름과 점의 값을 입력받을 수 있다
위에서 드린 Shape, Point 그대로 활용 
*/

class Circle extends Shape{ // 1. 원은 도형이다 (is ~ a) : Shape
	Point point;	// 2. 원은 점을 가지고 있다 (has ~ a) : Point
	int r; // 구체화, 특수화 
	
	Circle() {
		// this.point = new Point(10, 15); // 점의 좌표는 초기값 (10, 15) 를 가진다
		// this.r = 10; // 점의 좌표는 초기값 (10, 15) 를 가진다
		this(new Point(10, 15), 10);
	}
	
	Circle(Point point, int r){
		this.point = point;
		this.r = r;
	}
}

/*
 (문제)
 삼각형 클래스를 만드세요삼각형은 3개의 점과 색상과 그리고 그리다 기능을 가지고 잇다.
 hint) Shape, Point 제공 받아서 설계도를 작성하세요 
 hint) (x, y), (x, y), (x, y)
 default 삼각형을 만들 수 있고 3개의 좌표값을 받아서 그릴 수 있다 
 
 */

class Triangle extends Shape{

	Point[] parr;
	
	Triangle() {
		this(new Point[] {new Point(1, 1), new Point(1, 2), new Point(2, 1)});
	}
	
	Triangle(Point[] parr) {
		this.parr = parr;
	}
}

public class Ex02_Inherit_Composition {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println(circle.r);
		System.out.println(circle.color);
		System.out.println(circle.point.x);
		System.out.println(circle.point.y);
		circle.draw();
		
		// 반지름, 점의 값을 내가 원하는대로
		Point point = new Point(10, 20);
		Circle circle2 = new Circle(point, 100);
		
		Triangle triangle = new Triangle();
		System.out.println(triangle.color);
		System.out.printf("x: (%d, %d)\t y: (%d, %d)\t, z: (%d, %d)\n", triangle.parr[0].x, triangle.parr[0].y, triangle.parr[1].x, triangle.parr[1].y, triangle.parr[2].x, triangle.parr[2].y);
		triangle.draw();
		
		
	}

}
