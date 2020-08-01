package com.training.practice.encapsulation;

/*  1. declare variables as private
 * POJO -->setters and getters
 * */

public class Encap1 {
	private String name;
	private int id;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

}
