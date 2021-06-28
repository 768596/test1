package com.study.services;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.model.mapper.OrderMapper;
import com.study.pojo.Orderformm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(rollbackFor = Exception.class)
public class Orderservices {
    @Autowired
    private OrderMapper mapper;
    public PageInfo<Orderformm> selectAll(Integer pageNo, Integer pageSize){
//        com.github.pagehelper.PageHelper
        PageHelper.startPage(pageNo,pageSize);
        List<Orderformm> list = mapper.selectAll();
        PageInfo<Orderformm> pageInfo = PageInfo.of(list);
        return pageInfo;
    }
    public List<Orderformm> selectAll(){
        return mapper.selectAll();
    }
}
