package ga.rubok.practice.mission;

public class Mission6_3 {
	public static void main(String[] args) {
		for (int p = 26; p < 34; p++) {
			for (int j = 1; j < 10; j++) {
				int i = p - 24;
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}

}
