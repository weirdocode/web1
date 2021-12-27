package kr.oco.jsp.board.model;

import java.sql.Timestamp;

public class BoardVO {
	private int id;
	private String writer;
	private String title;
	private String content;
	private Timestamp regDate;
	private int hit;
	
	public BoardVO() {}

	public BoardVO(int id, String writer, String title, String content, Timestamp regDate, int hit) {
		super();
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
		this.hit = hit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
	private boolean newMark;
	
	public void setNewMark(boolean newMark) {
		this.newMark = newMark;
	}

	
	public boolean isNewMark() {
		return newMark;
	}
	
	
	
}









