package ga.rubok.level2;

public class ArrayOrder {
	public static void main(String[] args) {
		// 순차정렬
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) { // i번째를 나머지 index와 비교함
				if (arr[i] > arr[j]) {
					int a = arr[j];
					arr[j] = arr[i];
					arr[i] = a; // 상시 비교하여 작은 값을 바로 제일 앞에 넣음
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}

	}

}
