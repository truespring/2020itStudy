package ga.rubok.blackjack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gamer {
	private List<Card> arr;

	public Gamer() {
		arr = new LinkedList();
	}

//	카드를 받으며 소유한다
	public void receiveCard(Card c) {
		arr.add(c);
//		System.out.println(c.toString());
	}

//	카드를 오픈한다
	public void openCards() {
		for (Card c : arr) {
			System.out.println(c);
		}
		System.out.printf("점수 : %d\n", getTotalPoint());
	}

//	점수를 계산한다
	public int getTotalPoint() {
		int point = 0;

//		for (Card c : arr) {
//			point += c.getPoint();
//		}
		for (int i = 0; i < arr.size(); i++) {
			Card c = arr.get(i);
			point += c.getPoint();
		}
		return point;
	}

	public void moreCards(CardDeck cd) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			openCards();
			System.out.print("카드를 더 받으시겠습니까?(y/n) : ");
			String answer = sc.nextLine();
			if (answer.equals("n") || answer.equals("N")) {
				break;
			} else if(answer.equals("y") || answer.equals("Y")) {
				receiveCard(cd.getCard());
				continue;
			} else {
				System.out.println("다시 입력하세요");
			}
		}
		sc.close();
	}
}
