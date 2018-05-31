package com.jason.shop.order.dao.mapper;

import com.jason.shop.order.dao.model.TbBase;
import java.util.List;

public interface TbBaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbBase record);

    TbBase selectByPrimaryKey(Integer id);

    List<TbBase> selectAll();

    int updateByPrimaryKey(TbBase record);
}