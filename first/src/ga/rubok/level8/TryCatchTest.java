package ga.rubok.level8;

public class TryCatchTest {
	public static void main(String[] args) {
//		런타임 에러 - 빨간줄은 뜨지 않으나 실행하였을 때 에러가 발생하며 종료되는 것 - 서버를 사용할 때 많이 발생
//		컴파일 에러 - 빨간줄이 뜨는 것
		try {
//			예외를 감싸는 곳
		} catch (Exception e) {
//			예외 발생 시 실행되는 곳
		} finally {
//			예외 유무 상관없이 무조건! 실행되는 곳
		}

		meth();
		
//		try {
//			meth2();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		System.out.println("넘기기");
		
		double a = div(10, 2);
		System.out.println(a);
	}
	
	public static double div(int n1, int n2) {
		try {
			return n1 / n2;
		} catch(Exception e) {
			return 100;
		}
	}
	
//	 예외 발생 시 예외를 넘기겠다는 뜻 - 메소드를 호출한 곳에서 해결을 해야함
	public static void meth2() throws ClassNotFoundException {
			Class.forName("");
	}

	public static void meth() {
		int result = 1;
		try {
			result = 10 / 5;

			Class.forName("");
//		} catch (SQLException e) {
			
		} catch (ClassNotFoundException e) {

		} catch (Exception e) { // 이 친구는 마지막에 있어야하며 그 위로 예외를 넣어주는 것이 좋음
			e.printStackTrace();
			System.out.println("예외가 발생하였습니다.");
		} finally {
			System.out.println("finally");
		}
		System.out.println("result : " + result);
		System.out.println("종료!");
	}

}
