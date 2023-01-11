package com.luanpinheiro.dscatalog.entitites;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String Category;
	
	public Category() {
	}

	public Category(Long id, String category) {
		this.id = id;
		Category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id);
	}

}
