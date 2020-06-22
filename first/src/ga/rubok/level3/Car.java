package ga.rubok.level3;

public class Car {
	String name;
	String color; 
	int cc; // 멤버필드
	
	public Car() { // 생성자는 class 명과 같고 return타입이 없음
//		name = "아반떼";
//		color = "쥐색";
//		cc = 1000;
//		super(); 생략 가능
		this("아반떼", "쥐색", 1000);
	} 
	
	public Car(String name) {
		this(name, "검정색", 3000);
	}
	
	public Car(int cc) {
		this("소나타", "흰색", cc);
	}

	public Car(String name, String color, int cc) { // 이 부분은 반드시 만들어야 나머지 파생이 가능
		super(); // object의 기본 생성자를 호출
		this.name = name;
		this.color = color;
		this.cc = cc; // 이 메소드가 위의 메소드들의 작업을 몰아서 하는 것
	}
	
//	public void Car(){} 이것은 메소드임, 생성자 아님
	
//	public Car(String name, String color, int cc) {
//		super(); // 직속 부모의 주소값, 기본 생성자
//		this.name = name; // 자신의 주소값
//		this.color = color; // 전역변수와 지역변수 명이 같을 때 붙여야함
//		this.cc = cc;
//	}
	
	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc이다.\n", 
				name, color, cc);
	}
}
