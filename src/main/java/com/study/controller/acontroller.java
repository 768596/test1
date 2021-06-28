package com.study.controller;

import com.github.pagehelper.PageInfo;
import com.study.pojo.Orderformm;
import com.study.services.Orderservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/a")
@CrossOrigin
public class acontroller {
    @Autowired
    private Orderservices es;
    @GetMapping
    public List<Orderformm> selectByPager(){

        return es.selectAll();
    }
    @GetMapping("/b")
    public PageInfo<Orderformm>
    selectByPager(@RequestParam(value = "no",defaultValue = "1")Integer no,
                  @RequestParam(value = "size",defaultValue = "10")Integer size){
        return es.selectAll(no,size);
    }
}
