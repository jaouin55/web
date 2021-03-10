//mysql로 테이블을 생성후 반드시 vo , dao를 생각없이 먼저 만들어야한다!
//여기서는  VO를 먼저 만들자 (getter/setter)


package com.webapp1216.board.model;

public class Notice {
	private int notice_id;
	private String title;
	private String Writer;
	private String Content;
	private String regdate;
	private int hit;
	public int getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
}
