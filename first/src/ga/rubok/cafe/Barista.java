package ga.rubok.cafe;

public class Barista {
	public Barista() {
		super();
	}
	
	public Coffee makeCoffee(MenuItem mi) {
		Coffee coffee = new Coffee(mi);
		return coffee;
	}
	
}
