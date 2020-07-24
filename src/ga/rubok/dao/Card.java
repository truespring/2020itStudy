package ga.rubok.dao;

public class Card {
	public static final String[] PATTERNS = { "스페이드", "클로버", "하트", "다이아몬드" };
	private String pattern;
	private String denomiation;
	
	public Card(String pattern, String denomiation) {
		super();
		this.pattern = pattern;
		this.denomiation = denomiation;
	}
	
	public String getPattern() {
		return pattern;
	}
	public String getDenomiation() {
		return denomiation;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", pattern, denomiation);
	}
}
