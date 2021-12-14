package com.devsuperior.dscatalog.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dscatalog.entities.Category;

public class CategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Instant updatedAt;

	public CategoryDTO() {

	}

	public CategoryDTO(Long id, String name, Instant updatedAt) {
		this.id = id;
		this.name = name;
		this.updatedAt = updatedAt;
	}

	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.updatedAt = entity.getUpdatedAt();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}
	
}
