package ga.rubok.level3;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car("아반떼", "쥐색", 2500); // 파라미터가 있는 생성자 호출
		Car car = new Car(); // 생성자 호출, 기본 생성자 호출
		Car car2 = new Car("그랜저");
		Car car3 = new Car(1400);
		
		car1.name = "소나타";
		car.introduceMyCar(); 
		car1.introduceMyCar();
		car2.introduceMyCar();
		car3.introduceMyCar();
		System.out.println("---");
	}
}
