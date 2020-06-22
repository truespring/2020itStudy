package ga.rubok.level3;

public class CalcTest {
	public static void main(String[] args) {
		System.out.println(Calc.sum(10, 20));
		// 대문자로 시작하는 것은 class로 받는다는 것
		
		
//		Calc calc1 = new Calc(); // 객체를 생성해야 메모리에 올라감
//		calc1.n1 = 20;
//		calc1.n2 = 30;
//		System.out.println(calc1.sum());
//		// 객체를 생성하고 소문자로 시작하는 것은 메소드를 받는다는 것
		
		Calc c1 = new Calc(20, 30);
		c1.sumInfo();
	}
	
	
	

}
