package ga.rubok.baseball;

public class Checker {
	public static boolean check(int gameCnt, Baseball b, MyBall mb) {
		// S, B, O
		// 성공하면 false, 성공전이면 true

		while (true) {
			int st = 0;
			int bl = 0;
			for (int i = 0; i < gameCnt; i++) {
				for (int j = 0; j < gameCnt; j++) {
					if (i == j && b.get(i) == mb.get(j)) {
						st++;
					} else if (i != j && b.get(i) == mb.get(j)) {
						bl++;
					}
				}
			}
			if (st == gameCnt) {
				break;
			} else {
				System.out.printf("S : %d B : %d O : %d\n", st, bl, (gameCnt - st - bl));
				return true;
			}
		}
		return false;
	}

} //
