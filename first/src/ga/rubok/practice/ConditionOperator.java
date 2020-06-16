package ga.rubok.practice;

public class ConditionOperator {
		public static void main(String[] args) {
			int num = 3;
			
//			boolean isOdd = (num % 2 == 1 ? true : false); //참일 때 전자 거짓일 때 후자
			
			String result = (num % 2 == 1? "홀수" : "짝수");
			
			System.out.printf("%d is odd? %s\n", num, result);
		}
}
