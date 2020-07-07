package ga.rubok.blackjack;

public class Card {
	public final static String[] PATTERNS = {"스페이드", "클로버", "하트", "다이아몬드"};
	private final String pattern; // 카드 무늬
	private final String denomination; // 카드 숫자
	private final int point;
//	final을 붙이면 setter를 만들 수 없다
	public Card(String pattern, String denomination, int point) {
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}
	
	public String getPattern() {
		return pattern;
	}
	
	public String getDenomination() {
		return denomination;
	}
	
	public int getPoint() {
		return point;
	}
	
	@Override
	public String toString() {
		return String.format("P : %s, D : %s, P : %d", 
				pattern, denomination, point);
	}
}
