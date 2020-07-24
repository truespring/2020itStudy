package ga.rubok.level3;

public class MonitorTest2 {
	public static void main(String[] args) {
		Monitor.brand = "삼성"; // 모든 객체가 하나의 값을 가질 때 사용하면 좋음
		Monitor.printBrand();
//		Monitor.printInfo(); 이것은 사용 못함 
	}

}
