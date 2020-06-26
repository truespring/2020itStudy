package ga.rubok.practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] sArr = new int[5];
		for(int i = 0; i < 5; i++) {
			sArr[i] = sc.nextInt();
		}
		
		sc.close();
	}

}