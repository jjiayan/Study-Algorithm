// 2025.8.27 

class Human {
	String name;
}

class OverClass{
	// 오버로딩 add()
	int add(int i, int j) {
		return i+j;
	}
	
	void add(Human human) { // POINT: Human 객체의 주소값을 받겠다 
		/*
		 1. add(new Human());
		 2. Human h = new Human(); h.name = "김유신"  add(h);
		 반드시 할 줄 알아야 해욥!!

		 */
		System.out.println(human.name);
		
	}
	int add(int param)	{
		return param + 100;
	}
	
	//Point
	int[] add(int[] params) { // 배열 객체의 의 주소값을 받겠다. 
		
		int[] target = new int[params.length];
		for (int i = 0; i < target.length; i++) {
			target[i] = params[i] + 1;
		}
//		return null;	// 배열은 객체다. 객체의 기본값은 null. 만들어진 배열 객체의 주소값을 리턴하겠다. 
		return target;
	}
}



public class Ex07_Array_Method {

	public static void main(String[] args) {
		// 
		OverClass overclass = new OverClass();
		int[] source = {10, 20, 30, 40, 50};
		
		int[] ta = overclass.add(source);	
		for(int value : ta) { // 개선된 for문 
			System.out.println(value);
		}
	}

}

/*
클래스를 타입으로 인정하고
class Emp{
	Car carInfo(int[] param){
		return new Car(); // 객체 주소 리턴 
	}

}





 */


