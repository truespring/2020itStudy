package ga.rubok.level4;

public class Animal extends Object {
//	아무것도 적혀있지 않으면 자동적으로 Object를 상속받음
	private String name;
	private String type;
	
//	public Animal() {}
	
	protected Animal(String name, String type) {
		this.name = name; 
		this.type = type;
	}
	
	void crying() {
		System.out.println("야, 얘 운다 울어");
	}
	
	void eat() {
		System.out.println("또 먹냐?");
	}
	
	void whoAmI() {
		System.out.printf("나는 %s입니다. 나는 %s입니다.\n", name, type);
	}

}
/* (상속관계) 다양성
 1. 부모타입은 자식 객체 주소값을 저장할 수 있다.
 ex) ClassA clsA1 = new ClassB(); 가능
 	 ClassA clsA2 = new ClassC(); 가능
 	 ClassA clsA3 = new ClassA(); 가능
 2. 자식타입은 부모 객체 주소값을 저장할 수 없다.
 	 ClassB clsB1 = new ClassA(); 불가능
 3. 타입은 메소드 호출 할 수 있나 없나만 결정한다.(자기가 알고 있는 메소드만 호출할 수 있다.)
 	 호출 했을 때는 객체 기준을 실행이 된다.
 ex) clsA1.print(); 결과는 B출력 
 */
