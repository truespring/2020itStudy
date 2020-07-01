package ga.rubok.level7;

public class Unit {
	public final String NAME;
	public final int MAX_HP;
	private int current_hp;
//	final은 무조건 값을 넣어줘야 하며 한 번 들어가면 바뀌지 않음
	public Unit(String name, int max_hp) {
		this.NAME = name;
		this.MAX_HP = max_hp;
		this.current_hp = max_hp;
	}
	
	public int getCurrent_hp() {
		return current_hp;
	}
	
	public void move(int x, int y) {
		System.out.printf("x:%d, y:%d 좌표로 이동\n", x , y);
	}
	
	public void getDamage(int damage) {
		current_hp -= damage;
	}
	
	public void setCurrent_hp(int hp) {
		this.current_hp = hp;
	}
	@Override
	public String toString() {
		return String.format("%s, 현재 HP : %d" , NAME, getCurrent_hp());
	}
}
