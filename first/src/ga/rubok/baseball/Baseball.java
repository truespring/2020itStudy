package ga.rubok.baseball;

import java.util.Arrays;

public class Baseball {
//	랜덤 숫자를 보관하는 클래스
	private int[] rArr;

	public Baseball(int n) {
		init(n);
	}

	private void init(int n) {
		rArr = new int[n];
		setRandom();
	}

	private void setRandom() {
		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) ((Math.random() * 9) + 1);
			for (int j = 0; j < i; j++) {
				if (rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		}System.out.println(Arrays.toString(rArr));
	}
	
	public int get(int idx) {
		return rArr[idx];
	}

}
