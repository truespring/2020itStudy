package ga.rubok.practice;

public class Operator6 {
	public static void main(String[] args) {
//		String str1 = "안녕";
//		String str2 = "안녕";
//		
//		System.out.println(str1 == str2);
//		true가 나오는 이유는 String str2 = str1로 바꿈
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		String str3 = str2;
		
		System.out.println(str1 == str2);
		//주소 값이 다르기 때문에 false가 나타남
		System.out.println(str2 == str3);
		
		System.out.println(str1.equals(str2)); // equals 는 String 에서만 사용함
		//"문자열".equals(변수)의 형태가 안정적이면 에러날 확률이 적음
	}

}
