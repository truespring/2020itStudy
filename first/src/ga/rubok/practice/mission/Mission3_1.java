package ga.rubok.practice.mission;

import java.util.Scanner;

public class Mission3_1 {
	/*
	 * 성별을 입력해 주세요: (남/여) 키를 입력해 주세요:
	 * 
	 * 남자 기준 : 160 여자 기준 : 150
	 * 
	 * "평균 미만입니다." "평균입니다." "평균 초과입니다."
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 입력을 받기위한 변수 생성

		System.out.print("성별을 입력하세요 : "); //입력시 println을 하지 않는 이유는 에러가 발생할 수 있기 때문
		String gender = sc.next(); // 성별을 문자열로 입력 받음

		String man = new String("남자"); // 입력받은 문자열과 비교하기 위한 객체 생성
		String woman = new String("여자"); // String은 자주 사용하기 때문에 길게 new String을 하지 않고 사용함

		String over = new String("평균 초과입니다.");
		String avg = new String("평균입니다.");
		String under = new String("평균 미만입니다."); // 결과를 나타내기 위한 객체 생성
		
		if (man.equals(gender) || woman.equals(gender)) { //정해진 입력 값을 받아야만 진입가능

			System.out.print("키를 입력하세요 : ");
			int tall = sc.nextInt(); // 키를 정수로 입력 받음
			
			int standHeight = 150; // 초기화를 하지 않으면 어떠한 조건에서 충족되지 않을때 에러가 발생할 수 있음
			
			if (man.equals(gender)) {
				standHeight = 160; //남자의 기준 값이 들어감
			} //남자가 아니면 여자의 기준 값이 들어감

			if (tall > standHeight) {
				System.out.println(over);
			} else if (tall < standHeight) {
				System.out.println(under);
			} else {
				System.out.println(avg);
			} //각각에 따라서 출력을 함
		} else {
			System.out.println("성별을 잘 못 입력하셨습니다.");
		}

		sc.close(); // 입력을 위한 변수를 종료함
	}

}