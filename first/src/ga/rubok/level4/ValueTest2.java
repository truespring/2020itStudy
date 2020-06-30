package ga.rubok.level4;

public class ValueTest2 {
	public static void main(String[] args) {
		String str = new String("안녕");
		System.out.println("str : " + str);
		
		System.out.println();
		
		Value val1 = new Value(2);
		Value val2 = new Value(2);
		
		System.out.println("val : " + val1);
		
		String strVal1 = String.valueOf(val1);
		String strVal2 = strVal1.toString();
		
		System.out.println(strVal1);
		System.out.println(strVal2);
		
//		System.out.println(strVal2 == strVal);
//		System.out.println(val1 == val2);
		
//		String strVal1 = String.valueOf(val1);
//		String strVal2 = String.valueOf(val2);
		
//		System.out.println(strVal1 == strVal2);
//		
//		String strVal3 = strVal1.toString();
//		String strVal4 = strVal2.toString();
//		
//		System.out.println(strVal3 == strVal4);
		
	}
}
