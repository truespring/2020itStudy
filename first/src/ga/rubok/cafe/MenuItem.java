package ga.rubok.cafe;

public class MenuItem {
//	멤버필드를 private로 은닉화한다
	private String name;
	private int price;
	
//	클래스는 멤버필드와 멤버 메소드로 구성되어 있다
	public MenuItem(String name, int price) {
		super(); // 바로 위에 있는 부모의 기본생성자를 호출
		this.name = name;
		this.price = price;
	} // 생성자의 특징은 중요하기 때문에 반드시 알아야 한다! 클래스와 이름이 같고 return 타입이 없다
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return String.format("%s	%,d원\n", 
				name, price);
	}
	
}
