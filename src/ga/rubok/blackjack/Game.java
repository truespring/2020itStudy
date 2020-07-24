package ga.rubok.blackjack;

public class Game {
	public static void main(String[] args) {

		CardDeck cd = new CardDeck();
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		
		for(int i = 0; i < 2; i++) {
			dealer.receiveCard(cd.getCard());
			gamer.receiveCard(cd.getCard());
		}
		
		dealer.moreCards(cd);
		gamer.moreCards(cd);
		Rule.whoIsWin(gamer, dealer);
		System.out.println("게이머의 점수 : " + gamer.getTotalPoint());
		System.out.println("딜러의 점수 : " + dealer.getTotalPoint());
	}
}
