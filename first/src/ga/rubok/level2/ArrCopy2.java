package ga.rubok.level2;

import java.util.Arrays;

public class ArrCopy2 {
	public static void main(String[] args) {
//		주소는 다르고 객체는 같아지게 하는 메소드
		int[] arr = { 2, 4, 6, 7, 10 };
		
		int[] arr2 = copyArr(arr);
		
		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));
	}
	
	public static int[] copyArr(int[] sArr) {
		int[] copyArr = new int[sArr.length]; // new 는 객체를 만들어 내는 것
		for(int i = 0; i < sArr.length; i++) {
			copyArr[i] = sArr[i];
		}
		return copyArr;
	}

}
