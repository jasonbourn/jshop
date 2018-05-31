package com.jason.shop.order.dao.mapper;

import com.jason.shop.order.dao.model.TbThanks;
import java.util.List;

public interface TbThanksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbThanks record);

    TbThanks selectByPrimaryKey(Integer id);

    List<TbThanks> selectAll();

    int updateByPrimaryKey(TbThanks record);
}