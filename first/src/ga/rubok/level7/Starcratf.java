package ga.rubok.level7;

public class Starcratf {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Medic medic = new Medic();
		FireBat f1 = new FireBat();
		
//		System.out.println(m1);
//		System.out.println(m2);
//		
//		m1.attack(m2);
//		m1.attack(m2);
//		m1.attack(m1);
//		System.out.println("m1 : " + m1);
//		System.out.println("m2 : " + m2);

		f1.attack(m1);
		f1.attack(m1);
		f1.attack(m1);
		
		System.out.println(m1);

		m1.attack(f1);
		m1.attack(f1);
		
		System.out.println(f1);
		
		medic.heal(f1);
		medic.heal(m1);
//		형변환 가능 여부를 물어보는 명령어
		System.out.println(f1 instanceof Carable);
		System.out.println(m1 instanceof Carable);
		System.out.println(m1);
		System.out.println(f1);
		medic.heal(m1);
		
	}
}
