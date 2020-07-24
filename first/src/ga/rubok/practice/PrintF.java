package ga.rubok.practice;

public class PrintF {
	public static void main(String[] args) {
		int age = 3000;
		String name = "석규환";
		float vision = 0.4f;
		char bloodType = 'O';
		
		System.out.println("나의 이름은 " + name + "입니다. 나의 나이는 " + age + "입니다. "
				+ "나의 시력은 " + vision + "입니다. 나의 혈액형은 " + bloodType + "입니다."); 
		//자동으로 변수를 String으로 형변환을 시킨다.
	
		System.out.printf("나의 이름은 %s입니다. 나의 나이는 %,d입니다. 나의 시력은 %.1f입니다. "
				+ "나의 혈액형은 %c입니다.\n", name, age, vision, bloodType);
		//%,d 자릿수를 나타냄
		
		System.out.printf("나의 이름은 %s입니다. 나의 나이는 %s입니다. 나의 시력은 %s입니다. "
				+ "나의 혈액형은 %s입니다.\n", name, age, vision, bloodType);
		
		char v1 = '가';
		System.out.printf("%c : %d\n", v1, (int)v1);
		
		int v2 = 66;
		System.out.printf("%c : %d\n", (char)v2, v2);
	}

}
