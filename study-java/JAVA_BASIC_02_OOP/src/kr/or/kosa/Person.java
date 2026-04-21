package kr.or.kosa;

// 클래스의 구성요소
// 속성 + 기능
// member field(고유, 상태, 부품) + method(기능,행위) + constructor(생성자 함수)
public class Person {
	public String name;	// instance variable, 생성되는 객체마다 생성, 다른 값을 가질 수 있다. 
	public int age;		// default value(기본값) = 0
	public boolean power; // defulat value = false 
	
	// method 
	public void personPrint() {
		System.out.printf("이름은 %s, 나이는 %d, 파워는 %s 입니다. \n", name, age, power);
	}
}

/*
1.  instance variable 초기화하지 않아도 된다 > why > default값이 있으니까 
	초기화: 변수가 처음으로 값을 할당 받는 것 
	
2.  instance variable 초기화 해도 됨? > YES > why > 
	public int age = 1; 필요에 따라서는 기본값(초기값) 설정이 가능하다. -> 사실 기본값 설정하려면 상수로 해도 됨.
	
3.  Today's Point: 왜 굳이 초기화를 잘 하지 않을까? > public int age = 1
	생성되는 객체마다 (사람)마다 다른 나이를 가지고 있지 않을까 설계자가 생각한 것. 
 
 
 
*/
