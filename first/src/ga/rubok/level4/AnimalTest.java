package ga.rubok.level4;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal("", "");
		Bird bird = new Bird("참새");
		Bird bird2 = new Bird("기러기");
//		모든 부모는 새로운 객체로 생성됨 이유는 각각 다른 값을 저장하기 위해
		
		animal.crying();
		bird.crying(); // 상속을 받았기 때문에 bird 클래스에 crying메소드가 없어도 사용 가능
//		animal.flying(); bird에 있는 클래스는 부모인 animal 클래스에서는 사용 불가능
		bird.flying();
		
		bird.whoAmI();
		bird2.whoAmI();
		
		Sparrow sparrow = new Sparrow();
		sparrow.crying(); // Bird클래스에 있는 crying메소드를 호출하고 그 부모인 Animal의 crying 메소드는 호출할 수 없음
		sparrow.whoAmI();
		//호출하면 자식부터 올라가 최상위 부모까지 올라가며 출력은 부모로부터 시작하여 자식으로 내려옴
	}

}
