package ga.rubok.practice.mission;

import java.util.Scanner;

public class Mission2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a % 2;
		if(b == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		sc.close();
	}

}
