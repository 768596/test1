package com.study.model.mapper;


import com.study.pojo.Orderformm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<Orderformm> selectAll();

}
