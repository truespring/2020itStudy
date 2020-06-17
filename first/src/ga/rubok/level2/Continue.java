package ga.rubok.level2;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			if (i == 5) {
				continue; // continue는 스킵
			}
			System.out.println(i);
		}
	}

}
