package com.example.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "room")
public class Room {

	@Id
	@Column(name = "room_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long room_Id;

	@Column(name = "leftval")
	private int left;

	@Column(name = "top")
	private int top;

	@Column(name = "height")
	private int height;

	@Column(name = "width")
	private int width;

	@Column(name = "type")
	private String type;


	@Column(name = "topA")
	private int topA;
	
	@Column(name = "rightB")
	private int rightB;	
	
	@Column(name = "leftD")
	private int leftD;
	
	@Column(name = "bottomC")
	private int bottomC;	
	
	@Column(name = "aval")
	private int Aval;	
	
	@Column(name = "bval")
	private int Bval;		
	
	@JsonIgnore
	@OneToMany(mappedBy = "room", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Door> doors=new HashSet<>();		
	
	public Set<Door> getDoors() {
		return doors;
	}

	public void setDoors(Set<Door> doors) {
		this.doors = doors;
	}

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

	public int getTopA() {
		return topA;
	}

	public void setTopA(int topA) {
		this.topA = topA;
	}

	public int getRightB() {
		return rightB;
	}

	public void setRightB(int rightB) {
		this.rightB = rightB;
	}

	public int getLeftD() {
		return leftD;
	}

	public void setLeftD(int leftD) {
		this.leftD = leftD;
	}

	public int getBottomC() {
		return bottomC;
	}

	public void setBottomC(int bottomC) {
		this.bottomC = bottomC;
	}


	public int getAval() {
		return Aval;
	}

	public void setAval(int aval) {
		Aval = aval;
	}

	public int getBval() {
		return Bval;
	}

	public void setBval(int bval) {
		Bval = bval;
	}

	public long getRoom_Id() {
		return room_Id;
	}

	public void setRoom_Id(long room_Id) {
		this.room_Id = room_Id;
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

	
}
