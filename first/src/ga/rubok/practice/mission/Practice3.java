package ga.rubok.practice.mission;

public class Practice3 {
	public static void main(String[] args) {
		int len = 9;
		int[] arr = new int[len];

		int min = 1;
		int max = 9;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (max - min + 1) + 1);
			int a = arr[i];
			for(int j = 0; j < i ; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

}
