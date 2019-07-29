package com.intCount.Store.web.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intCount.Store.common.Constant;
import com.intCount.Store.common.dto.ItemsDto;
import com.intCount.Store.web.service.StoreService;


@RestController
@RequestMapping("/" + StoreController.URL)
public class StoreController {

	public final static String URL = "store";

	protected final StoreService storeService;

	@Autowired
	public StoreController(StoreService storeService) {
		if (storeService == null) {
			throw new IllegalArgumentException("storeApplicationService is null");
		}
		this.storeService = storeService;
	}

	@GetMapping(value = Constant.ITEMS, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> getItemName() {

		List<ItemsDto> itemDto = storeService.getAllItems();

		return new ResponseEntity<>(itemDto, HttpStatus.OK);
	}

}
