package ga.rubok.level2;

public class ArrayOrder2_2 {
	public static void main(String[] args) {
		// 선택정렬
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		
		int least;
		for(int i = 0; i < arr.length - 1; i++) {
			least = i;
			for(int j = i + 1 ; j < arr.length; j++) {
				if(arr[least] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[least];
					arr[least] = temp;
				}
			}
		}for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + ", ");
		}
		
	}

}
