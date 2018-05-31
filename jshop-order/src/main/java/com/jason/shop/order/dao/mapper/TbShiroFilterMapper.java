package com.jason.shop.order.dao.mapper;

import com.jason.shop.order.dao.model.TbShiroFilter;
import java.util.List;

public interface TbShiroFilterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbShiroFilter record);

    TbShiroFilter selectByPrimaryKey(Integer id);

    List<TbShiroFilter> selectAll();

    int updateByPrimaryKey(TbShiroFilter record);
}