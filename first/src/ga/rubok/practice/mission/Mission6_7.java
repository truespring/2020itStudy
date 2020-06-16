package ga.rubok.practice.mission;

import java.util.Scanner;

public class Mission6_7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int star = sc.nextInt();
		sc.close();

		for (int i = 0; i < star; i++) {
			for (int j = star; j > i + 1 ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
