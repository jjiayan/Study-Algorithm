/*
static member field: 객체간 공유 자원
static method: 객체간 공유 자원. 

1. 설계도
1.1 static 자원(변수, 함수)
static 함수 사용 이유 
- 객체 생성 없이 사용 (메모에 다 올라가 있으니까)
- 편하고 빠르게 
- ** 많이 사용하니까 굳이 new 할 필요 없음 : System.out (static)
- 이 자원을 많이 사용할 것 같아 -> new 없이 쓰게 해줄
- 메모리 입장에선 살짝 부담스러운 자원일 수 있음 
 */

class StaticClass{
	int iv;
	
	static int cv;
	
	static void print() {
		System.out.println("static method");
	}
	
	void printIv() {
		// 일반함수
		// StaticClass new heap 메모리에 올라갔을 때 사용 가능 
		
		// cv 건드릴 수 있음. 메모리에 있기 때문. 순서상 static이 올라가고 따라서 올라가지 때문.
		cv = 100; 
		
	}
}
// 끼리끼리 놀아라. 일반함수끼리 static 함수끼리~~
// static 자원과 일반자원의 공생관계를 알아야 함. 


public class Ex08_Static_Method {
	public static void main(String[] args) {
		StaticClass.print(); // 객체 생성 없이도 접근 가능
		StaticClass sc = new StaticClass();
		sc.printIv();
		System.out.println(sc.cv); // 100
	}
}
