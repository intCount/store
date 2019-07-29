package com.intCount.Store.repository.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intCount.Store.common.model.ItemsEntity;

public interface ItemsDao extends JpaRepository<ItemsEntity, String> {

	List<ItemsEntity> findAll();
}
