package com.jason.shop.order.dao.mapper;

import com.jason.shop.order.dao.model.TbLog;
import java.util.List;

public interface TbLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbLog record);

    TbLog selectByPrimaryKey(Integer id);

    List<TbLog> selectAll();

    int updateByPrimaryKey(TbLog record);
}