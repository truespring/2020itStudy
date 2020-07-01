package ga.rubok.level7;

public class Medic extends Unit {

	public Medic() {
		super("메딕", 70);
	}

	public void heal(Unit unit) {
		if (unit == this || !(unit instanceof Carable)) {
			System.out.println("치료 대상이 아닙니다.");
			return;
		} else {
			if (unit.MAX_HP != unit.getCurrent_hp()) {
				unit.setCurrent_hp(unit.MAX_HP);
				System.out.println("치료가 완료되었습니다.");
			} else {
				System.out.println("더 이상 회복할 수 없습니다.");
			}

		}
	}
}
