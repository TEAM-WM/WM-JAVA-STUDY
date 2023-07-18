package webmon_khs_w03;
//ArrayList 컬렉션 (객체 자체를 저장하는것이 아닌 객체의 번지를 저장한다
public class Board {
	//필드 지정
	private String subject;
	private String content;
	private String writer;
	//보드 생성자
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	//getter setter
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}