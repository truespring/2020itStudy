package ga.rubok.level7;

public class Starcratf {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		System.out.println(m1);
		System.out.println(m2);
		
		m1.attack(m2);
		m1.attack(m2);
		m1.attack(m1);
		System.out.println("m1 : " + m1);
		System.out.println("m2 : " + m2);
		
	}
}
