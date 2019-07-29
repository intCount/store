package com.intCount.Store.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intCount.Store.common.model.ItemsEntity;


@Service
public interface StoreRepositoryService {
	
	List<ItemsEntity> getAllItems();

}

