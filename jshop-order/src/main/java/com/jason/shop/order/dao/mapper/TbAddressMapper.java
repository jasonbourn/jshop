package com.jason.shop.order.dao.mapper;

import com.jason.shop.order.dao.model.TbAddress;
import java.util.List;

public interface TbAddressMapper {
    int deleteByPrimaryKey(Long addressId);

    int insert(TbAddress record);

    TbAddress selectByPrimaryKey(Long addressId);

    List<TbAddress> selectAll();

    int updateByPrimaryKey(TbAddress record);
}