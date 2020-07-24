package ga.rubok.practice;

public class Operator5 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 11;
		int n3 = 12;
		boolean result = (n1 == n2);
		System.out.println(n1 == n2);
		System.out.println(result);
		System.out.println(n1);
		
		System.out.println();
		result = (n1 != n2);
		System.out.println(result);
		
		System.out.println();
		result = n1 > n2;
		System.out.println("n1 > n2 : " + result);
		
		System.out.println();
		result = n1 < n2;
		System.out.println("n1 < n2 : " + result);
		//3개 이상의 비교는 불가하다 2개씩만 비교 가능하다
		
		char i = 'A';
		int j = 65;
		
		boolean result2 = (i == j);
		System.out.println(result2);
		System.out.println(i);
		
	}

}
