/*
void m(int x){
	x 값 출력: 100
	x = 11111; // 함수 끝나면 필요없어지는 값. 
}
m(100);

call by value
함수의 parameter 값을 전달 or 주소값 전달(참조값) Ref 전달 

class Car {}

void m2(Car c) {	// parameter c는 Car라는 타입을 갖는 객체의 주소값을 받는다. 
	c.carName = "포드"; 
}

Car car = new Car();

m2(car); // call by reference. call by ref.
car.carName > 포드 // 값 전달 
 */

class Data {
	int i;
	
}


public class Ex10_Method_Call {
	
	static void scall(Data sdata) { // Data 타입을 가지는 객체의 주소값을 받겠다. 0x...
		System.out.println("함수: " + sdata.i);
		sdata.i = 1111;
		
	}
	
	static void vcall(int x) { // 값 정수값을 받겠다
		System.out.println("before x: " + x);
		x = 8888;
		System.out.println("after x: " + x);
	}
	
	public static void main(String[] args) {
		Data d = new Data();	// d라는 변수: 0xabc번지 
		d.i = 100;
		System.out.println("d.i: " + d.i);
		
		Ex10_Method_Call.scall(d); // 본인 함수. 같은 클래스 내의 함수는 클래스 안써줘도 됨. scall(d);로 해도 됨 
		System.out.println("d.i: " + d.i);
		
		Ex10_Method_Call.vcall(d.i); // 1111
		
		// 함수에서 값을 전달, 주소값을 전달의 차이 
		// call by value , call by ref 
		// 원칙 모든 함수의 실행: stack 메모리 
	}

}
