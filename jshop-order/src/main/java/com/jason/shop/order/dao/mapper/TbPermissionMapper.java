package com.jason.shop.order.dao.mapper;

import com.jason.shop.order.dao.model.TbPermission;
import java.util.List;

public interface TbPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPermission record);

    TbPermission selectByPrimaryKey(Integer id);

    List<TbPermission> selectAll();

    int updateByPrimaryKey(TbPermission record);
}