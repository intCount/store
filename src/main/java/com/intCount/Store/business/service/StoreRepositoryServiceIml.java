package com.intCount.Store.business.service;

import org.springframework.stereotype.Service;

import com.intCount.Store.common.model.ItemsEntity;

@Service
public class StoreRepositoryServiceIml implements StoreRepositoryService {
	
	
	protected final Repository repository;

	@Autowired
	public VoteRepositoryServiceImpl(Repository repository) {

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
