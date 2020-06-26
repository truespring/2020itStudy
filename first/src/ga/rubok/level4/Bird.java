package ga.rubok.level4;

public class Bird extends Animal {
//	상속은 상하관계이며 형제관계는 없음 
	/* Bird의 기본생성자 모습
	 public Bird(){
	 	super(); 부모가 가지고 있는 기본 생성자를 호출하려 함 하지만 기본 생성자의 형태가 없기 때문에 호출되지 않음
	 	}
	 */
	protected Bird(String name) {
		super(name, "조류"); // 부모의 생성자를 받는데 String타입 2개이기 때문에 ""추가
	} // 이 방법이 아니면 Bird는 객체화가 될 수 없음
	
	void flying() {
		System.out.println("난다 날아~");
	}
	
	@Override 
	void crying() { //overriding 부모와 같은 메소드를 사용하기 위해 사용하는 기법 메소드의 이름을 잘 못 적을 경우 에러가 발생 부모에게 없는 메소드 이기 때문
		super.crying(); // 보모인 Animal의 crying 메소드를 호출함
		System.out.println("99999");
	}
	
}
