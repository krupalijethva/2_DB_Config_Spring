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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "document")
public class Document {
	
	@Id
	@Column(name = "doc_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long doc_Id;
	
	@Column(name="filename")
	private String filename;	
	
	@JsonIgnore
	@OneToMany(mappedBy = "document", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Set<Room> rooms=new HashSet<>();	

	
	@OneToMany(mappedBy = "document", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Set<Door> doors=new HashSet<>();	
	

	@OneToMany(mappedBy = "document", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Set<Obstruction> obstructions=new HashSet<>();

	@Override
	public String toString() {
		return "Document [doc_Id=" + doc_Id + ", filename=" + filename + ", rooms=" + rooms + ", doors=" + doors
				+ ", obstructions=" + obstructions + "]";
	}

	public long getDoc_Id() {
		return doc_Id;
	}

	public void setDoc_Id(long doc_Id) {
		this.doc_Id = doc_Id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Set<Room> getRooms() {
		return rooms;
	}

	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

	public Set<Door> getDoors() {
		return doors;
	}

	public void setDoors(Set<Door> doors) {
		this.doors = doors;
	}

	public Set<Obstruction> getObstructions() {
		return obstructions;
	}

	public void setObstructions(Set<Obstruction> obstructions) {
		this.obstructions = obstructions;
	}

}
