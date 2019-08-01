package com.intCount.Store.application.service;

import java.util.List;

import com.intCount.Store.common.model.ItemsEntity;
import org.springframework.stereotype.Service;



@Service
public interface StoreRepositoryService {
	
	List<ItemsEntity> getAllItems();

}

