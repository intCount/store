package com.intCount.Store.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.intCount.Store.business.Repository;
import com.intCount.Store.common.model.ItemsEntity;
import com.intCount.Store.repository.dao.ItemsDao;

@org.springframework.stereotype.Repository
@Transactional
public class RepositoryImpl implements Repository {

	protected final ItemsDao itemsDao;

	@Autowired
	public RepositoryImpl(ItemsDao itemsDao) {

		this.itemsDao = itemsDao;
	}

	@Override
	public List<ItemsEntity> findAllItems() {
		// TODO Auto-generated method stub
		return itemsDao.findAll();
	}

}