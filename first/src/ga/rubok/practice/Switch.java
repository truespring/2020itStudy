package ga.rubok.practice;

public class Switch {
	public static void main(String[] args) {

		int num = 3;
		switch (num) { //문자열 비교시 switch가 좋음
			case 1:
				System.out.println("1이다");
				break;

			case 2:
				System.out.println("2이다");
				break;

			case 3:
				System.out.println("3이다");
				break;

			default: //선택 사항이며 없으면 실행없이 끝이 난다
				System.out.println("1~3이 아니다");
				break; //마지막 break는 없어도 무관함
		}

	}

}
