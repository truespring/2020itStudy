package ga.rubok.level4;

public class ValueTest {
	
	public static void main(String[] args) {
		String str = new String("A");
		String str2 = new String("A");
		
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
//		overriding 된 메소드를 사용
		Value val1 = new Value(1);
		Value val2 = new Value(1);
		
//		System.out.println(val1 + " " + val2);
		int get1 = val1.getVal();
		int get2 = val2.getVal();
		
//		System.out.println(get1 == get2);
		
		System.out.println(val1 == val2);
		System.out.println(val1.equals(val2));
	}

}
