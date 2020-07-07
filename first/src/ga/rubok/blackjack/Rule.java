package ga.rubok.blackjack;

public class Rule {
	
//	private static int point = 21;
	
//	public Rule() {
//		init();
//	}
//	
//	public void init() { 
//		point = 21;
//	}
//	
	public static void whoIsWin(Gamer gamer, Dealer dealer) {

//		System.out.println(point);
		int stdPoint = 21;
		int gp = gamer.getTotalPoint();
		int dp = dealer.getTotalPoint();
		/*
		 if(gp == dp || (gp > stdPoint && dp > stdPoint)){
		 sout("비김");
		 }
		 else if ((gp <= stdPoint && gp > dp) || dp > stdPoint) {
		 sout("게이머 승");
		 }
		 else {
		 sout("딜러 승");
		 }
		 */
		
		if (gp <= stdPoint && dp <= stdPoint) {
			if (gp > dp) {
				System.out.println("게이머 승리!");
				if(gp == stdPoint) {
					System.out.println("블랙잭!");
				}
			} else if (gp < dp) {
				System.out.println("딜러 승리!");
				if(dp == stdPoint) {
					System.out.println("블랙잭!");
				}
			} else {
				System.out.println("무승부!");
			}
		} else {
			if(gp > stdPoint && dp > stdPoint) {
				System.out.println("양쪽 점수 초과! 무승부!");
			} else if (gp > stdPoint) {
				System.out.println("게이머 점수 초과! 딜러 승리!");
			} else {
				System.out.println("딜러 점수 초과! 게이머 승리!");
			}
		}
	}
}
