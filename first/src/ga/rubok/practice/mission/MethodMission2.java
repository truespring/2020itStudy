package ga.rubok.practice.mission;

public class MethodMission2 {
	public static void main(String[] args) {
		printStar(6);

		printStar(3);

		printStarSqure(4);

		printStarTriangle(5);

		printStarTriangleReverse(5);

		printStarPyramid(5);
	}

	public static void printStarSqure(int num) {
		for (int i = 0; i < num; i++) {
			printStar(num);
		}
	}

	public static void printStarTriangle(int num) {
		for (int i = 1; i <= num; i++) {
			printStar(i);
		}
	}

	public static void printStarTriangleReverse(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			printStar(i);
		}
	}
	
	 public static void printChar(char ch, int cnt){
	 	for(int i = 0; i < cnt; i++){
	 		System.out.print(ch);
	 		}
	 }
	 /*
	 public static void printStarTriangleReverse(int num){
	 	for(int i = num - 1; i >= 0; i--){
	 		printChar(' ', i)
	 		printStar(num - i)
	 	}
	 }
	 */

	public static void printStarPyramid(int num) {
		for(int i = 1 ; i <= num ; i ++) {
			for(int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < i - 1 ; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

	public static void printStar(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
