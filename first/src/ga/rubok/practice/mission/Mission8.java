package ga.rubok.practice.mission;

import java.util.Scanner;

public class Mission8 {
	public static void main(String[] args) {
		
		int max = 80;
		int min = 10;
		
		System.out.printf("랜덤값 %d ~ %d을 입력하세요.\n", min, max);
		int ran = (int) (Math.random()*(max - min + 1) + min);
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("값 입력 : ");
			int input = sc.nextInt();
			if (input < min || input > max) {
				System.out.println("잘 못 입력하였습니다.");
				break;
			} else if (input == ran) {
				System.out.print("Great!!");
				break;
			}
			String result = (input < ran ? "UP" : "DOWN");
			System.out.println(result);
		}
		sc.close();

	}
}
