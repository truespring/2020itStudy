package ga.rubok.level2;

public class Foreach {
	public static void main(String[] args) {
		
		int[] arr = {3, 10, 44, 10, 90, 76, 100};
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			int val = arr[i];
			System.out.print(val + " ");
		}
	}

}
