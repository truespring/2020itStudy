package ga.rubok.practice.mission;

public class Mission9 {
	public static void main(String[] args) {
		int[] arr = new int[10]; // 배열 선언
		int sum = 0; // 합계 초기화

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 2; // 배열에 객체 입력
		}

		for (int i = 0; i < arr.length; i++) {
			if(i < arr.length) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}

	}

}
