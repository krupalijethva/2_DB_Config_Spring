package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "obstruction")
public class Obstruction {

	@Id
	@Column(name = "obst_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long obst_Id;
	
	@Column(name="leftval")
	private int left;

	@Column(name="top")
	private int top;

	@Column(name="height")
	private int height;

	@Column(name="width")
	private int width;
	
	@Column(name="type")
	private String type;
	
	@Column(name="fill")
	private String fill;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doc_Id", nullable = true)
	private Document document;
	
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public long getObst_Id() {
		return obst_Id;
	}

	public void setObst_Id(long obst_Id) {
		this.obst_Id = obst_Id;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFill() {
		return fill;
	}

	public void setFill(String fill) {
		this.fill = fill;
	}

	
}
