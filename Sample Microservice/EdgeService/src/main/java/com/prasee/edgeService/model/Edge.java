package com.prasee.edgeService.model;

import java.util.List;

public class Edge {

	private int id;
	private List<Object> images;

	public Edge() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Object> getImages() {
		return images;
	}

	public void setImages(List<Object> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "Edge [id=" + id + ", images=" + images + "]";
	}

}
