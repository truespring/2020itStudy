package ga.rubok.level3;

public class MonitorTest {
	public static void main(String[] args) {
		Monitor m1 = new Monitor();
		Monitor m2 = new Monitor();

		Monitor.brand = "삼성";
		m1.inch = 30;
		m1.printinfo();

		Monitor.brand = "LG";
		m2.inch = 35;
		m2.printinfo();
		m1.printinfo();
	}

}
