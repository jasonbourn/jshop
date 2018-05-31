package com.jason.shop.order.dao.mapper;

import com.jason.shop.order.dao.model.TbMember;
import java.util.List;

public interface TbMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbMember record);

    TbMember selectByPrimaryKey(Long id);

    List<TbMember> selectAll();

    int updateByPrimaryKey(TbMember record);
}