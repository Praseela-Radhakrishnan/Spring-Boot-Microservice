package com.prasee.itemService.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Item {

	private int id;
	private String name;
	private String url;

	public Item() {
		super();
	}

	public Item(int id, String name, String url) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", url=" + url + "]";
	}

}
