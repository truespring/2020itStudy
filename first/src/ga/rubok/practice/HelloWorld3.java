package ga.rubok.practice;

import java.util.Scanner;

public class HelloWorld3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		int sum = 0;
		int num2 = 0;
		while(true) {
			if(num > 0 && num < 10) {
				i++;
			}else {
				sum = (num / 10) + (num % 10);
				num2 = ((num % 10) * 10) + sum;
				i++;
			}
			
		}
	}

}
