package ga.rubok.practice.mission;

import java.util.Scanner;

public class Mission5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : (0~100)");
		int grade = sc.nextInt();
		sc.close();

		if (grade > 100 || grade < 0) {
			System.out.println("잘 못 입력하였습니다.");
		} else if (grade >= 90) {
			System.out.print("A");
		} else if (grade >= 80) {
			System.out.print("B");
		} else if (grade >= 70) {
			System.out.print("C");
		} else {
			System.out.print("D");
		}

		if (grade == 100) {
			System.out.println("+");
		} else if (grade >= 70 && grade < 100) {
			int mod = grade % 10;
			if (mod >= 7) {
				System.out.println("+");
			} else if (mod <= 3) {
				System.out.println("-");
			}
		}
	}
}
