package ga.rubok.practice.mission;

import java.util.Scanner;

public class GreatMsission2 {
	/*자판기 문제*/
	public static void main(String[] args) {

		String[] mArr = { "사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유" };
		int[] pArr = { 500, 600, 700, 800, 400, 400 };
		Scanner sc = new Scanner(System.in);

		System.out.println("-메뉴-");
		for (int i = 0; i < pArr.length; i++) {
			System.out.printf("%d. %s (%d원)\n", (i + 1), mArr[i], pArr[i]);
		}
		System.out.println();

		int sum = 0;

		while (true) {
			System.out.print("메뉴를 선택하세요 : (종료:0)");
			int sel = sc.nextInt();
			int idx = sel - 1;
			if (sel == 0) {
				break;
			} else if (sel > pArr.length || sel < 0) {
				System.out.print("잘 못 입력!\n");
				continue;
			}
			System.out.printf("%s %d원\n", mArr[idx], pArr[idx]);
			sum += pArr[idx];

		}
		System.out.printf("종료! %d원", sum);
		sc.close();

	}

}
