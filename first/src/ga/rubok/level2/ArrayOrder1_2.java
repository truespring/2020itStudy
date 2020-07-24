package ga.rubok.level2;

public class ArrayOrder1_2 {
	public static void main(String[] args) {
		// 순차정렬
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
	}

}
