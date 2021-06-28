package com.study.model.mapper;

import com.study.pojo.Jihui;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface jihuiMapper {
    List<Jihui> selectAll();

//多条件组合查询
List<Jihui> selectByChooseE(Jihui jihui);
//根据主键查询
Jihui selectById(Integer jid);
}
