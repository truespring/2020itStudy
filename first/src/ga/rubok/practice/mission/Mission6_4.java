package ga.rubok.practice.mission;

public class Mission6_4 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d * %d = %d	", j, i, i * j);
			}
			System.out.println();
		}
	}

}
