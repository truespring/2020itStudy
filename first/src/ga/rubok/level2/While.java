package ga.rubok.level2;

public class While {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		System.out.println("----------");
		
		int i = 0;
		while(i<5) { //특정 조건 동안 반복될 때 사용 ex)카드게임 : 아니요가 될 때까지 카드를 받음
			System.out.println(i);
			i++;
		}
	}

}
