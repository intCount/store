package com.intCount.Store.business;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.intCount.Store.common.model.ItemsEntity;

@org.springframework.stereotype.Repository
@Transactional
public interface Repository {
	
	List<ItemsEntity> findAllItems();

}
