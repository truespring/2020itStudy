package ga.rubok.level3;

public class Monitor {
	static String brand; // static은 하나의 값만 저장할 수 있음 처음에 무조건 메모리에 올라감
	int inch;
	// 멤버필드 없이 메소드에 파라미터를 넣어 사용할 때는 무조건 static을 붙여야 함

	void printinfo() {
		System.out.printf("brand : %s,	inch : %d\n", 
				this.brand, this.inch);
	} // 객체화가 필요함

	static void printBrand() { 
		System.out.println(brand);
//		System.out.println(inch); 멤버필드가 static이 아니기 때문에 사용 불가
	}
	
	void printInch() { // static 멤버필드는 없는 메소드에서 사용 가능
		System.out.println(brand);
		System.out.println(inch); 
	}
}
