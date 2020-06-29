package ga.rubok.level4;

public class Value {

	private int val;
	
	public Value(int val) {
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}
	
	@Override
	public boolean equals(Object obj) {
		Value val = (Value)obj;
		if(this.getVal() == val.getVal()) {
			return true;
		}
		return false;
	}
}
