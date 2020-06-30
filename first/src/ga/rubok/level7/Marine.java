package ga.rubok.level7;

public class Marine extends Unit implements AttackUnit {
	
	private int damage;
	
	public Marine() {
		super("마린", 50);
		damage = 5;
	}
	
	@Override
	public void attack(Unit u) {
		if(u == this) { return; }
		System.out.println("가우스 소총으로 공격");
		u.getDamage(damage);
		
	}
}
