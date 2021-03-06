package vo;

import java.util.Date;

public class QnaBoard {

	private int q_num;
	private String q_title;
	private Date q_date;
	private String q_content;
	private int q_hit;
	private String m_id;
	public int getQ_num() {
		return q_num;
	}
	public void setQ_num(int q_num) {
		this.q_num = q_num;
	}
	public String getQ_title() {
		return q_title;
	}
	public void setQ_title(String q_title) {
		this.q_title = q_title;
	}
	public Date getQ_date() {
		return q_date;
	}
	public void setQ_date(Date q_date) {
		this.q_date = q_date;
	}
	public String getQ_content() {
		return q_content;
	}
	public void setQ_content(String q_content) {
		this.q_content = q_content;
	}
	public int getQ_hit() {
		return q_hit;
	}
	public void setQ_hit(int q_hit) {
		this.q_hit = q_hit;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	@Override
	public String toString() {
		return "QnaBoard [q_num=" + q_num + ", q_title=" + q_title + ", q_date=" + q_date + ", q_content=" + q_content
				+ ", q_hit=" + q_hit + ", m_id=" + m_id + "]";
	}
}
