package ga.rubok.level3;

public class BoardVO {
	private String title;
	private String content;
	private int writeId;
	// 멤버필드는 private로 묶어놓고 상수는 public으로 풀어 놓음
	public BoardVO(String title, String content, int writeId) {
		super();
		this.title = title; // 전역변수와 지역변수의 이름이 같기 때문에 this로 구분함
		this.content = content;
		this.writeId = writeId;
	} // 생성자를 통해서 외부에서 값을 넣음	
	
	public BoardVO() { // 기본 생성자는 생성자가 없을 때 자동으로 만들어 줌
		super();
	}
	
	public void setTitle(String title) {
		this.title = title;
	} // 외부에서 값을 받아 넣음 setter
	
	public void setContent(String content) {
		this.content = content;
	} // 외부에서 값을 받아 넣음 setter
	
	public void setWriteId(int writeId) {
		this.writeId = writeId;
	} // 외부에서 값을 받아 넣음 setter

	public String getTitle() {
		return title;
	} // getter
	
	public String getContent() {
		return content;
	} // getter
	
	public int getWriteId() {
		return writeId;
	} // getter
	
	/*
	 private 같은 클래스
	 default 같은 패키지
	 protected default + 상속 관계
	 public 모두 가능
	 */
	

}
