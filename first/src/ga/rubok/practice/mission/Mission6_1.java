package ga.rubok.practice.mission;

public class Mission6_1 {
	public static void main(String[] args) {
		int dan = 4;

		for (int i = 9; i < 18; i++) {
			System.out.printf("%d * %d = %d\n", dan, (i-8), dan * (i-8));

//			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
}
