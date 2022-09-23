package com.example.microservices.comments.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="comment")
public class Comments {
	
	@Id
	int cid;
	
	
	
	@Column
	String commentor;
	
	@Column
	int pid;
	
	@Column
	String comment;
	
	public Comments() {
		
	}

	public Comments(int cid, int pid, String commentor, String comment) {
		super();
		this.cid = cid;
		this.pid = pid;
		this.commentor = commentor;
		this.comment = comment;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getCommentor() {
		return commentor;
	}

	public void setCommenter(String commentor) {
		this.commentor = commentor;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
