package ga.rubok.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class MyBall {
	private int[] myArr;
	private Scanner sc;

	public MyBall(int n) {
		init(n);
	}

	private void init(int n) {
		myArr = new int[n];
		sc = new Scanner(System.in);
	}

	void setNumbers() {
		for (int i = 0; i < myArr.length; i++) {
			System.out.printf("숫자 %d: ", i + 1);
			String val = sc.nextLine();
			try {
				myArr[i] = Integer.parseInt(val); // 0~9사이의 숫자가 들어가야함
			} catch (Exception e) { // e는 에러 정보
				i--;
				System.out.println("숫자만 입력하세요.");
				continue;
			} // 예외 처리 구문
			if (myArr[i] < 0 || myArr[i] > 9) {
				i--;
				System.out.println("1~9값만 입력하세요.");
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (myArr[i] == myArr[j]) {
					i--;
					System.out.println("중복된 값이 존재합니다.");
					break;
				}
			}System.out.println(Arrays.toString(myArr));
		}
	}
	
	public int get(int idx) {
		return myArr[idx];
	}
}
