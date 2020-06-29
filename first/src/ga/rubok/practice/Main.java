package ga.rubok.practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] sArr;
		int n = sc.nextInt();
		
		sArr = new int[n];
		for(int i = 0; i < sArr.length; i++) {
			sArr[i] = sc.nextInt();
		}
		for(int i = 0; i < sArr.length; i++) {
			for(int j = i + 1; j < sArr.length; j++) {
				if(sArr[i] > sArr[j]) {
					int temp = sArr[j];
					sArr[j] = sArr[i];
					sArr[i] = temp;
				}
			}
		}
		System.out.println(sArr[0] + " " + sArr[sArr.length-1]);
		sc.close();
	}

}