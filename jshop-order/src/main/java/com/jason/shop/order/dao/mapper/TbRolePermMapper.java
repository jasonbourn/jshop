package com.jason.shop.order.dao.mapper;

import com.jason.shop.order.dao.model.TbRolePerm;
import java.util.List;

public interface TbRolePermMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRolePerm record);

    TbRolePerm selectByPrimaryKey(Integer id);

    List<TbRolePerm> selectAll();

    int updateByPrimaryKey(TbRolePerm record);
}