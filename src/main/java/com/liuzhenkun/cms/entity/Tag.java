package com.liuzhenkun.cms.entity;

public class Tag {
	/**  **/
	private Integer id;
	/** 标签名称 **/
	private String tagname;
	public Tag(Integer id, String tagname) {
		super();
		this.id = id;
		this.tagname = tagname;
	}
	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTagname() {
		return tagname;
	}
	public void setTagname(String tagname) {
		this.tagname = tagname;
	}
	@Override
	public String toString() {
		return "cms_tag [id=" + id + ", tagname=" + tagname + "]";
	}
	
}
