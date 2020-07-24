package ga.rubok.level5;

public class AnimalTest {
	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.cry();
		ani = new Cat();
		ani.cry(); // Cat이 가지고 있는 메소드 호출 불가 타입이 Animal이기 때문
		
		Cat cat = (Cat)ani; // 부모가 자식의 타입이 되기위한 형변환은 굳이 필요 없음
		cat.cry(); // Cat이 가지고 있는 메소드 호출 가능 타입이 Cat이기 때문
		
//		cat = new Animal(); 불가능
		
		
		Dog dog = (Dog)ani;
		
		ani = new Sparrow();
		ani.cry();
	}
}
