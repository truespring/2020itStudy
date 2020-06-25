package ga.rubok.baseball;

public class Game {
	public static void main(String[] args) {
		int gameCnt = 3;
		
		Baseball ball = new Baseball(gameCnt);
		MyBall myBall = new MyBall(gameCnt);

		myBall.setNumbers(); //슷자1: 3 숫자2: 4
		int val = ball.get(0);
		System.out.println(val);
		
		do {
			myBall.setNumbers();
		} while(Checker.check(gameCnt, ball, myBall));
		System.out.println("게임 종료!");
	}

}
