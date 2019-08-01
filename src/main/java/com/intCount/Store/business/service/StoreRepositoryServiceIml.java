package com.intCount.Store.business.service;

import com.intCount.Store.application.service.StoreRepositoryService;
import com.intCount.Store.business.Repository;
import com.intCount.Store.common.model.ItemsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreRepositoryServiceIml implements StoreRepositoryService {
	
	
	protected final Repository repository;

	@Autowired
	public StoreRepositoryServiceIml(Repository repository) {

		if(repository == null) {
			throw new IllegalArgumentException("repository is null");
		}

		this.repository = repository;
	}
	
	@Override
	public List<ItemsEntity> getAllItems(){
		return  repository.findAllItems();
		
	}
	
	

}
