package logic;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class Board {
	private int boardNo;
	@NotEmpty(message="�۾��̴� �ʼ��Դϴ�.")
	private String userId;
	@NotEmpty(message="������ �ʼ��Դϴ�.")
	private String subject;
	@NotEmpty(message="������ �ʼ��Դϴ�.")
	private String content;
	private int type;
	private int ref;
	private int reflevel;
	private int cnt;
	private Date regDate;
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public int getReflevel() {
		return reflevel;
	}
	public void setReflevel(int reflevel) {
		this.reflevel = reflevel;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", userId=" + userId + ", subject=" + subject + ", content=" + content
				+ ", type=" + type + ", ref=" + ref + ", reflevel=" + reflevel + ", cnt=" + cnt + ", regDate=" + regDate
				+ "]";
	}
}
