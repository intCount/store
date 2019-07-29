package com.intCount.Store.application.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.intCount.Store.common.dto.ItemsDto;
import com.intCount.Store.web.service.StoreApplicationService;

@Service
public class StoreApplicationServiceImpl implements StoreApplicationService {

	@Override
	//@Query(value = "SELECT * FROM item")
	public List<ItemsDto> getAllItems() {
		// TODO Auto-generated method stub

		return null;
	}

}
