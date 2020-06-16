package ga.rubok.level2;

public class ArrayOrder3 {
	public static void main(String[] args) {
		// 버블정렬
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };

		for (int i = arr.length - 1; i > 0 ; i--) { // 횟수
			for (int j = 0; j < i ; j++) { // 정렬 횟수 (j, j+1 을 비교함)
				if (arr[j] > arr[j + 1]) {
					int a = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = a; // 큰 값을 제일 뒤로 밀어넣음 > 점차 횟수가 줄어듦
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

}
