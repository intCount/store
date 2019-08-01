package com.intCount.Store.business;

import java.util.List;

import com.intCount.Store.common.model.ItemsEntity;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Repository
@Transactional
public interface Repository {
	
	List<ItemsEntity> findAllItems();

}
