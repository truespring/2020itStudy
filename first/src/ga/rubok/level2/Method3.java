package ga.rubok.level2;

public class Method3 {
	public static void main(String[] args) {
		// 비 void 형 > 반환 값이 있음
		int result = sum(15, 10);
		System.out.println(result);
		
		result = minus(30, 10);
		System.out.println(result);
	}
	
	public static int sum(int n1, int n2) {
		return n1 + n2; // 무조건 return 키워드를 만나야 함 그리고 바로 메소드는 종료됨
	}
	
	public static int minus(int n1, int n2) {
		return n1 - n2;
	}

}
