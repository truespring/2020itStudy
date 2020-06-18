package ga.rubok.level2;

public class Method1 {
	//           (리턴타입          (매개변수 ==parameter)) == 메소드의 선언부
	public static void main(String[] args) {
		// {메소드의 구연부}
		// void형은 회신이 없고 비void형은 회신이 있음 jump와 call 느낌
		
//		sum이 static 메소드가 아니라면  Method1 med1 = new Method(); \n med1.sum(10, 15);
		sum(10, 15);
//		메소드명(argument 인수 인자)
		minus(20, 5);
		
	}
//         static은 자동으로 메모리에 올리는 것
	public static void sum(int n1, int n2) { // 메소드 정의
		System.out.println(n1 + n2);
//		return; > 자동으로 들어감(void가 있을때) 메소드를 종료함
	}
//	메소드 안에서 메소드 호출은 가능하지만 정의는 불가능
	public static void minus(int a, int b) {
		System.out.println(a - b);
	}
	
}
