package ga.rubok.practice;

public class Variable {
	public static void main(String[] args) {
		char v1;
		v1 = 'A';
		
		System.out.println(v1);
		System.out.println('A');
		
		v1 = 'B';
		System.out.println(v1);
		
		byte v2;
		v2 = (byte)-129; //강제 형변환
		short v3;
		v3 = 20;
		int v4;
		v4 = 30;
		long v5;
		v5 = 50; //자동 형변환
		
//		v2 = v3; 큰 타입에서 작은 타입으로 옮길 수 없다
		System.out.println();
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		
		float v6;
		v6 = (float)10.1; //실수는 기본적으로 double이기 때문에 형변환이 필요하다
		v6 = 10.1f; //강제 형변환
		System.out.println(v6);
		double v7;
		v7 = 10.1; //변수에 들어간 값을 리터럴이라고 부른다. 10.1은 double형 리터럴 값이다.
		
		v6 = (float)v7;
		
		boolean v8;
		System.out.println();
		v8 = true;
		System.out.println(v8);
		v8 = false;
		System.out.println(v8);
		
		//reference 변수 > 객체가 된다.
		String r1 = "안녕하세요."; //안녕하세요.는 객체값이 되고 r1이라는 주소값에 넣는다.
		
		System.out.println(r1);
	}
}
