package ga.rubok.practice.mission;

import java.util.Scanner;

public class Mission6_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int star = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < star; i++) {
			System.out.print("*");
		}
	}
}
