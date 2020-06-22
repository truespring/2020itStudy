package ga.rubok.level3;

public class Calc {
	
	int n1, n2; // 전역변수는 멤버필드임 모든 메서드에서 사용 가능
	
	//					     지역변수 해당 메서드에서만 사용 가능
	public static int sum(int a, int b) {
		return a + b; // 바로 메모리에 올라감
	}
	
	public int sum() { // 객체화가 되어야만 사용 가능
		return this.n1 + this.n2;
	}
	
	public Calc(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	void sumInfo() {
		System.out.printf("%d", n1 + n2);
	}

}
