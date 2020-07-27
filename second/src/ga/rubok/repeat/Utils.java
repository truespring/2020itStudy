package ga.rubok.repeat;

import java.util.Arrays;

public class Utils {
	public static int parseStringToInt(String str, int para) {
		int result = para;
		try {
			result = Integer.parseInt(str);
		} catch (Exception e) {
		}
		return result;
	}

	public static int parseStringToInt(String str) {
		return parseStringToInt(str, 0);
	}

//	public static int[] sortASC(int[] arr) {
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}return arr;
//
//	}
//	
//	public static int[] sortDESC(int[] arr) {
//		for (int i = arr.length - 1; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				if(arr[j] < arr[j + 1]) {
//					int temp = arr[j + 1];
//					arr[j + 1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}return arr;
//	}

	public static void sortASC(int[] arr) {
		sort(arr, true);
	}

	public static void sortDESC(int[] arr) {
		sort(arr, false);
	}

	private static void sort(int[] arr, boolean asc) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (asc == (arr[j] > arr[j + 1])) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static int getRandom(int sArr, int eArr) {
		int a = (int) (Math.random() * (eArr - sArr + 1) + sArr);
		return a;
	}

	public static int[] createRandomArr(int sArr, int eArr, int idx) {
		int[] arr = new int[idx];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getRandom(sArr, eArr);
		}
		return arr;
	}

	public static int[] createRandomArrNoDuplication(int sArr, int eArr, int idx) {
		if (idx > (eArr - sArr + 1)) {
			return null;
		}
		int[] arr = new int[idx];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getRandom(sArr, eArr);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		return arr;
	}

	public static void printArr(int[] arr) {
		if (arr == null) {
			System.out.println("arr is null");
		} else {
			System.out.println(Arrays.toString(arr));
		}
	}

}
