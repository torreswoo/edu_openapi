package com.multi.contactweb.biz.vo;

//CREATE Table contact (
//	no 		NUMBER 			PRIMARY KEY,
//	name	VARCHAR2(10)	NOT NULL,
//	tel		VARCHAR2(20)	NOT NULL
//);
public class Contact {

	private int no;
	private String name;
	private String tel;
	
	public Contact() {
		super();
	}
	public Contact(int no, String name, String tel) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}