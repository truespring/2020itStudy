package ga.rubok.level4;

public class Value {
//final은 class앞에선 상속금지 변수앞에선 상수로 변경 메소드 앞에선 오버라이딩 금지
	private int val;
	
	public Value(int val) {
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}
	
//	@Override
//	public String toString() {
////		return String.valueOf(val);
////		         내가 원하는 형태로 포맷하겠다는 것
//		return String.format("%,d", val); // 둘 중에 추천하는 방법
//	}
	
	@Override
	public boolean equals(Object obj) {
		Value val = (Value)obj;
		if(this.getVal() == val.getVal()) {
			return true;
		}
		return false;
	}
}
