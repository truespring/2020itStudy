package ga.rubok.practice;

public class Operator2 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 10;
		
		int result = n1++; //1을 더하기 전에 result에 들어감
		System.out.println("result : " + result);
		System.out.println("n1 : " + n1);
		
		int result2 = ++n2; //1을 더하고 result2에 들어감
		System.out.println("result2 : " + result2);
		System.out.println("n2 : " + n2);
	}

}
