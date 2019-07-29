package com.intCount.Store.infrastructure.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.intCount.Store.common.dto.ItemsDto;
import com.intCount.Store.common.model.ItemsEntity;

public class StoreDataMapper {

	@Autowired
	public StoreDataMapper() {
	}

	public ItemsDto mapItemsEntityToItemsDto(ItemsEntity itemsEntity) {
		return new ItemsDto(itemsEntity.getName());
	}

	public List<ItemsDto> mapItemsEntitiesToItemsDtos(List<ItemsEntity> itemsEntities) {
		return itemsEntities.stream().map(s -> mapItemsEntityToItemsDto(s)).collect(Collectors.toList());
	}

}
