package ga.rubok.practice.mission;

public class MethodMission1 {
	public static void main(String[] args) {
		guguDan(4, 7);
	}
	// 오버로딩은 똑같은 메소드 이름을 사용하는 것 > 파라미터는 다르게
	public static void guguDan(int sDan, int eDan) { // 파라미터 2개의 guguDan 메소드
		for(int i = sDan; i <= eDan; i++) {
			guguDan(i);
		}
	}
	
	public static void guguDan(int dan) { // 파라미터 1개의 guguDan 메소드
		int srt = 1;
		int end = 10;
		for(int i = srt ; i < end ; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		System.out.println();
	}

}
