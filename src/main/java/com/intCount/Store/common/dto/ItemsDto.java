package com.intCount.Store.common.dto;

public class ItemsDto {

	private String name;

	public ItemsDto(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ItemsDto [name=" + name + "]";
	}

}
