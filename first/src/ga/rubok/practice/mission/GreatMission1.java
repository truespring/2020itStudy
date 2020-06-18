package ga.rubok.practice.mission;

import java.util.Scanner;

public class GreatMission1 {
	/* 숫자 야구 게임 */
	public static void main(String[] args) {
		final int LEN = 3; // 갯수

		int[] rArr = new int[LEN]; // 랜덤 배열 숫자
		int[] myArr = new int[LEN]; // 내가 입력하는 숫자

		int max = 9;
		int min = 1; // 숫자 범위

		// 랜덤 숫자를 배정하는데 서로 중복이 없게
		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) (Math.random() * max - min + 1) + min;
			for (int j = 0; j < i; j++) {
				if (rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		}
		// 입력
		Scanner sc = new Scanner(System.in);
		// 입력 및 입력 값과 랜덤 값 비교하는 반복
		while (true) {
			int st = 0;
			int ba = 0;
			
			System.out.print("숫자입력 : ");

			for (int j = 0; j < rArr.length; j++) {
				myArr[j] = sc.nextInt();
			} // 입력 반복
			for (int i = 0; i < rArr.length; i++) {
				for (int j = 0; j < rArr.length; j++) {
					if (i == j && rArr[i] == myArr[j]) {
						st++;
					} else if (i != j && rArr[i] == myArr[j]) {
						ba++;
					}
				} // 입력과 랜덤 비교 반복
			} // 입력과 랜덤을 비교하여 결과 대기
			if (LEN == st) {
				break;
			} // 정답 시 반복문 탈출
			System.out.printf("S : %d / B : %d / O : %d\n", st, ba, (LEN - st - ba));
		} // 오답 시 결과 출력
		for (int i = 0; i < rArr.length; i++) {
			System.out.print(rArr[i] + ", ");
		}
		System.out.print("정답입니다!!!!!");
		sc.close();
	}
}
