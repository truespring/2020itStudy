package ga.rubok.level3;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car("아반떼", "쥐색", 2500);
		Car car = new Car();
		
		car.introduceMyCar(); 
		car1.introduceMyCar();
		System.out.println("---");
	}
}
