package ga.rubok.cafe;

public class Cafe {
	public static void main(String[] args) {
//		MenuItem mi = new MenuItem("아메리카노", 1500);
//		MenuItem mi2 = new MenuItem("카푸치노", 2000);
//		System.out.println(mi);
//		System.out.println(mi2);
		
//		Menu menu = new Menu();
//		menu.showMenu();
//		
//		MenuItem mi = menu.choose(0);
//		System.out.println(mi);

		Menu menu = new Menu();
		Customer cus = new Customer();
		Barista bas = new Barista();
		
		MenuItem choiceMenu = cus.order(menu);
		Coffee coffee = bas.makeCoffee(choiceMenu);
		
//		Barista.makeCoffee(choiceMenu);
		
		cus.drinkCoffee(coffee);
	}
}
