package kr.or.kosa.utils;

import java.io.IOException;

/*
설계도 

A 팀장
B 팀원 

A 팀장: 클래스를 한개 만들어 줄테니 사용시 예외처리를 하고 써. (불신 -> 강제할 수 있는 방법 찾기) 
B 팀원: 그런데 예외처리를 하지 않아도 문제 없어요. 

A 팀장은 고민했다. 예외 강제 >> throws >> try ~ ... 강제 


 */

public class ExClass {
	public ExClass(String path) throws IOException, NullPointerException { // 생성자 사용시 예외처리 해줘. 
		System.out.println("path: " + path);
	}
}
