package ga.rubok.level3;

import java.util.Arrays;

public class MyListTest_2 {
	public static void main(String[] args) {
		MyListt list2 = new MyListt();
		list2.add(1);
		list2.add(1);
		list2.add(1);
		list2.add(1);
		list2.add(1, 20);
		list2.add(1, 22);
		list2.add(1, 24);
		list2.remove(0);
		list2.remove();
		
		System.out.println(list2.size());
		System.out.println(list2.get(1));
		
//		MyArrayS.printt(list2);
	}

}
class MyListt {
	private int[] arr2;
	
	MyListt(){
		init();
	}
	
	private void init(){
		arr2 = new int[0];
	}
	
	void add(int n) {
		int[] temp = new int[arr2.length + 1];
		for(int i = 0; i < arr2.length; i++) {
			temp[i] = arr2[i];
		}temp[arr2.length] = n;
		arr2 = temp;
		System.out.println(Arrays.toString(arr2));
	}
	
	void add(int idx, int n) {
		int[] temp = new int[arr2.length + 1];
		for(int i = 0; i < arr2.length; i++) {
			temp[i < idx ? i : i + 1] = arr2[i];
		}temp[idx] = n;
		arr2 = temp;
		System.out.println(Arrays.toString(arr2));
	}
	
	void remove(int idx) {
		int[] temp = new int[arr2.length - 1];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = arr2[i < idx ? i : i + 1];
		}arr2 = temp;
		System.out.println(Arrays.toString(arr2));
	}
	
	void remove() {
		remove(arr2.length - 1);
	}
	
	int size() {
		return arr2.length;
	}
	
	int get(int idx) {
		return arr2[idx];
	}
	
}

//class MyArrayS{
//	static void printt(MyListt list){
//		System.out.print("[");
//		for(int i = 0; i < list.size(); i++) {
//			System.out.printf(i < list.size() - 1 ? "%d, " : "%d]\n", list.get(i));
////			System.out.printf(i < list.size() - 1 ? "%d, " : "%d]", list.get(i));
//		}
//	}
//}