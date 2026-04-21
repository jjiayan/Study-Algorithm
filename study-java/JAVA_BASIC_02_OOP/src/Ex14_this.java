/*
this 이것
1. 객체 자신을 가리키는 this (앞으로 생성될 객체의 주소를 담을 곳이라고 가정)
>> 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장될 곳

2. this 객체 자신(주소): 생성자 호출(원칙적으로 생성자는 객체 생성시 한개만 호출)
					 단, this를 사용하면 예외. this를 활용하면 여러개의 생성자를 호출할 수 있다. 





 */

class Test5 {// extends Object{ 가 원래 숨겨져 있음 
	int i;
	int j;
	
	Test5(){ // default constructor
		
	}
	
	/*
	유지보수, 가독성, 단순, 반복..
	Test5(int n, int k){
		i = n;
		j = k;
	)
	 */
	
	Test5(int i, int j){
		this.i = i; 
		this.j = j;
	}
	
}

class Book2{
	String bookName;
	
//	Book2(String name){ // 가독성 안좋아요!!
//		bookName = name;
//	}
	
	Book2(String bookName){
		this.bookName = bookName;
	}
	
}


// Today's Point
// 생성자를 호출하는 this(*** 중복된 코드를 감소시킬 수 있음 ***) 

class Socar{
	String color;
	String gearType;
	int door;
	
	Socar(){ // 기본 옵션 
		this.color = "red";
		this.gearType = "auto";
		this.door = 2;
		
	}
	
	Socar(String color, String gearType, int door){ // 기본 옵션 
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
	}
	
	void soCarPrint() {
		System.out.println(this.color + ", " + this.gearType + ", " + this.door);
	}
}

public class Ex14_this {

	public static void main(String[] args) {
		Socar socar = new Socar(); // 기본차량 
		socar.soCarPrint();
		
		Socar socar2 = new Socar("gold", "auto", 6); // 옵션
		socar2.soCarPrint();
		

	}

}
