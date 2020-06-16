package ga.rubok.practice.mission;

public class Practice2 {
	public static void main(String[] args) {
		//랜덤 값 뽑기
		double r = Math.random(); //범위는 0<=r<1  
		int rVal = (int)(r*16);
		System.out.println(rVal);
		
		int rVal2 = (int)(Math.random()*16);
		System.out.println(rVal2);
		
//		1~16
		int rVal3 = (int)(Math.random()*15 + 1);
		System.out.println(rVal3);
		
//		30~50
		int rVal4 = (int)(Math.random()*21 + 30);
		System.out.println(rVal4);
		
		// 70~100
		int rVal5 = (int)(Math.random()*31 + 70);
		System.out.println(rVal5);
		
		//46~77
		int rVal6 = (int)(Math.random()*32 + 46);
		System.out.println(rVal6);
		
		
	}

}
