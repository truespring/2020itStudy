package ga.rubok.level3;

import java.util.Arrays;

public class MyListTest_1 {
	public static void main(String[] args) {

		MyListN list1 = new MyListN();
		list1.add(10);
		list1.add(15);
		list1.add(12);
		list1.add(16);
		list1.add(15);
		list1.add(1, 100);
		list1.add(15);
		list1.add(15);
		list1.remove(1);

//		int delVal = list.remove();
//		System.out.println(delVal);
//		int len = list.size();
//		System.out.println(len);
//		int val = list.get(1);
//		System.out.println(val);
//		val = list.get(0);
//		System.out.println(val);

	}

}

class MyListN {
	private int[] arr1;

	MyListN() {
		init1();
	}

	private void init1() {
		arr1 = new int[0];
	}

	void add(int n) {
		int temp[] = new int[arr1.length + 1];
		for (int i = 0; i < arr1.length; i++) {
			temp[i] = arr1[i];
		}
		temp[arr1.length] = n;
		;
		arr1 = temp;
		System.out.println(Arrays.toString(arr1));
	}

	void add(int idx, int n) {
		int temp[] = new int[arr1.length + 1];
		for (int i = 0; i < arr1.length; i++) {
			temp[i < idx ? i : i + 1] = arr1[i];
		}
		temp[idx] = n;
		arr1 = temp;
		System.out.println(Arrays.toString(arr1));
	}
	
	void remove(int idx) {
		int temp[] = new int[arr1.length - 1];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = arr1[i < idx ? i : i + 1];
		}arr1 = temp;
		System.out.println(Arrays.toString(arr1));
	}
	
	
}
