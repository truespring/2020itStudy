package ga.rubok.practice.mission;

import java.util.Scanner;

public class Mission4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해 주세요 : (1~12)");
		String month = sc.next();
		sc.close();
		
		switch (month) {
		case "3": case "4": case "5":
			System.out.println("봄");
			break;
		case "6": case "7": case "8":
			System.out.println("여름");
			break;
		case "9": case "10": case "11":
			System.out.println("가을");
			break;
		case "1": case "2": case "12":
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}
	}

}
