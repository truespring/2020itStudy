package ga.rubok.level3;

import java.util.Arrays;

// 파일명과 같은 class에만 public만 붙일 수 있음
public class MyListTest {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(12);
		list.add(16);
		list.add(15);
		list.add(15);
		list.add(15);
		list.remove(2);
		list.remove();
		list.remove();

		int len = list.size();
		System.out.println(len);
		int val = list.get(1);
		System.out.println(val);
		val = list.get(0);
		System.out.println(val);

	}
}

class MyList {
	private int[] arr;

	MyList() {
		init();
	}

	private void init() {
		arr = new int[0];
	}

	void remove(int n) {
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			if (i == n || i > n) {
				temp[i] = arr[i + 1];
			} else {
				temp[i] = arr[i];
			}
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}

	void remove() {
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}

	void add(int n) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = n;
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}

	void add(int n1, int n2) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i <= arr.length; i++) {
			if (i == n1) {
				temp[i] = n2;
			} else if (i > n1) {
				temp[i] = arr[i - 1];
			} else {
				temp[i] = arr[i];
			}
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}

	int size() {
		return arr.length;
	}

	int get(int n) {
		return arr[n];
	}

}
