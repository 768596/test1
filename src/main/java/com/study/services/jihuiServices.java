package com.study.services;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.model.dao.jihuiDao;
import com.study.model.mapper.jihuiMapper;
import com.study.pojo.Jihui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class jihuiServices {
    @Autowired
    private jihuiMapper mapper;
    @Autowired
    private jihuiDao dao;
//    增改
    public Integer update(Jihui jihui){
        jihui =dao.save(jihui);
        return jihui.getJid();
    }
//    删除
    public  Integer deleteByid(Integer jid){
    dao.deleteById(jid);
    return 1;
    }
//    分页和事务都应改写在业务层
     public PageInfo<Jihui> selectAll(Integer pageNo,Integer pageSize){
         PageHelper.startPage(pageNo,pageSize); //开启分页模式
         List<Jihui> list=mapper.selectAll();  //调用查询方法
         return new PageInfo<>(list);          //将查询结果封装到PageInfo对象里
     }
    public PageInfo<Jihui> selectByChoose(Integer pageNo,Integer pageSize,Jihui jihui){
        PageHelper.startPage(pageNo,pageSize); //开启分页模式
        List<Jihui> list=mapper.selectByChooseE(jihui);  //调用查询方法
        return new PageInfo<>(list);          //将查询结果封装到PageInfo对象的
    }
//    根据主键查询
    public Jihui selectById(Integer jid){
        return mapper.selectById(jid);
    }
}
