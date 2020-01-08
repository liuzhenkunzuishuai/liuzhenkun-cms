package com.liuzhenkun.cms.entity;

public class ArticleTag {
	/** 文章Id **/
	private Integer aid;
	/** 标签Id **/
	private Integer tid;
	public ArticleTag(Integer aid, Integer tid) {
		super();
		this.aid = aid;
		this.tid = tid;
	}
	public ArticleTag() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "cms_article_tag [aid=" + aid + ", tid=" + tid + "]";
	}
	
}
