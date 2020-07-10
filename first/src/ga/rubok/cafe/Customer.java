package ga.rubok.cafe;

import java.util.Scanner;

public class Customer {
	
	public Customer() {
		super();
	}
	
	public MenuItem order(Menu menu) {
		menu.showMenu();
		Scanner sc = new Scanner(System.in);
		MenuItem mi = null;
		while(mi == null) {
			try {
				System.out.print("메뉴를 입력하세요 : ");
				String sel = sc.nextLine();
				int intSel = Integer.parseInt(sel);
				mi = menu.choose(intSel - 1); // 범위 이외의 값이 들어오게 되면 에러가 발생하여 mi에 값을 넣을 수 없다
			} catch(NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
			} catch (Exception e) {
				System.out.println("메뉴 선택이 잘 못 되었습니다.");
			}
		}
		sc.close();
		return mi; // 밖으로 빼는 이유는 혹시 안에서 에러 발생으로 sc.close();가 실행되어 무한 루프가 도는 상황이 발생 할 수 있다
	}
	
	public void drinkCoffee(Coffee coffee) {
		System.out.printf("%s를 마신다.", coffee.getName());
	}

}
