package ga.rubok.level2;

public class NamedLoop {
	public static void main(String[] args) {

		Parent: // 반복문을 멈추기 위한 방법
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 20; j++) {

				if (j == 15) {
					break; // == continue Parent;
					// break Parent; 는 반복문을 종료
				}
				System.out.printf("%d - %d\n", i, j);
			}
		}
	}

}
