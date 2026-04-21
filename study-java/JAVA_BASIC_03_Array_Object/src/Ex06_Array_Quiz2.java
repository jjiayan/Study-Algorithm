
public class Ex06_Array_Quiz2 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		// 1. 1~45 까지의 난수를 발생시켜서 6개의 정수값을 배열에 담으세요
		// 2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요 (중복값 검증)
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			int tmp = (int)(Math.random() * 45) + 1;
			boolean is_true = true;
			
			if (i == 0) {
				arr[i] = tmp;
			} else {
				for (int j = 0; j < i; j++) {
					if (tmp == arr[j]) {
						is_true = false;
						break;
					}
				}
			}
			
			if (is_true) {
				arr[i] = tmp;		
				System.out.println("arr[" + i + "]: " + arr[i]);
			} else {
				i--;
			}
		}
			
			

		// 3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요(정렬 : 자리바꿈 : swap)
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					System.out.printf("i: %d, j: %d ", i, j);
					printArray(arr);
				}	
			}	
		}
		
		// 4. 위 결과를 담고있는 배열을 출력하세요
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	// 배열 출력 메서드
    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}
