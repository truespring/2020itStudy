package ga.rubok.practice.mission;

import java.util.Scanner;

public class Mission7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;

		while (true) {
			System.out.print("숫자를 입력:(종료0)");
			int n = sc.nextInt();
		
			if (n == 0) {
				break;
			}	
			sum += n; //굳이 값을 처리하고 나올 필요가 없음
		}
		sc.close();
		System.out.println("합계 : " + sum);

	}

}
