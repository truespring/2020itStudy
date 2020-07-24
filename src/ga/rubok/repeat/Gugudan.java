package ga.rubok.repeat;
// 파일명과 클래스 명이 같을 때 public을 붙일 수 있음
public class Gugudan {
	public static void main(String[] args) {
//		gugudan(2, 5);

//		int sum = sum(1, 2);
//		System.out.println(sum);
//		sum = sum(1, 2, 3);
//		System.out.println(sum);
//		sum = sum(1, 2, 3, 4,5, 6, 7, 8,9, 10, 11, 12);
//		System.out.println(sum);

//		int result = Utils.parseStringToInt("10", 0);
//		System.out.println(result);
//		result = Utils.parseStringToInt("aa10", 1);
//		System.out.println(result);
//		result = Utils.parseStringToInt("aa10");
//		System.out.println(result);
//		result = Utils.parseStringToInt("9");
//		System.out.println(result);
		
//		int[] arr = {4, 5, 11, 223, 3, 10};
//		
//		Utils.sortASC(arr);
//		Utils.printArr(arr);
//		Utils.sortDESC(arr);
//		Utils.printArr(arr);
		
//		int[] rArr = Utils.createRandomArr(1, 9 ,5);
//		Utils.printArr(rArr);
//		rArr = Utils.createRandomArr(5, 15 ,10);
//		Utils.printArr(rArr);
//		rArr = Utils.createRandomArrNoDuplication(5, 15, 11);
//		Utils.printArr(rArr);
//		rArr = Utils.createRandomArrNoDuplication(5, 15, 12);
//		Utils.printArr(rArr);
		
		String star = makeStarTriangle(5);
		System.out.println(star);
	}
//	ui에 바로 찍기 위해서는 이런 식으로 해야한다
	static String makeStarTriangle(int num) {
		String str = "";
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				str += "*";
			}str +="\n";
		}return str;
	}
	

	static void gugudan(int sdan, int edan) {
		for (int i = sdan; i <= edan; i++) {
			for (int j = 1; j < 10; j++) {
				int result = i * j;
				if (result % 2 == 0) {
					System.out.printf("%d * %d = %d\n", i, j, result);
				}
			}
		}
	}

	public static int sum(int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}

