
public class Ex03_Array_For {

	public static void main(String[] args) {
		/* Today's Point
		   for문 > 향상된 for문, 개선된 for문
		   
		   JAVA      : for(Type 변수명: 배열 or Collection) {}
		   C#        : for(Type 변수명 in 배열 or Collection) {}
		   javascript: for( let ... in ) {} ... of 
		 */
		
		int[] arr = {5, 6, 7, 8, 9};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 개선된 for문
		for(int value : arr) { // 배열이 갖고 있는 값을 뽑아줌
			System.out.println(value);
		}
		
		String[] strarr = {"A", "B", "C", "D", "FFFF"};
		for(String value : strarr) {
			System.out.println(value);
		}
		
	}

}
