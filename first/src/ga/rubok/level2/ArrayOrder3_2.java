package ga.rubok.level2;

public class ArrayOrder3_2 {
	public static void main(String[] args) {
		// 버블정렬
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		
		for(int i = arr.length - 1; i > 0 ; i --) {
			for(int j = 0 ; j < i ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}for (int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + ", ");
		}
		
	}

}
