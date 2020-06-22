package ga.rubok.level3;

public class BoardVO {
	private String title;
	private String content;
	private int writeId;
	
	public BoardVO(String title, String content, int writeId) {
		super();
		this.title = title;
		this.content = content;
		this.writeId = writeId;
	} // 생성자를 통해서 외부에서 값을 넣음
	
	public void setTitle(String title) {
		this.title = title;
	} // 외부에서 값을 받아 넣음 setter
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}
	
	public BoardVO() { // 기본 생성자는 생성자가 없을 때 자동으로 만들어 줌
		super();
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public int getWriteId() {
		return writeId;
	}
	
	/*
	 private 같은 클래스
	 default 같은 패키지
	 protected default + 상속 관계
	 public 모두 가능
	 */
	

}
