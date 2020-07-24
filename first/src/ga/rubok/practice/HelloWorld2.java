package ga.rubok.practice;

import java.util.Scanner;

public class HelloWorld2 {
	/*
	 * 성별을 입력해 주세요: (남/여) 키를 입력해 주세요:
	 * 
	 * 남자 기준 : 160 여자 기준 : 150
	 * 
	 * "평균 미만입니다." "평균입니다." "평균 초과입니다."
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //입력을 받기위한 변수 생성

		System.out.print("성별을 입력하세요 : ");
		String gender = sc.next(); //성별을 문자열로 입력 받음

		System.out.print("키를 입력하세요 : ");
		int tall = sc.nextInt(); //키를 정수로 입력 받음
		sc.close(); //입력을 위한 변수를 종료함

		String man = new String("남자"); //입력받은 문자열과 비교하기 위한 객체 생성
		String woman = new String("여자"); //객체를 생성할 때 new를 사용하고 안하고의 이유????

		int manStd = 160; //160, 150도 객체에 해당하는가????
		int womanStd = 150; //각 성별의 기준을 객체로 생성

		String over = new String("평균 초과입니다.");
		String avg = new String("평균입니다.");
		String under = new String("평균 미만입니다."); //결과를 나타내기 위한 객체 생성

		if ((man.equals(gender) && tall > manStd)  || (woman.equals(gender) && tall > womanStd)) { 
			System.out.println(over);
		} 	else if ((man.equals(gender) && tall == manStd)  || (woman.equals(gender) && tall == womanStd)) { 
			System.out.println(avg);
		}   else if ((man.equals(gender) && tall < manStd)  || (woman.equals(gender) && tall < womanStd)) { 
			System.out.println(under);
		}
	}

}