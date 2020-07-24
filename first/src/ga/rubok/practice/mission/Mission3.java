package ga.rubok.practice.mission;

import java.util.Scanner;

public class Mission3 {
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
		String woman = new String("여자"); //String은 자주 사용하기 때문에 길게 new String을 하지 않고 사용함

		int manStd = 160;
		int womanStd = 150; //각 성별의 기준을 객체로 생성

		String over = new String("평균 초과입니다.");
		String avg = new String("평균입니다.");
		String under = new String("평균 미만입니다."); //결과를 나타내기 위한 객체 생성

		if (man.equals(gender)) { //man과 gender의 위치의 차이는 어떤 것이 있는가???? "문자열".equals(주소)가 안정적이고 순서가 바뀌면 에러가 생길 수 있음 man은 기존에 만들어 놓은 객체, gender는 입력받는 객체
			if (tall > manStd) { //기준을 넘어섰을 때
				System.out.println(over);
			} else if (tall == manStd) { //기준과 같을 때
				System.out.println(avg);
			} else {
				System.out.println(under); //기준에 못 미칠 때
			}
		} else if (woman.equals(gender)) { //여자의 경우
			if (tall > womanStd) {
				System.out.println(over);
			} else if (tall == womanStd) {
				System.out.println(avg);
			} else {
				System.out.println(under);
			}
		} else {
			System.out.println("성별을 잘 못 입력하셨습니다.");
		}

	}

}