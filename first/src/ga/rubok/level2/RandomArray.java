package ga.rubok.level2;

public class RandomArray {
	public static void main(String[] args) {
//		1~10 랜덤숫자
//		증복 안 됨, 오름 차순

		int n = 10;
		int[] arr = new int[n];
		int max = 10;
		int min = 1;

		for (int i = 0; i < arr.length; i++) {
			int rVal = (int) (Math.random() * (max - min + 1) + min);
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 0) {
					arr[j] = rVal;
					break;
				} else if(arr[j] == rVal){
					i--;
					break;
				}
			}
		}

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");

	}

}
