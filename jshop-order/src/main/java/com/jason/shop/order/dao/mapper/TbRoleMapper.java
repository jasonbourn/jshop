package com.jason.shop.order.dao.mapper;

import com.jason.shop.order.dao.model.TbRole;
import java.util.List;

public interface TbRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRole record);

    TbRole selectByPrimaryKey(Integer id);

    List<TbRole> selectAll();

    int updateByPrimaryKey(TbRole record);
}