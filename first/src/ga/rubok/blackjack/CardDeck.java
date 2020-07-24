package ga.rubok.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList();

	public CardDeck() {
		init();
	}

	public void init() {
		for (int i = 0; i < Card.PATTERNS.length; i++) {
			for (int j = 1; j <= 13; j++) {
//				arr.add(new Card(Card.PATTERNS[i], getDeno(j)));
				String pattern = Card.PATTERNS[i];
				String deno = getDeno(j);
				int point = getPoint(j);
				Card c = new Card(pattern, deno, point);
				arr.add(c);

			}
		}
	}
	
	private int getPoint(int num) {
		return num > 10 ? 10 : num;
	}

	private String getDeno(int num) {
		switch (num) {
		case 1:
			return "A";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		default:
			return String.valueOf(num);
		}
	}

	@Override
	public String toString() {
//		for(Card c : arr) {
//			System.out.println(c);
//		}
//		return "";

		String str = "";
		for (int i = 0; i < arr.size(); i++) {
			str += arr.get(i);
			str += "\n";
		}
//		for(Card c : arr) {
//			str += (c + "\n");
//		}
		return str;
	}

//	랜덤한 카드를 1장 리턴 and 카드덱에서 삭제
	public Card getCard() {
		int ran = (int) (Math.random() * arr.size());
		/*
		 * Card c = arr.get(ran); arr.remove(ran); return c;
		 */
		return arr.remove(ran);
	}
}
