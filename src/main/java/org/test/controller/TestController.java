package org.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.mapper.MoneyMapper;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private MoneyMapper moneyMapper;


    @GetMapping("test")
    public List test(){
        return moneyMapper.selectAll();
    }


}
