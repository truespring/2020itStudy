package ga.rubok.practice;

public class Variable2 {
	public static void main(String[] args) {
		int num = 10;		
		int num2, num3 = 20; //num2는 선언만 하고 초기화 안됨
		int num4 = 10, num5 = 20;
//		System.out.println(num2); 이건 안됨
		//변수명 주의사항!
		//1. 소문자로 시작! (가능한 카멜 케이스 기법 사용) int myAge;
		//2. 특수기호는 _, &만 사용 가능 - 특수기호 어디에나 무방!
		//3. 숫자로 시작은 안됨! int = 12a;
		//4. 예약어(보라색) 사용금지! int char;
		//5. 변수명 띄우면 안됨! int aa aa;
		//6. 변수명은 대소문자를 가림! int aa, Aa, aA, AA;
		
		final int MY_AGE = 10;
		System.out.println(MY_AGE);
		//7. 상수명은 무조건 대문자, 구분은 언더바로 한다. 숫자에서 언더바 사용은 자릿수를 위함이고 없음이나 마찬가지다.
		
		
	}
}
