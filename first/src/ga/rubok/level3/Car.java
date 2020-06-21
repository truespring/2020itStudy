package ga.rubok.level3;

public class Car {
	String name;
	String color; 
	int cc;
	
	public Car() { // 생성자는 class 명과 같고 return타입이 없음
//		name = "아반떼";
//		color = "쥐색";
//		cc = 1000;
//		super(); 생략 가능
		this("아반떼", "쥐색", 1000);
	} 
	
//	public void Car(){} 이것은 메소드임, 생성자 아님
	
//	public Car(String name, String color, int cc) {
//		super(); // 직속 부모의 주소값
//		this.name = name; // 자신의 주소값
//		this.color = color; // 전역변수와 지역변수 명이 같을 때 붙여야함
//		this.cc = cc;
//	}
	
	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc이다.\n", 
				name, color, cc);
	}

	public Car(String name, String color, int cc) {
		super();
		this.name = name;
		this.color = color;
		this.cc = cc;
	}
}
