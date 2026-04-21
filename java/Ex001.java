/*
1. 학생정보들을 저장하고, 학생이름으로
 검색했을때 학번을 출력하는 프로그램 작성.

Student 클래스 생성
String name, no를 가짐 (이름과 학번)

학생들을 ArrayList에 저장1

검색을 하겠느냐 y
종료하고싶으면 n

학생이름이있는경우 그학생의 학번을 출력 
학생이름이 없으면, 없는 학생이름이라고 출력

태그
 while, flag, ArrayList, foreach(개선된 for문) 
 */


package ex.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Student{
	private String name;
	private String no;
	private List<String[]> student = new ArrayList<>();
	
	// 생성자  test 
	public Student(String name, String no){
		super();
		this.name = name;
		this.no = no;
	}	
	
	// getter
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	// setter
	public String setName() {
		return name;
	}
	
	public String setNo() {
		return no;
	}
	
}

public class Ex001 {

	public static void main(String[] args) {
		
		Student str1 = new Student("손오공", "1004");
		Student str2 = new Student("저팔계", "1005");
		Student str3 = new Student("사오정", "1006");
		
		List<Student> list = new ArrayList();
		list.add(str1);
		list.add(str2);
		list.add(str3);
		
		for(Student st: list) {
			System.out.println(st.getName());
			System.out.println(st.getNo());
		}
		
		
		////////////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		System.out.println("검색을 하려면 y, 종료를 원하면 n을 입력해주세요.");
		
		while(true) {
			String input = sc.next();
			if (input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = sc.next();
				boolean flag = false;
				
				for(Student st:list) {
					if(st.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은: " + st.getNo());
						flag = true;
					} 
				}
				if(!flag) {
					System.out.println("해당하는 학생이름이 없습니다.");
				}
				
			} else if(input.equals("n")) {
				break;
			}
		}
		System.out.println("종료되었습니다.");
		
		
//		HashMap<String, Student> map = new HashMap();
//		map.put("김가연", new Student("김가연", "0001"));
//		map.put("방성일", new Student("방성일", "0002"));
//		map.put("배지수", new Student("배지수", "0003"));
//
//		
//		while(true) {
//			System.out.println("*************************************");
//			System.out.println("검색을 하려면 y, 종료를 원하면 n을 입력해주세요.");
//			String input = sc.nextLine();
//			if (input.equals("n")) {
//				System.out.println("종료합니다.");
//				break;
//			} else if (input.equals("y")){
//				System.out.println("학생 이름을 입력해주세요.");
//				String n = sc.nextLine();
//				// 학생 이름 있는 경우 그 학생 학번 저장
//				if (map.containsKey(n)) {
//					// 학번 출력 
//					Student sd = map.get(n);
//					System.out.println(n + "학생의 학생번호는 " + sd.no + "입니다.");
//				}else {
//					// 학생 이름 없는 경우 없는 학생 이름이라 출력
//					System.out.println("없는 학생 입니다. ");
//					
//				}
//				
//			}
//		}

	}
	
}
