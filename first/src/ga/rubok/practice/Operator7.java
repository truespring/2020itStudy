package ga.rubok.practice;

public class Operator7 {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 5;
		int n3 = 6;
		
		System.out.println(n1 == n2 && n1 == n3 && n2 == n3);
		
		System.out.println(n1 == n2 || n1 == n3 || n2 == n3);
		// && ||의 경우 처음의 결과값을 토대로 뒤의 값을 확인할 필요 없을때 확인하지 않고 & |는 일일이 다 확인하기때문에 퍼포먼스가 떨어짐
		
	}

}
