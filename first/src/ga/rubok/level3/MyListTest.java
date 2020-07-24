package ga.rubok.level3;

import java.util.Arrays;

// 파일명과 같은 class에만 public만 붙일 수 있음
public class MyListTest {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(12);

		MyArrays.print(list);
		MyArrays.print(list);

		String str = MyArrays.toString(list);
		System.out.println("str : " + str);

		int delVal = list.remove();
		System.out.println(delVal);
		int len = list.size();
		System.out.println(len);
		int val = list.get(1);
		System.out.println(val);
		val = list.get(0);
		System.out.println(val);

	}
}

class MyArrays {

	static String toString(MyList list) {
		String str = "";
		for(int i = 0; i < list.size(); i++) {
			if(i > 0) {
				str += ", ";
//				str = str + ", ";
				}
				str += list.get(i);
		}
		return String.format("[%s]", str);
		//return "[" + str + "]";
	}

	static void print(MyList list) {
//		System.out.println(toString(list));
		System.out.print("[");
		for (int i = 0; i < list.size(); i++) {
//			System.out.printf(i < list.size() - 1 ? "%d, " : "%d]", list.get(i));
			System.out.print(list.get(i));
			if (i == list.size() - 1) {
				System.out.println("]");
			} else {
				System.out.print(", ");
			}
		}
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

	int remove(int n) {
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i < n ? i : i + 1];
		}
		int delVal = arr[n];
		arr = temp;
		return delVal;
	}

	int remove() {
		return remove(arr.length - 1);
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
		for (int i = 0; i < temp.length; i++) {
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
