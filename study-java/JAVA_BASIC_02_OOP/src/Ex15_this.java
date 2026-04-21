/*
원칙: 객체를 생성할 때 생성자는 1개만 호출 가능 (new Car(), new Car(10))

그런데 this를 사요하면 생서앚를 호출 > 생성자가 가지고 있는 parameter 개수와 타입을 맞추면 호출됨 ...








 */

/* (1차 코드)
class Zocar{ // 같은 패키지 내에서 클래스 이름 같으면 안됨 
	String color;
	String gearType;
	int door;
	
	Zocar(){ // 기본 옵션 
		this.color = "red";
		this.gearType = "auto";
		this.door = 2;
		
	}
	
	Zocar(String color, String gearType, int door){ // 옵션 
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
	}
	
	void soCarPrint() {
		System.out.println(this.color + ", " + this.gearType + ", " + this.door);
	}
}
*/

// (2차 코드)
class Zocar{ // 같은 패키지 내에서 클래스 이름 같으면 안됨 
	String color;
	String gearType;
	int door;
	
	Zocar(){ // 기본 옵션 
		this("red", "auto", 2);	// 내가 나를 다시 부르네 . 파라미터 3개를 가지고. 
		System.out.println("default");
		
	}
	
	Zocar(String color, String gearType, int door){ // 옵션 
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("overloading");
	}
	
	void soCarPrint() {
		System.out.println(this.color + ", " + this.gearType + ", " + this.door);
	}
}

class Zocar2{ // 같은 패키지 내에서 클래스 이름 같으면 안됨 
	String color;
	String gearType;
	int door;
	
	Zocar2(){ // 기본 옵션 
		this("red", 2);	// 내가 나를 다시 부르네 
		System.out.println("default");
		
	}
	
	Zocar2(String color, int door){ // 옵션 
		this(color, "auto", door);
		System.out.println("overloading1");
	}
	
	Zocar2(String color, String gearType, int door){ // 모든 옵션에 대해 변경 가능 
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("overloading2");
	}
	
	void soCarPrint() {
		System.out.println(this.color + ", " + this.gearType + ", " + this.door);
	}
}

public class Ex15_this {
	public static void main(String[] args) {
		Zocar car = new Zocar();
		// overloading
		// default
		
		car.soCarPrint(); // red, auto, 2
		
		Zocar car2 = new Zocar("pink", "auto", 4);
		car2.soCarPrint();
		// overloading
		// pink, auto, 4
		

	}
}
