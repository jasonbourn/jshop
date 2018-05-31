package com.jason.shop.order.dao.mapper;

import com.jason.shop.order.dao.model.TbItemDesc;
import java.util.List;

public interface TbItemDescMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(TbItemDesc record);

    TbItemDesc selectByPrimaryKey(Long itemId);

    List<TbItemDesc> selectAll();

    int updateByPrimaryKey(TbItemDesc record);
}