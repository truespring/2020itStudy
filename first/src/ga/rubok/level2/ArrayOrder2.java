package ga.rubok.level2;

public class ArrayOrder2 {
	public static void main(String[] args) {
		// 선택정렬
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		int least;

		for (int i = 0; i < arr.length - 1; i++) { // i는 index의 기준이 됨
			for (int j = i + 1; j < arr.length; j++) { // j는 i번째 index와 비교하기 위한 index
				if (arr[i] > arr[j]) { // 가장 작은 index를 찾기 위해 반복
					least = j;
				} else {
					least = i;
				}
				if (least != i) { // 가장 작은 index를 찾은 다음 0번째부터 바꿔줌
					int a = arr[least];
					arr[least] = arr[i];
					arr[i] = a; // 작은 값을 찾아놨다가 순서로 차례대로 넣음
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

}
