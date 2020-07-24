package ga.rubok.practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		int[] arr = new int[idx];
		int max = 0, min = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			for(int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					max = arr[i];
				} else {
					min = arr[j];
				}
			}
		}System.out.println(min + " " + max);
		sc.close();
	}

}