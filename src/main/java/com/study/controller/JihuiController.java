package com.study.controller;

import com.github.pagehelper.PageInfo;
import com.study.pojo.Jihui;
import com.study.services.jihuiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jh")
public class JihuiController {
    @Autowired
    private jihuiServices services;
    @GetMapping//get用于获取数据
    public PageInfo<Jihui> selectByPager(Integer pageNo,Integer pagesize){
        return services.selectAll(pageNo,pagesize);
    }
    @GetMapping("search")
    public PageInfo<Jihui> selectSearch(@ModelAttribute Jihui jihui,Integer pageNo,Integer pageSize){
        PageInfo<Jihui> pageInfo=services.selectByChoose(pageNo,pageSize,jihui);
        System.out.println(jihui);
        System.out.println(pageNo);
        System.out.println(pageSize);
        System.out.println(pageInfo);
        return services.selectByChoose(pageNo,pageSize,jihui);
    }
    @PutMapping("a")//put请求处理数据更新
    public Integer update(@ModelAttribute Jihui jihui){
        return services.update(jihui);
    }
    @PostMapping
    public Jihui selectById(Integer jid){
        return  services.selectById(jid);
    }
    @DeleteMapping("/deleteById/{id}")
    public Integer deleteByID(@PathVariable("id") Integer jid){

    Integer i=     services.deleteByid(jid);
        System.out.println(i);
        return 1;
    }
}
