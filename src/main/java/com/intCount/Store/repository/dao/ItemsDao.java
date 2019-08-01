package com.intCount.Store.repository.dao;

import java.util.List;

import com.intCount.Store.common.model.ItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsDao extends JpaRepository<ItemsEntity, String> {

	List<ItemsEntity> findAll();
}
