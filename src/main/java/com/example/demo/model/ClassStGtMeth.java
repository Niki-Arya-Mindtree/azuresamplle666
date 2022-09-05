package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="hahha")
public class ClassStGtMeth {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String Name;
	
	public ClassStGtMeth() {
		super();
	}
	public ClassStGtMeth(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	

}
