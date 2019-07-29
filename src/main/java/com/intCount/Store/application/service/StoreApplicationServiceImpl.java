package com.intCount.Store.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intCount.Store.common.dto.ItemsDto;
import com.intCount.Store.common.model.ItemsEntity;
import com.intCount.Store.infrastructure.mapper.StoreDataMapper;
import com.intCount.Store.web.service.StoreService;

@Service
public class StoreApplicationServiceImpl implements StoreService {
	
	
	protected final StoreDataMapper storeDataMapper;

	protected final StoreRepositoryService storeRepositoryService;

	@Autowired
	public StoreApplicationServiceImpl(StoreRepositoryService storeRepositoryService,
			StoreDataMapper storeDataMapper){

		if(storeRepositoryService == null) {
			throw new IllegalArgumentException("storeRepositoryService is null");
		}
		if(storeDataMapper == null) {
			throw new IllegalArgumentException("storeDataMapper is null");
		}

		this.storeRepositoryService = storeRepositoryService;
		this.storeDataMapper = storeDataMapper;
	}

	@Override
	public List<ItemsDto> getAllItems() {
		// TODO Auto-generated method stub
		
		List<ItemsEntity> itemsEntities = storeRepositoryService.getAllItems();
		return storeDataMapper.mapItemsEntitiesToItemsDtos(itemsEntities);
	}



}
