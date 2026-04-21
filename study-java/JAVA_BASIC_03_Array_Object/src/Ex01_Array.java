/*

배열은 객체다(Array)
1. new를 통해서 생성 (주소값을 가짐)
2. heap 메모리 생성(관리된다)
3. 정적배열(고정배열) : 배열은 한번 선언하면(크기가 정해지면) 크기를 변경할 수 없다 <-> 동적배열(Collection: API 클래스)
4. 자료구조(알고리즘): 제어문 + 결합 >> 기초적인 자료구조 

 */

import java.util.Arrays;
import java.util.Iterator;

public class Ex01_Array {

	public static void main(String[] args) {
		int s, s2, s3, s4;
		int s5;
		int s6;
		int s7;
		// 같은 타입의 변수 여러개를 선언해서 사용하는 것 나빠요 bad..
		
		// 배열
		int[] score = new int[5]; 
		// score(101동) >> 101호, 102호, 103호
		// int 타입을 가지는 방 5개 만든 것. >> heap에 >> 연속된 공간에 >> 방이름 index(첨자) >> [0][1][2][3][4] 
		
		System.out.println(score[0]);
		
		// 직접 접근해 값 넣는 방법 
		score[0] = 100;
		score[1] = 200;
		score[2] = 300;
		score[3] = 400;
		score[4] = 500;
		
		// score[5] = 600; // -> ArrayIndexOutOfBoundsException
		
		System.out.println(score[3]);
		// Array 방에 있는 모든 값을 한번에 출력해봐 
		// 배열과 궁합 잘맞는 제어문: for 문
		for(int i = 0; i < 5; i++) {
			System.out.printf("[%d] = %d\t", i, score[i]); // [0] = 100	[1] = 200	[2] = 300	[3] = 400	[4] = 500	
		}
		System.out.println();
		
		// 배열은 객체다. 
		// 사용자가 만드는 모든 배열은 Object를 상속. 
		for(int i = 0; i < score.length; i++) { // array.length : 배열 길이 
			System.out.printf("[%d] = %d\t", i, score[i]);
		}
		System.out.println();
		
		// java.util.Arrays
		// for문을 몰라도 Arrays 헬퍼 클래스 >> 초보자는 최대한 사용을 자제하자!(초급자 접근금지) 
		String resultArray = Arrays.toString(score);
		System.out.println(resultArray); // [100, 200, 300, 400, 500]
		
		// 주말(버블 정렬, 퀵 정렬 연습하기) - 시험에 자주 나오니까 연습하길 ^_____^ 
		// 초급 시험 - 버블정렬 swap 
		
		// Today's Point (암기!!)**
		// 3가지
		int[] arr = new int[5];
		int[] arr2 = new int[] {10, 20, 30, 40, 50 }; // 초기값을 통해서 배열의 개수를 정의하고 값을 할당 
		int[] arr3 = {11, 22, 33}; // 컴파일러가 알아서 new cjrl ...
		
		// Tip (javascript) const arr = [1, 2, 3, 4, 5]; let arr = [] arr.push(10), arr.pop()
		// javascript는 다 동적배열. 
		
		// 배열은 버릴게 없다. 모두 암기하도록!!
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		// 배열은 객체다
		int[] arr4; // null (주소값) 메모리를 가지고 있지 않음 
		arr4 = new int[] {1, 2, 3, 4, 5};
		System.out.println(arr4); // [I@5caf905d
		
		int[] arr5 = arr4;	// 주소값 할당. arr4와 arr5은 같은 주소값을 갖는다.
		System.out.println(arr4 == arr5); // true
		
		// 배열의 타입은 몇가지 ? 8 + 1 + 클래스 등등..
		String[] strarr = new String[] {"가", "나", "다", "라"};
		for (int i = 0; i < strarr.length; i++) {
			System.out.println(strarr[i]);
		}
		
		char[] carr = {'A', 'B'};
		float[] farr = {3.14f, 0.12f};
		
		// Today's Point 객체배열
		Car[] cars = new Car[3];
		cars[0] = new Car();	// 
	}

}

class Car{
	int door;	
}
