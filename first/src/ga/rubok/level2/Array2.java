package ga.rubok.level2;

public class Array2 {
	public static void main(String[] args) {
		// 2차원 배열
		int[][] arr = new int[2][3];

		int[][] arr2 = { 
				{ 10, 20, 30 }, // 0,0 / 0,1 / 0,2
				{ 12, 13, 14, 11 }, // 1,0 / 1,1 / 1,2
				};
		
		System.out.println(arr.length); // 중괄호의 개수
		System.out.println(arr2.length);
		
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + ", ");
			}
			System.out.println();
		}
	}

}
