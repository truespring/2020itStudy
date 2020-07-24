package ga.rubok.level2;

import java.util.Arrays;

public class ArrCopy {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 7, 10 };
		int[] arr2 = new int[arr.length];
		int[] arr3 = null;
		
		for(int i = 0 ; i < arr.length; i++) {
			arr2[i] = arr[i]; // 배열 복사
		}

		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		 
		arr3 = arr; // 주소 값을 복사
		System.out.println(arr == arr3);
		if(arr3 != null) {
			System.out.println("arr3 : " + Arrays.toString(arr3));
		}
		

	}

}
