package com.intCount.Store.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StoreController {

    @RequestMapping
    public String display(){
        return "Hello World !!";
    }
}
